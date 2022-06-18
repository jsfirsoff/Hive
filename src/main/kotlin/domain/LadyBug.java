package domain;

import enums.BugColour;

public class LadyBug implements Bug {
    private final BugColour colour;
    public LadyBug(BugColour colour) { this.colour = colour; }

    public BugColour getColour() {
        return colour;
    }
}
