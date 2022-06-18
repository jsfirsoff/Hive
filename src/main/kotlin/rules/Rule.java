package rules;

import game.GameState;

public interface Rule {
    boolean validate(GameState state);
}
