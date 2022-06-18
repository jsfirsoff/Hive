package domain;

import enums.BugColour;

public class Grasshopper implements Bug {
    private final BugColour colour;
    public Grasshopper(BugColour colour) { this.colour = colour; }

    public BugColour getColour() {
        return colour;
    }
}
