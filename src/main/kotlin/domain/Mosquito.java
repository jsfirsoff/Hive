package main.kotlin.domain;

import main.kotlin.enums.BugColour;

public class Mosquito implements Bug {
    private final BugColour colour;
    public Mosquito(BugColour colour) { this.colour = colour; }

    public BugColour getColour() {
        return colour;
    }
}
