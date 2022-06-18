package domain;

import enums.BugColour;

public class Pillbug implements Bug {
    private final BugColour colour;
    public Pillbug(BugColour colour) { this.colour = colour; }

    public BugColour getColour() {
        return colour;
    }
}
