/**
 * Created by MAC on 5/17/14.
 */
package com.chess.pieces;

import junit.framework.TestCase;

public class PawnTest extends TestCase {
    public void testCreate() {
        final String white = "white";
        final String black = "black";

        Pawn pawn1 = Pawn.createPawn(white);
        assertEquals("white", pawn1.getColor());

        Pawn pawn2 = Pawn.createPawn(black);
        assertEquals("black", pawn2.getColor());

        Pawn pawn3 = new Pawn();
        assertEquals("white", pawn3.getColor());
    }
}
