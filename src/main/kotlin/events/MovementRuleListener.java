package events;

import domain.Bug;
import enums.Event;
import game.GameState;
import rules.MovementRule;

import java.util.Map;

public class MovementRuleListener implements EventListener {
    Map<Bug, MovementRule> rules; //for filtering

    public MovementRuleListener(Map<Bug, MovementRule> rules) {
        this.rules = rules;
    }

    @Override
    public Event update(GameState gameState) {
        return null;
    }
}
