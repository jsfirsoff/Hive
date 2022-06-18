package enums;

import java.util.Random;

public enum BugColour {
    WHITE, BLACK;

    public static BugColour getRandom() {
        return values()[new Random().nextInt(values().length)];
    }

    public static BugColour getOpposite(BugColour colour) {
        if (colour == WHITE) return BLACK;
        return WHITE;
    }
}
