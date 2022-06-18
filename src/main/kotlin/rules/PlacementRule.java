package rules;

import game.GameState;

public class PlacementRule implements Rule {
    @Override
    public boolean validate(GameState state) {
        return false;
    }
}
