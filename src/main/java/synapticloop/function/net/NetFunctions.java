package synapticloop.function.net;

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

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class NetFunctions {

	/**
	 * URL encode a string with UTF-8 character encoding, if the encoding cannot
	 * be found, return the original String.
	 * 
	 * @param string the string to encode
	 * 
	 * @return the URL encoded string, or the original string if the encoding is not supported
	 */
	public static String urlEncode(String string) {
		try {
			return(URLEncoder.encode(string, "UTF-8"));
		} catch (UnsupportedEncodingException ex) {
			return(string);
		}
	}

	/**
	 * URL deodec a string with UTF-8 character encoding, if the encoding cannot
	 * be found, return the original String.
	 * 
	 * @param string the string to decode
	 * 
	 * @return the URL decoded string, or the original string if the encoding is not supported
	 */
	public static String urlDecode(String string) {
		try {
			return(URLDecoder.decode(string, "UTF-8"));
		} catch (UnsupportedEncodingException ex) {
			return(string);
		}
	}

}
