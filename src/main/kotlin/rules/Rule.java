package rules;

import enums.TurnStatus;
import game.GameState;

public interface Rule {
    TurnStatus validate(GameState state);
}
