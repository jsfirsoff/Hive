package rules;

import enums.Event;
import game.GameState;

public class PlacementRule implements Rule {
    @Override
    public Event validate(GameState state) {
        return null;
    }
    //queen bee has to be places on turn 1-4
    //with exception of piece 1, pieces may not be placed not to opposite colour
    //out of bounds (same for moving)
    //must touch --maybe make common rules?
}
