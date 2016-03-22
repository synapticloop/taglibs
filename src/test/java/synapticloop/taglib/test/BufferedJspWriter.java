package synapticloop.taglib.test;

/*
 * Copyright (c) 2016 Synapticloop.
 * 
 * All rights reserved.
 * 
 * This code may contain contributions from other parties which, where 
 * applicable, will be listed in the default build file for the project 
 * ~and/or~ in a file named CONTRIBUTORS.txt in the root of the project.
 * 
 * This source code and any derived binaries are covered by the terms and 
 * conditions of the Licence agreement ("the Licence").  You may not use this 
 * source code or any derived binaries except in compliance with the Licence.  
 * A copy of the Licence is available in the file named LICENSE.txt shipped with 
 * this source code or binaries.
 */

import java.io.IOException;

import javax.servlet.jsp.JspWriter;

public class BufferedJspWriter extends JspWriter {
	public static StringBuffer stringBuffer = new StringBuffer();

	public BufferedJspWriter(int bufferSize, boolean autoFlush) {
		super(bufferSize, autoFlush);
	}

	@Override
	public void write(String output) throws IOException {
		stringBuffer.append(output);
	}

	@Override
	public void write(char[] cbuf, int off, int len) throws IOException {
	}

	public String getContent() throws IOException {
		String content = stringBuffer.toString();
		clear();
		return(content);
	}

	@Override
	public void clear() throws IOException {
		stringBuffer.setLength(0);
	}

	@Override
	public void clearBuffer() throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void flush() throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public int getRemaining() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void newLine() throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void print(boolean arg0) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void print(char arg0) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void print(int arg0) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void print(long arg0) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void print(float arg0) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void print(double arg0) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void print(char[] arg0) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void print(String arg0) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void print(Object arg0) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void println() throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void println(boolean arg0) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void println(char arg0) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void println(int arg0) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void println(long arg0) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void println(float arg0) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void println(double arg0) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void println(char[] arg0) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void println(String arg0) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void println(Object arg0) throws IOException {
		// TODO Auto-generated method stub

	}

}
