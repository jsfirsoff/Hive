package events;

import domain.Bug;
import game.GameState;
import rules.MovementRule;

import java.util.Map;

public class MovementRuleListener implements EventListener {
    Map<Bug, MovementRule> rules;

    public MovementRuleListener(Map<Bug, MovementRule> rules) {
        this.rules = rules;
    }

    @Override
    public void update(GameState gameState) {

    }
}
