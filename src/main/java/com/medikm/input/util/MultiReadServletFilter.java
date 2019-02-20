/**
 * 
 */
package com.medikm.input.util;

import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.json.JSONException;
import org.json.JSONObject;

public class MultiReadServletFilter implements Filter {

	private static final Set<String> MULTI_READ_HTTP_METHODS = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER) {
		private static final long serialVersionUID = 1L;
		{
			// Enable Multi-Read for PUT and POST requests
			add("PUT");
			add("POST");
		}
	};
	
	private Scanner scanner;

	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {
		if (servletRequest instanceof HttpServletRequest) {
			HttpServletRequest request = (HttpServletRequest) servletRequest;
			// Check wether the current request needs to be able to support the body to be read multiple times
			if (MULTI_READ_HTTP_METHODS.contains(request.getMethod())) {
				// Override current HttpServletRequest with custom implementation
				try {
					MultiReadHttpServletRequest mr = new MultiReadHttpServletRequest(request);
					String s = extractPostRequestBody(mr);
					JSONObject ob = new JSONObject(s);
					String[] arr = JSONObject.getNames(ob);
					for (String string : arr) {
						if (ob.getString(string).toUpperCase().contains("<SCRIPT>")) {
							ob.remove(string);
							// ob.append(string, "");
						}
					}
					String s1 = ob.toString();
					mr.setBody(s1.getBytes());
					filterChain.doFilter(mr, servletResponse);
					return;
				} catch (JSONException ex) {
					ex.printStackTrace();
				}
				return;
			}
		}
		filterChain.doFilter(servletRequest, servletResponse);
	}

	public void init(FilterConfig filterConfig) throws ServletException {
	}

	public void destroy() {
	}

	private String extractPostRequestBody(HttpServletRequest request) {
		if ("POST".equalsIgnoreCase(request.getMethod())) {
			Scanner s = null;
			try {
				scanner = new Scanner(request.getInputStream(), "UTF-8");
				s = scanner.useDelimiter("\\A");
			} catch (IOException e) {
				e.printStackTrace();
			}
			return s.hasNext() ? s.next() : "";
		}
		return "";
	}
}