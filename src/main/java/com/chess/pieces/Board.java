package com.chess.pieces;

import java.util.ArrayList;

import static com.chess.util.StringUtil.NEWLINE;

public class Board {

    private Board() {
        initialize();
    }

    private ArrayList<ArrayList<Piece>> pieces = new ArrayList<ArrayList<Piece>>(8);

    protected void initialize() {
        for(int i = 1; i <= 8; i++) {
            pieces.add(new ArrayList<Piece>(8));
        }

        pieces.set(1, createPiecesInRow(Piece.Type.PAWN, Piece.Colors.Black));
        pieces.set(6, createPiecesInRow(Piece.Type.PAWN, Piece.Colors.White));

        pieces.set(0, createQueenRank(Piece.Colors.Black));
        pieces.set(7, createQueenRank(Piece.Colors.White));

    }

    protected static Board createBoard() {
        return new Board();
    }


   private ArrayList<Piece> createQueenRank(Enum color) {
       ArrayList<Piece> rank = new ArrayList<Piece>(8);

       rank.add(Piece.createPawn(Piece.Type.ROOK, color));
       rank.add(Piece.createPawn(Piece.Type.KNIGHT, color));
       rank.add(Piece.createPawn(Piece.Type.BISHOP, color));
       rank.add(Piece.createPawn(Piece.Type.QUEEN, color));
       rank.add(Piece.createPawn(Piece.Type.KING, color));
       rank.add(Piece.createPawn(Piece.Type.BISHOP, color));
       rank.add(Piece.createPawn(Piece.Type.KNIGHT, color));
       rank.add(Piece.createPawn(Piece.Type.ROOK, color));

       return rank;
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
