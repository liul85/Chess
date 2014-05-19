/**
 * Created by MAC on 5/17/14.
 * describe the pawn object.
 */
package com.chess.pieces;

public class Pawn {
    private String color;
    private String printFormat;
    /**
     * Pawn constructor with color
     * @param color describe the color of pawn when be created.
     */
    protected Pawn(String color) {
        this.color = color;
        if (color == "black") {
            this.printFormat = "P";
        }
        else {
            this.printFormat = "p";
        }
    }

    /**
     * Default Pawn constructor without param and set the default color to white.
     */
    protected Pawn() {
        this.color = "white";
        this.printFormat = "p";
    }

    /**
     * provide a static method to create Pawn object.
     * @param color describe the color of pawn when be created.
     * @return Pawn object.
     */
    static protected Pawn createPawn(String color) {
        return new Pawn(color);
    }

    /**
     * provide a method to get the color of pawn.
     * @return color with String format.
     */
    protected String getColor() {
        return color;
    }

    protected String getPrintFormat() {
        return printFormat;
    }
}
