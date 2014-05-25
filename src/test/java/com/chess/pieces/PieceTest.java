/**
 * Created by MAC on 5/17/14.
 */
package com.chess.pieces;

import junit.framework.TestCase;
import org.junit.Test;

public class PieceTest extends TestCase {

    Piece piece1, piece2;

    public void setUp() {
        piece1 = Piece.createPawn(Piece.Type.PAWN, Piece.Colors.White);
        piece2 = Piece.createPawn(Piece.Type.PAWN, Piece.Colors.Black);
    }

    @Test
    public void testCreate() {
        assertEquals("White", piece1.getColor());
        assertEquals("Black", piece2.getColor());

        verifyCreation(Piece.createWhitePawn(), Piece.createBlackPawn(), Piece.Type.PAWN, Piece.PAWN_REPRESENTATION);
        verifyCreation(Piece.createWhiteRook(), Piece.createBlackRook(), Piece.Type.ROOK, Piece.ROOK_REPRESENTATION);
        verifyCreation(Piece.createWhiteKnight(), Piece.createBlackKnight(), Piece.Type.KNIGHT, Piece.KNIGHT_REPRESENTATION);
        verifyCreation(Piece.createWhiteBishop(), Piece.createBlackBishop(), Piece.Type.BISHOP, Piece.BISHOP_REPRESENTATION);
        verifyCreation(Piece.createWhiteQueen(), Piece.createBlackQueen(), Piece.Type.QUEEN, Piece.QUEEN_REPRESENTATION);
        verifyCreation(Piece.createWhiteKing(), Piece.createBlackKing(), Piece.Type.KING, Piece.KING_REPRESENTATION);
    }

    private void verifyCreation(Piece whitePiece, Piece blackPiece, Piece.Type type, char representation) {
        assertTrue(whitePiece.isWhite());
        assertEquals(type, whitePiece.getType());
        assertEquals(representation, whitePiece.getRepresentation());

        assertTrue(blackPiece.isBlack());
        assertEquals(type, blackPiece.getType());
        assertEquals(Character.toUpperCase(representation), blackPiece.getRepresentation());
    }

    @Test
    public void testPrintFormat() {
        assertEquals("p", piece1.getPrintFormat());
        assertEquals("P", piece2.getPrintFormat());
    }


    public void testIsBlack() {
        assertEquals(false, piece1.isBlack());
        assertEquals(true, piece2.isBlack());
    }

    public void testIsWhite() {
        assertEquals(false, piece2.isWhite());
        assertEquals(true, piece1.isWhite());
    }
}
