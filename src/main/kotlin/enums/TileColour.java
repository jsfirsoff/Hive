package enums;

import java.util.Arrays;
import java.util.Random;

public enum TileColour {
    WHITE, BLACK;

    public static TileColour getRandom() {
        return values()[new Random().nextInt(values().length)];
    }

    public static TileColour getOpposite(TileColour colour) {
        if (colour == WHITE) return BLACK;
        return WHITE;
    }
}
