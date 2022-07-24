package main.kotlin.domain;

import main.kotlin.enums.BugColour;

public class QueenBee implements Bug {
    private final BugColour colour;
    public QueenBee(BugColour colour) { this.colour = colour; }

    public BugColour getColour() {
        return colour;
    }
}
