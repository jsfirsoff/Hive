package main.kotlin.rules;

import main.kotlin.game.GameState;
import main.kotlin.enums.Event;

public interface Rule {
    Event validate(GameState state);
}
