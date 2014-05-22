/**
 * Created by MAC on 5/17/14.
 * describe the pawn object.
 */
package com.chess.pieces;

public class Piece {

    private Enum color;
    private Enum name;

    protected enum Names {
        R("r"),
        N("n"),
        B("b"),
        Q("q"),
        K("k"),
        P("p");

        private String name;
        Names(String name) {
            this.name = name;
        }

        protected String getEnumName() {
            return name;
        }
    }

    protected enum Colors {
        White("White"),
        Black("Black");

        private String color;
        Colors(String color) {
            this.color = color;
        }

        protected String getColor() {
            return color;
        }
    }

    private Piece(Enum name, Enum color) {
        this.name = name;
        this.color = color;
    }

    static protected Piece createPawn(Enum name, Enum color) {
        return new Piece(name, color);
    }

    protected String getColor() {
        return color.toString();
    }

    protected String getName() {
        return name.toString();
    }

    protected String getPrintFormat() {
        System.out.printf("color......" + this.color.toString());
        if(this.color.toString() == "Black") {
            return this.name.toString().toUpperCase();
        }

        return this.name.toString().toLowerCase();
    }
}
