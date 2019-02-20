
package com.medikm.input.controller;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.medikm.input.exception.MedikmAuthenticationFailureException;
import com.medikm.input.response.MedikmResponse;
import com.medikm.input.util.MedikmConstants;

/**
 * A default handler exception resolver to ensure that all exceptions are
 * written to the application log file. The HTTP response status code will be
 * set to 500 and a <code>MedikmResponse</code> will be returned with a response
 * code of 500 and the exception message.
 *
 * @author LMS
 */
public class DefaultHandlerExceptionResolver implements HandlerExceptionResolver {
	
	private Log log = LogFactory.getLog(DefaultHandlerExceptionResolver.class);

	private int httpResponseStatusCode = HttpServletResponse.SC_INTERNAL_SERVER_ERROR;

	private String trResponseCode = MedikmConstants.DEFAULT_SERVER_ERROR_RESPONSE_CODE;

	/**
	 * Initializes a new <code>DefaultHandlerExceptionResolver</code> instance.
	 */
	public DefaultHandlerExceptionResolver() {
	}

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		log.error("Exception in handler " + handler + ".", ex);

		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(SerializationConfig.Feature.INDENT_OUTPUT, true);

		MedikmResponse resp = new MedikmResponse();

		if (ex instanceof MedikmAuthenticationFailureException) {
			response.setStatus(MedikmConstants.AUTHENTICATION_FAILURE_CODE);
			response.setContentType("application/json");
			resp.setResponseCode(String.valueOf(MedikmConstants.AUTHENTICATION_FAILURE_CODE));
			resp.setResponseMessage(MedikmConstants.AUTHENTICATION_FAILURE_MESSAGE);
		} else {
			response.setStatus(httpResponseStatusCode);
			response.setContentType("application/json");
			resp.setResponseCode(trResponseCode);
			resp.setResponseMessage("The server encountered an error.");
		}

		Writer writer = null;
		try {
			writer = response.getWriter();
			mapper.writeValue(writer, resp);
		} catch (Exception e) {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException ignore) {
				}
			}
		}

		return null;
	}

	public void setHttpResponseStatusCode(int httpResponseStatusCode) {
		this.httpResponseStatusCode = httpResponseStatusCode;
	}

	public void setILikeResponseCode(String trResponseCode) {
		this.trResponseCode = trResponseCode;
	}
}
