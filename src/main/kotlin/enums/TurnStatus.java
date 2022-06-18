package enums;

import java.util.HashMap;
import java.util.Map;

public enum TurnStatus {
    MOVE("Move a tile."),
    PLACE("Place a tile."),
    PLACE_SUCCESS("Placement successful"),
    MOVE_SUCCESS("Movement successful."),
    PLACE_FAIL("Invalid placement."),
    MOVE_FAIL("Invalid move."),
    NO_MOVES("No moves available for selected tile."),
    PASS("No options available for this turn."),
    END_GAME("Game has ended in a win."),
    GAME_DRAW("Game has ended in a draw.");

    private final String description;
    private static final Map<String, TurnStatus> turnStatuses = new HashMap<>(){{
            for (TurnStatus status : values()) turnStatuses.put(status.description, status);
        }};

    TurnStatus(String description) {
        this.description = description;
    }
}
