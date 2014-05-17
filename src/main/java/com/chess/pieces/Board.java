package com.chess.pieces;

import java.util.ArrayList;

/**
 * Provides a board which makes the pawns listed on.
 * @author liul85
 */
public class Board {

    private ArrayList<Pawn> pawns = new ArrayList<Pawn>();

    /**
     * provide a method to add pawns into list.
     * @param p describe the position which the pawn is listed on.
     * @param pawn describe the pawn listed on the board.
     */
    public void enrollPawn(int p, Pawn pawn) {
        pawns.add(p, pawn);
    }

    /**
     * provide a method to get the length of the ArrayList.
     * @return the size of ArrayList in "int" format.
     */
    public int getNumberOfPawns() {
        return pawns.size();
    }

    /**
     * provide a method to get the pawn object with the index.
     * @param pawn describe the pawn object you want to query.
     * @return the index of pawn in "int" format.
     */
    public int getPositionOfPawn(Pawn pawn) {
        return pawns.indexOf(pawn);
    }
}
