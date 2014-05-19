package com.chess.pieces;

import java.util.ArrayList;

public class Board {

    private ArrayList<Pawn> pawnsRow2 = new ArrayList<Pawn>(8);
    private ArrayList<Pawn> pawnsRow7 = new ArrayList<Pawn>(8);

    private ArrayList<Pawn> pawnsRow1 = new ArrayList<Pawn>(8);

    protected Board() {
        initialize();
    }

    public void enrollPawn(ArrayList<Pawn> pawnRow, Pawn pawn) {
        pawnRow.add(pawn);
    }

    public int getNumberOfPawns() {
        return pawnsRow2.size() + pawnsRow7.size();
    }

    private void initialize() {
        for(int i = 1; i <= 8; i++) {
            pawnsRow2.add(new Pawn("white"));
            pawnsRow7.add(new Pawn("black"));
        }
    }

    protected String getRowPrintFormat(int row) {
        switch (row) {
            case 2:
                return getStringBuilder(pawnsRow2);
            case 7:
                return getStringBuilder(pawnsRow7);
            default:
                return "********\n";
        }
    }

    private String getStringBuilder(ArrayList<Pawn> pawns) {
        StringBuilder buffer = new StringBuilder(8);
        for ( Pawn pawn : pawns) {
            buffer.append(pawn.getPrintFormat());
        }
        buffer.append("\n");
        return buffer.toString();
    }
}
