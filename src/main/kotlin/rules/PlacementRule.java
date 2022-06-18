package rules;

import game.GameState;

public class PlacementRule implements Rule {
    @Override
    public boolean validate(GameState state) {
        return false;
    }
    //queen bee has to be places on turn 1-4
}
