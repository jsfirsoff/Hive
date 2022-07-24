package main.kotlin.domain;

import main.kotlin.enums.BugColour;

public class SoldierAnt implements Bug {
    private final BugColour colour;
    public SoldierAnt(BugColour colour) { this.colour = colour; }

    public BugColour getColour() {
        return colour;
    }
}
