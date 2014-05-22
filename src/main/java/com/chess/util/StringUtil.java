package com.chess.util;

/**
 * Created by MAC on 5/22/14.
 */
public class StringUtil {
    public static final String NEWLINE = System.getProperty("line.separator");
    public static String appendNewLine (String content) {
        return content + NEWLINE;
    }
}
