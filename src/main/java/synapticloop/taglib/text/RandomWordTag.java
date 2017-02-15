package synapticloop.taglib.text;

/*
 * Copyright (c) 2017 Synapticloop.
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
import java.util.Random;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTagSupport;



public class RandomWordTag extends BodyTagSupport {
	private static final long serialVersionUID = -7725962720455459799L;

	private static final String DEFAULT_DELIMITER = ",";
	
	private String words;
	private String delimiter = DEFAULT_DELIMITER;


	@Override
	public int doEndTag() throws JspException {
		if(null != words) {
			String[] split = words.split(delimiter);
			if(split.length > 0) {
				Random random = new Random(System.currentTimeMillis());
				writeSilent(split[random.nextInt(split.length)]);
			}
		}
		return(EVAL_PAGE);
	}

	/**
	 * Silently write the output, swallowing all exceptions
	 * 
	 * @param output the output to write
	 */
	private void writeSilent(String output) {
		try {
			pageContext.getOut().write(output);
		} catch (IOException ex) {
			// nothing we can do...
		}
	}

	public String getWords() {
		return this.words;
	}

	public void setWords(String words) {
		this.words = words;
	}

	public String getDelimiter() {
		return this.delimiter;
	}

	public void setDelimiter(String delimiter) {
		this.delimiter = delimiter;
	}
	
	@Override
	public void release() {
		super.release();
		this.words = null;
		this.delimiter = DEFAULT_DELIMITER;
	}

}
