/**
 * Created by MAC on 5/17/14.
 * describe the pawn object.
 */
package com.chess.pieces;

public class Piece {
    static int whitePieces = 0;
    static int blackPieces = 0;

    private Enum color;
    private Enum name;

    protected enum Names {
        R,N,B,Q,K,P;
    }

    protected enum Colors {
        White,
        Black;
    }

    private Piece(Enum name, Enum color) {
        this.name = name;
        this.color = color;
    }

    static protected Piece createPawn(Enum name, Enum color) {
        if (color.equals(Colors.White)) {
            whitePieces += 1;
        }
        else {
            blackPieces += 1;
        }
        return new Piece(name, color);
    }

    protected String getColor() {
        return color.toString();
    }

    protected String getName() {
        return name.toString();
    }

    protected String getPrintFormat() {
        if(this.color.toString() == "Black") {
            return this.name.toString().toUpperCase();
        }

        return this.name.toString().toLowerCase();
    }

    protected boolean isWhite() {
        return color.equals(Colors.White);
    }

    protected boolean isBlack() {
        return color.equals(Colors.Black);
    }
}
