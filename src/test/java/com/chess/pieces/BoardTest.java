package com.chess.pieces;

import junit.framework.TestCase;

/**
 * Created by MAC on 5/17/14.
 */
public class BoardTest extends TestCase {
    public void testCreate() {
        Board board = new Board();
        assertEquals(0, board.getNumberOfPawns());
    }

    public void testAddPawnsToBoard() {
        Board board = new Board();
        Pawn pawn1 = Pawn.createPawn("white");
        Pawn pawn2 = Pawn.createPawn("black");

        board.enrollPawn(0, pawn1);
        board.enrollPawn(1, pawn2);

        assertEquals(2, board.getNumberOfPawns());
        assertEquals(0, board.getPositionOfPawn(pawn1));
        assertEquals(1, board.getPositionOfPawn(pawn2));
    }
}