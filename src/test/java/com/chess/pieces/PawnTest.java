/**
 * Created by MAC on 5/17/14.
 */
package com.chess.pieces;

import junit.framework.TestCase;

public class PawnTest extends TestCase {
    final String white = "white";
    final String black = "black";

    Pawn pawn1, pawn2, pawn3;

    public void setUp() {
        pawn1 = Pawn.createPawn(white);
        pawn2 = Pawn.createPawn(black);
        pawn3 = new Pawn();
    }

    public void testCreate() {
        assertEquals("white", pawn1.getColor());
        assertEquals("black", pawn2.getColor());
        assertEquals("white", pawn3.getColor());
    }

    public void testPrintFormat() {
        assertEquals("p", pawn1.getPrintFormat());
        assertEquals("P", pawn2.getPrintFormat());
        assertEquals("p", pawn3.getPrintFormat());

    }
}
