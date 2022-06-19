package rules;

import enums.Event;
import game.GameState;

public class MovementRule implements Rule {
    @Override
    public Event validate(GameState state) {
        return null;
    }

    //extend for each bug
    //validate if bug being moved belongs to current player
    //either move or place or unable to move (turn passes)
    //rule for each big
    //must touch
    //hive must be linked
    //if connecting two parts of hive, cannot be moved
    //sliding rule with exception of some bugs (grasshopper, beetle, ladybug?), and
    //must be able to slide in place physically
    //one class for each, and return classname in error/log message?
}
