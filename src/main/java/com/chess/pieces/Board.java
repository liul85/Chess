package com.chess.pieces;

import java.util.ArrayList;

public class Board {

    private ArrayList<Pawn> pawnsRow2 = new ArrayList<Pawn>(8);
    private ArrayList<Pawn> pawnsRow7 = new ArrayList<Pawn>(8);

    private ArrayList<Pawn> pawnsRow1 = new ArrayList<Pawn>(8);
    private ArrayList<Pawn> pawnsRow3 = new ArrayList<Pawn>(8);
    private ArrayList<Pawn> pawnsRow4 = new ArrayList<Pawn>(8);
    private ArrayList<Pawn> pawnsRow5 = new ArrayList<Pawn>(8);
    private ArrayList<Pawn> pawnsRow6 = new ArrayList<Pawn>(8);
    private ArrayList<Pawn> pawnsRow8 = new ArrayList<Pawn>(8);

    private ArrayList<ArrayList> rows = new ArrayList<ArrayList>(8);

    private void initRows() {
        rows.add(pawnsRow1);
        rows.add(pawnsRow2);
        rows.add(pawnsRow3);
        rows.add(pawnsRow4);
        rows.add(pawnsRow5);
        rows.add(pawnsRow6);
        rows.add(pawnsRow7);
        rows.add(pawnsRow8);
    }

    protected Board() {
        initialize();
        initRows();
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
                return "........\n";
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

    protected String getAllPrint() {
        StringBuilder bufferRow = new StringBuilder();
        for(ArrayList row : rows) {
            if (row.size() != 0){
                bufferRow.append(getStringBuilder(row));
            }
            else {
                bufferRow.append("........\n");
            }
        }
        System.out.printf(String.valueOf(bufferRow));
        return bufferRow.toString();
    }
}
