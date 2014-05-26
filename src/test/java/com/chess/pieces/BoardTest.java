package com.chess.pieces;

import com.chess.util.StringUtil;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by MAC on 5/17/14.
 */
public class BoardTest extends TestCase {

    private Board board;

    public void setUp() {
        board = Board.createBoard();
    }

    @Test
    public void testCreate() {

        assertEquals(32, board.getPieceCount());

        String blankRank = StringUtil.appendNewLine("........");

        assertEquals(StringUtil.appendNewLine("RNBQKBNR") +
        StringUtil.appendNewLine("PPPPPPPP") +
                blankRank + blankRank + blankRank + blankRank +
                StringUtil.appendNewLine("pppppppp") +
        StringUtil.appendNewLine("rnbqkbnr"),
                board.getAllPrint());
        assertEquals(16, Piece.blackPieces);
        assertEquals(16, Piece.whitePieces);
    }

    public void testGetNumberOfPieces() {
        assertEquals(8, board.getNumberOfPiece(Piece.PAWN_REPRESENTATION, Piece.Colors.Black));
        assertEquals(8, board.getNumberOfPiece(Piece.PAWN_REPRESENTATION, Piece.Colors.White));
        assertEquals(2, board.getNumberOfPiece(Piece.ROOK_REPRESENTATION, Piece.Colors.Black));
        assertEquals(2, board.getNumberOfPiece(Piece.ROOK_REPRESENTATION, Piece.Colors.White));
        assertEquals(2, board.getNumberOfPiece(Piece.KNIGHT_REPRESENTATION, Piece.Colors.Black));
        assertEquals(2, board.getNumberOfPiece(Piece.KNIGHT_REPRESENTATION, Piece.Colors.White));
        assertEquals(2, board.getNumberOfPiece(Piece.BISHOP_REPRESENTATION, Piece.Colors.Black));
        assertEquals(2, board.getNumberOfPiece(Piece.BISHOP_REPRESENTATION, Piece.Colors.White));
        assertEquals(1, board.getNumberOfPiece(Piece.QUEEN_REPRESENTATION, Piece.Colors.Black));
        assertEquals(1, board.getNumberOfPiece(Piece.QUEEN_REPRESENTATION, Piece.Colors.White));
        assertEquals(1, board.getNumberOfPiece(Piece.KING_REPRESENTATION, Piece.Colors.Black));
        assertEquals(1, board.getNumberOfPiece(Piece.KING_REPRESENTATION, Piece.Colors.White));
    }
}