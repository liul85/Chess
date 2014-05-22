package com.chess.pieces;

import java.util.ArrayList;
import static com.chess.util.StringUtil.NEWLINE;

public class Board {

    private ArrayList<ArrayList<Piece>> pieces = new ArrayList<ArrayList<Piece>>(8);

    protected void initialize() {
        for(int i = 1; i <= 8; i++) {
            pieces.add(new ArrayList<Piece>(8));
        }

        pieces.set(1, createPiecesInRow(Piece.Names.P, Piece.Colors.Black));
        pieces.set(6, createPiecesInRow(Piece.Names.P, Piece.Colors.White));

        pieces.get(0).add(0, Piece.createPawn(Piece.Names.R, Piece.Colors.Black));
        pieces.get(0).add(1, Piece.createPawn(Piece.Names.N, Piece.Colors.Black));
        pieces.get(0).add(2, Piece.createPawn(Piece.Names.B, Piece.Colors.Black));
        pieces.get(0).add(3, Piece.createPawn(Piece.Names.Q, Piece.Colors.Black));
        pieces.get(0).add(4, Piece.createPawn(Piece.Names.K, Piece.Colors.Black));
        pieces.get(0).add(5, Piece.createPawn(Piece.Names.B, Piece.Colors.Black));
        pieces.get(0).add(6, Piece.createPawn(Piece.Names.N, Piece.Colors.Black));
        pieces.get(0).add(7, Piece.createPawn(Piece.Names.R, Piece.Colors.Black));

        pieces.get(7).add(0, Piece.createPawn(Piece.Names.R, Piece.Colors.White));
        pieces.get(7).add(1, Piece.createPawn(Piece.Names.N, Piece.Colors.White));
        pieces.get(7).add(2, Piece.createPawn(Piece.Names.B, Piece.Colors.White));
        pieces.get(7).add(3, Piece.createPawn(Piece.Names.Q, Piece.Colors.White));
        pieces.get(7).add(4, Piece.createPawn(Piece.Names.K, Piece.Colors.White));
        pieces.get(7).add(5, Piece.createPawn(Piece.Names.B, Piece.Colors.White));
        pieces.get(7).add(6, Piece.createPawn(Piece.Names.N, Piece.Colors.White));
        pieces.get(7).add(7, Piece.createPawn(Piece.Names.R, Piece.Colors.White));
    }

    private ArrayList<Piece> createPiecesInRow(Enum name, Enum color) {
        ArrayList<Piece> pieces = new ArrayList<Piece>(8);
        for (int i = 0; i <= 7; i++) {
            pieces.add(Piece.createPawn(name, color));
        }
        return pieces;
    }

    protected int getPieceCount() {
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
            buffer.append(NEWLINE);
        }
        else {
            buffer.append("........" + NEWLINE);
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
