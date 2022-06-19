package rules;

import game.GameState;

public interface Rule {
    enums.Event validate(GameState state);
}
