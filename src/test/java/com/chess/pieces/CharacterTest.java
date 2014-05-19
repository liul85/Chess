package com.chess.pieces;

import junit.framework.TestCase;

/**
 * Created by MAC on 5/18/14.
 */
public class CharacterTest extends TestCase {
    public void testWhiteSpace() {
        assertEquals(true, Character.isWhitespace(' '));
        assertEquals(true, Character.isWhitespace(' '));
        assertEquals(true, Character.isWhitespace('\r'));
        assertEquals(true, Character.isWhitespace('\n'));
    }
}
