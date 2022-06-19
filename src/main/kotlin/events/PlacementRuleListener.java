package events;

import enums.Event;
import game.GameState;
import rules.PlacementRule;

import java.util.List;

public class PlacementRuleListener implements EventListener {
    List<PlacementRule> rules;

    public PlacementRuleListener(List<PlacementRule> rules) { this.rules = rules; }

    @Override
    public Event update(GameState gameState) {
        return null;
    }
}
