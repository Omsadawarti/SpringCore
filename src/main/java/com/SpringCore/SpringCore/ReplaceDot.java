package com.SpringCore.SpringCore;

public interface ReplaceDot {
	
 public static String replaceIt(String str)
{
	 str = str.replace('.', '/') ;
	return str;
}
}
