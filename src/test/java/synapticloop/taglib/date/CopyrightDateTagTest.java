package synapticloop.taglib.date;

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

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.mockito.MockitoAnnotations.*;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import synapticloop.taglib.test.BufferedJspWriter;

public class CopyrightDateTagTest {
	private CopyrightDateTag copyrightDateTag = null;
	private static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("yyyy");

	@Mock PageContext mockPageContext;

	private BufferedJspWriter testJspWriter = new BufferedJspWriter(1024, true);
	private static final String currentYear = SIMPLE_DATE_FORMAT.format(new Date(System.currentTimeMillis()));

	@Before
	public void before() {
		initMocks(this);
		copyrightDateTag = new CopyrightDateTag();
		copyrightDateTag.setPageContext(mockPageContext);
		when(mockPageContext.getOut()).thenReturn(testJspWriter);

		copyrightDateTag.release();
	}

	@Test
	public void testEmptyTags() throws JspException, IOException {
		copyrightDateTag.doEndTag();
		// now test the buffer
		assertEquals(currentYear, testJspWriter.getContent());
	}

	@Test
	public void testStartCurrentSame() throws JspException, IOException {
		copyrightDateTag.setStartYear(currentYear);
		copyrightDateTag.doEndTag();
		// now test the buffer
		assertEquals(currentYear, testJspWriter.getContent());
	}

	@Test
	public void testStartCurrentDifferent() throws JspException, IOException {
		copyrightDateTag.setStartYear("2015");
		copyrightDateTag.doEndTag();
		// now test the buffer
		assertEquals("2015" + " - " + currentYear, testJspWriter.getContent());
	}

	@Test
	public void testStartCurrentDifferentSeparator() throws JspException, IOException {
		copyrightDateTag.setStartYear("2015");
		copyrightDateTag.setSeparator(" all the way up to ");
		copyrightDateTag.doEndTag();
		// now test the buffer
		assertEquals("2015" + " all the way up to " + currentYear, testJspWriter.getContent());
	}

	@Test
	public void testRelease() throws JspException, IOException {
		copyrightDateTag.setStartYear("2015");
		assertEquals("2015", copyrightDateTag.getStartYear());
		copyrightDateTag.setSeparator(" all the way up to ");
		assertEquals(" all the way up to ", copyrightDateTag.getSeparator());
		copyrightDateTag.release();
		assertEquals(null, copyrightDateTag.getStartYear());
		assertEquals(" - ", copyrightDateTag.getSeparator());
	}

}
