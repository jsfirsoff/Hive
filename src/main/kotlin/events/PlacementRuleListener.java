package events;

import game.GameState;
import rules.PlacementRule;

import java.util.Map;

public class PlacementRuleListener implements EventListener {
    Map<GameState, PlacementRule> rules;

    public PlacementRuleListener(GameState state) {
        this.rules = rules;
    }

    @Override
    public void update(GameState gameState) {

    }
}
