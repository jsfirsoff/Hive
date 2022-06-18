package enums;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public enum Player {
    PLAYER_ONE("white"), PLAYER_TWO("black");

    private String colour;
    private static final Map<String, Player> playerColours = new HashMap<>(){{
        for (Player player : values()) playerColours.put(player.colour, player);
    }};

    Player(String colour) {
        this.colour = colour;
    }

    public static Player getFromColour(String colour) {
        return playerColours.get(colour);
    }

    public static Player getRandom() {
        return values()[new Random().nextInt(values().length)];
    }
}
