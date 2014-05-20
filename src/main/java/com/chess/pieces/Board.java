package com.chess.pieces;

import java.util.ArrayList;

public class Board {

    private ArrayList<ArrayList<Pawn>> pieces = new ArrayList<ArrayList<Pawn>>(8);

    protected Board() {
        initialize();
    }

    private void initialize() {
        for(int i = 1; i <= 8; i++) {
            pieces.add(new ArrayList<Pawn>(8));
        }

        pieces.set(1, createPawnsInRow("white"));
        pieces.set(6, createPawnsInRow("black"));
    }

    private ArrayList<Pawn> createPawnsInRow(String color) {
        ArrayList<Pawn> pawns = new ArrayList<Pawn>(8);
        for (int i = 0; i <= 7; i++) {
            pawns.add(Pawn.createPawn(color));
        }
        return pawns;
    }

    protected int getNumberOfPawns() {
        int i = 0;
        for (int r = 0; r <= 7; r++) {
            i += pieces.get(r).size();
        }
        return i;
    }

    protected String getRowPrintFormat(int i) {
        StringBuilder buffer = new StringBuilder();
        if (pieces.get(i-1).size() != 0) {
            for (int m = 0; m <= 7; m++) {
                buffer.append(pieces.get(i-1).get(m).getPrintFormat());
            }
            buffer.append("\n");
        }
        else {
            buffer.append("........\n");
        }
        return buffer.toString();
    }

    protected String getAllPrint() {
        StringBuilder buffer = new StringBuilder();
        for (int i = 1; i <= pieces.size(); i++) {
            buffer.append(getRowPrintFormat(i));
        }
        return buffer.toString();
    }

}
