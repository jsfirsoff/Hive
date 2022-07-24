package main.kotlin.rules;

import main.kotlin.game.GameState;
import main.kotlin.enums.Event;

public class EndGameRule implements Rule {
    @Override
    public Event validate(GameState state) {
        return null;
    }
    //end game or draw
}
