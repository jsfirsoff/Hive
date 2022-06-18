package events;

import enums.TurnStatus;
import game.GameState;
import rules.PlacementRule;

import java.util.List;

public class PlacementRuleListener implements EventListener {
    List<PlacementRule> rules;

    public PlacementRuleListener(List<PlacementRule> rules) { this.rules = rules; }

    @Override
    public TurnStatus update(GameState gameState) {
        return null;
    }
}
