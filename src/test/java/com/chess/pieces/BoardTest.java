package com.chess.pieces;

import junit.framework.TestCase;

/**
 * Created by MAC on 5/17/14.
 */
public class BoardTest extends TestCase {

    private Board board;
    private Pawn pawn1, pawn2;

    public void setUp() {
        board = new Board();
        pawn1 = Pawn.createPawn("white");
        pawn2 = Pawn.createPawn("black");
    }
    public void testCreate() {
        assertEquals(0, board.getNumberOfPawns());
    }

    public void testAddPawnsToBoard() {
        Board board = new Board();

        board.enrollPawn(0, pawn1);
        board.enrollPawn(1, pawn2);

        assertEquals(2, board.getNumberOfPawns());
        assertEquals(0, board.getPositionOfPawn(pawn1));
        assertEquals(1, board.getPositionOfPawn(pawn2));
    }
}