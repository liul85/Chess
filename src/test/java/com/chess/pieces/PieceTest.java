/**
 * Created by MAC on 5/17/14.
 */
package com.chess.pieces;

import junit.framework.TestCase;
import org.junit.Test;

public class PieceTest extends TestCase {

    Piece piece1, piece2;

    public void setUp() {
        piece1 = Piece.createPawn(Piece.Names.P, Piece.Colors.White);
        piece2 = Piece.createPawn(Piece.Names.P, Piece.Colors.Black);
    }

    @Test
    public void testCreate() {
        assertEquals("White", piece1.getColor());
        assertEquals("Black", piece2.getColor());
    }

    @Test
    public void testPrintFormat() {
        assertEquals("p", piece1.getPrintFormat());
        assertEquals("P", piece2.getPrintFormat());
    }
}
