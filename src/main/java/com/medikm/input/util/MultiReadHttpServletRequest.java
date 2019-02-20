/**
 * 
 */
package com.medikm.input.util;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class MultiReadHttpServletRequest extends HttpServletRequestWrapper {

	private byte[] body;

	public MultiReadHttpServletRequest(HttpServletRequest httpServletRequest) {
		super(httpServletRequest);
		// Read the request body and save it as a byte array
		try {
			InputStream is = super.getInputStream();
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			body = new byte[super.getContentLength()];
			while ((nRead = is.read(body, 0, body.length)) != -1) {
				buffer.write(body, 0, nRead);
			}

			buffer.flush();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public void setBody(byte[] body) {
		this.body = body;
	}

	@Override
	public ServletInputStream getInputStream() throws IOException {
		return new ServletInputStreamImpl(new ByteArrayInputStream(body));
	}

	@Override
	public BufferedReader getReader() throws IOException {
		String enc = getCharacterEncoding();
		if (enc == null)
			enc = "UTF-8";
		return new BufferedReader(new InputStreamReader(getInputStream(), enc));
	}

	private class ServletInputStreamImpl extends ServletInputStream {

		private InputStream is;

		public ServletInputStreamImpl(InputStream is) {
			this.is = is;
		}

		public int read() throws IOException {
			return is.read();
		}

		public boolean markSupported() {
			return false;
		}

		public synchronized void mark(int i) {
			throw new RuntimeException(new IOException("mark/reset not supported"));
		}

		public synchronized void reset() throws IOException {
			throw new IOException("mark/reset not supported");
		}
	}

}
