package com.redpois0n.common;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class Base64 {
	
	public static String encode(String s) throws Exception {
		return new BASE64Encoder().encodeBuffer(s.getBytes("UTF-8"));
	}
	
	public static String decode(String s) throws Exception {
		return new String(new BASE64Decoder().decodeBuffer(s));
	}

}
