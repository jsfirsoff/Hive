package rules;

import game.GameState;

public class MovementRule implements Rule {
    @Override
    public boolean validate(GameState state) {
        return false;
    }

    //validate if bug being moved belongs to current player
}
