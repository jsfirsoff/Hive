package domain;

import enums.BugColour;

public class Beetle implements Bug {
    private final BugColour colour;
    public Beetle(BugColour colour) { this.colour = colour; }

    public BugColour getColour() {
        return colour;
    }
}
