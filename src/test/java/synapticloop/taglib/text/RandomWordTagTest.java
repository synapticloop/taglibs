package synapticloop.taglib.text;

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

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import synapticloop.taglib.test.BufferedJspWriter;

public class RandomWordTagTest {
	private RandomWordTag randomWordTag = null;

	@Mock PageContext mockPageContext;

	private BufferedJspWriter testJspWriter = new BufferedJspWriter(1024, true);

	@Before
	public void before() {
		initMocks(this);
		randomWordTag = new RandomWordTag();
		randomWordTag.setPageContext(mockPageContext);
		when(mockPageContext.getOut()).thenReturn(testJspWriter);
	}

	@After
	public void after() {
		randomWordTag.release();
	}

	@Test
	public void testEmptyWords() throws JspException, IOException {
		randomWordTag.doEndTag();
		assertEquals("", testJspWriter.getContent());
	}

	@Test
	public void testOneWord() throws JspException, IOException {
		randomWordTag.setWords("hello");
		randomWordTag.doEndTag();
		assertEquals("hello", testJspWriter.getContent());
	}

	@Test
	public void testWords() throws JspException, IOException {
		String words = "hello,there,baby";
		randomWordTag.setWords(words);
		randomWordTag.doEndTag();
		assertTrue(words.contains(testJspWriter.getContent()));
		assertTrue(!testJspWriter.getContent().contains(","));
	}

	@Test
	public void testWordDelimeter() throws JspException, IOException {
		String words = "hello§there§baby";
		randomWordTag.setWords(words);
		randomWordTag.setDelimiter("§");
		randomWordTag.doEndTag();
		assertTrue(words.contains(testJspWriter.getContent()));
		assertTrue(!testJspWriter.getContent().contains("§"));
	}

}
