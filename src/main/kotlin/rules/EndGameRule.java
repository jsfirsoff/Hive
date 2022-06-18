package rules;

import enums.TurnStatus;
import game.GameState;

public class EndGameRule implements Rule {
    @Override
    public TurnStatus validate(GameState state) {
        return null;
    }
    //end game or draw
}
