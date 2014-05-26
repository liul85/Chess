/**
 * Created by MAC on 5/17/14.
 * describe the pawn object.
 */
package com.chess.pieces;

public class Piece {
    static int whitePieces = 0;
    static int blackPieces = 0;

    private Enum color;
    private Enum type;
    private char representation;

    final static char PAWN_REPRESENTATION = 'p';
    final static char ROOK_REPRESENTATION = 'r';
    final static char KNIGHT_REPRESENTATION = 'n';
    final static char BISHOP_REPRESENTATION = 'b';
    final static char QUEEN_REPRESENTATION = 'q';
    final static char KING_REPRESENTATION = 'k';

    protected enum Type {
        ROOK, KNIGHT, BISHOP, QUEEN, KING, PAWN;
    }

    protected enum Colors {
        White,
        Black;
    }

    private Piece(Enum type, Enum color) {
        this.type = type;
        this.color = color;
        representation = '.';
    }

    static protected Piece createPawn(Enum type, Enum color) {
        if (color.equals(Colors.White)) {
            whitePieces += 1;
        }
        else {
            blackPieces += 1;
        }
        Piece piece = new Piece(type, color);
        String s = type.toString();
        if (s.equals("PAWN")) {
            piece.representation = Piece.PAWN_REPRESENTATION;

        } else if (s.equals("ROOK")) {
            piece.representation = Piece.ROOK_REPRESENTATION;

        } else if (s.equals("BISHOP")) {
            piece.representation = Piece.BISHOP_REPRESENTATION;

        } else if (s.equals("QUEEN")) {
            piece.representation = Piece.QUEEN_REPRESENTATION;
            ;
        } else if (s.equals("KING")) {
            piece.representation = Piece.KING_REPRESENTATION;

        } else if (s.equals("KNIGHT")) {
            piece.representation = Piece.KNIGHT_REPRESENTATION;

        } else {
            piece.representation = '.';
        }

        return piece;
    }

    protected String getColor() {
        return color.toString();
    }

    protected String getName() {
        return type.toString();
    }

    protected String getPrintFormat() {
        if(color.toString() == "Black") {
            return Character.toString(representation).toUpperCase();
        }

        return Character.toString(representation);
    }

    protected boolean isWhite() {
        return color.equals(Colors.White);
    }

    protected boolean isBlack() {
        return color.equals(Colors.Black);
    }

    static protected Piece createWhitePawn() {
        Piece piece = new Piece(Type.PAWN, Colors.White);
        piece.representation = Piece.PAWN_REPRESENTATION;
        return piece;
    }

    static protected Piece createBlackPawn() {
        Piece piece = new Piece(Type.PAWN, Colors.Black);
        piece.representation = Piece.PAWN_REPRESENTATION;
        return piece;
    }

    static protected Piece createWhiteRook() {
        Piece piece = new Piece(Type.ROOK, Colors.White);
        piece.representation = Piece.ROOK_REPRESENTATION;
        return piece;
    }

    static protected Piece createBlackRook() {
        Piece piece = new Piece(Type.ROOK, Colors.Black);
        piece.representation = Piece.ROOK_REPRESENTATION;
        return piece;
    }

    static protected Piece createWhiteKnight() {
        Piece piece = new Piece(Type.KNIGHT, Colors.White);
        piece.representation = Piece.KNIGHT_REPRESENTATION;
        return  piece;
    }

    static protected Piece createBlackKnight() {
        Piece piece = new Piece(Type.KNIGHT, Colors.Black);
        piece.representation = Piece.KNIGHT_REPRESENTATION;
        return piece;
    }

    static protected Piece createWhiteBishop() {
        Piece piece = new Piece(Type.BISHOP, Colors.White);
        piece.representation = Piece.BISHOP_REPRESENTATION;
        return piece;
    }

    static protected Piece createBlackBishop() {
        Piece piece = new Piece(Type.BISHOP, Colors.Black);
        piece.representation = Piece.BISHOP_REPRESENTATION;
        return piece;
    }

    static protected Piece createWhiteQueen() {
        Piece piece = new Piece(Type.QUEEN, Colors.White);
        piece.representation = Piece.QUEEN_REPRESENTATION;
        return  piece;
    }

    static protected Piece createBlackQueen() {
        Piece piece = new Piece(Type.QUEEN, Colors.Black);
        piece.representation = Piece.QUEEN_REPRESENTATION;
        return piece;
    }

    static protected Piece createWhiteKing() {
        Piece piece = new Piece(Type.KING, Colors.White);
        piece.representation = Piece.KING_REPRESENTATION;
        return piece;
    }

    static protected Piece createBlackKing() {
        Piece piece = new Piece(Type.KING, Colors.Black);
        piece.representation = Piece.KING_REPRESENTATION;
        return piece;
    }

    protected char getRepresentation() {
        if (color.equals(Colors.Black)) {
            return Character.toUpperCase(representation);
        }

        return representation;
    }

    protected Enum getType() {
        return type;
    }

    protected String getRep() {
        return Character.toString(representation);
    }
}
