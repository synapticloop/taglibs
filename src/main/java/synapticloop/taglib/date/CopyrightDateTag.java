package synapticloop.taglib.date;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

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

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTagSupport;

public class CopyrightDateTag extends BodyTagSupport {
	private static final long serialVersionUID = 4530945952130590812L;

	private static final String DEFAULT_SEPARATOR = " - ";
	private static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("yyyy");

	private String startDate = null;
	private String separator = DEFAULT_SEPARATOR;

	@Override
	public int doEndTag() throws JspException {
		String currentDate = SIMPLE_DATE_FORMAT.format(new Date(System.currentTimeMillis()));

		if(null != startDate && startDate.compareTo(currentDate) != 0) {
				writeSilent(startDate);
				writeSilent(separator);
		}

		writeSilent(currentDate);
		return(EVAL_PAGE);
	}

	private void writeSilent(String output) {
		try {
			pageContext.getOut().write(output);
		} catch (IOException ex) {
			// nothing we can do...
		}
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getSeparator() {
		return separator;
	}

	public void setSeparator(String separator) {
		this.separator = separator;
	}

	@Override
	public void release() {
		super.release();
		this.startDate = null;
		this.separator = DEFAULT_SEPARATOR;
	}

}
