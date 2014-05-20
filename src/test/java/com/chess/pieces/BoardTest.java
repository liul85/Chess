package com.chess.pieces;

import junit.framework.TestCase;

/**
 * Created by MAC on 5/17/14.
 */
public class BoardTest extends TestCase {

    private Board board;

    public void setUp() {
        board = new Board();
    }

    public void testCreate() {
        assertEquals(16, board.getNumberOfPawns());

        assertEquals("pppppppp\n", board.getRowPrintFormat(2));
        assertEquals("PPPPPPPP\n", board.getRowPrintFormat(7));
        assertEquals("........\n", board.getRowPrintFormat(1));
    }

    public void testBoardInit() {
        assertEquals("........\npppppppp\n........\n........\n........\n........\nPPPPPPPP\n........\n",
                board.getAllPrint());
    }
}