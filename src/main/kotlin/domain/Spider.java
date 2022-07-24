package main.kotlin.domain;

import main.kotlin.enums.BugColour;

public class Spider implements Bug {
    private final BugColour colour;
    public Spider(BugColour colour) { this.colour = colour; }

    public BugColour getColour() {
        return colour;
    }
}
