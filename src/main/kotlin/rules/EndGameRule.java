package rules;

import game.GameState;

public class EndGameRule implements Rule {
    @Override
    public boolean validate(GameState state) {
        return false;
    }
}
