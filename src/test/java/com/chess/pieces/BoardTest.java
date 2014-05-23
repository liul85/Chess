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
}