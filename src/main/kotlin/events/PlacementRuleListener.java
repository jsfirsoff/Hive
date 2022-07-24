package main.kotlin.events;

import main.kotlin.domain.Tile;
import main.kotlin.enums.Event;
import main.kotlin.game.GameState;
import main.kotlin.rules.PlacementRule;

import java.util.List;

public class PlacementRuleListener implements EventListener {
    private List<PlacementRule> rules;

    public PlacementRuleListener(List<PlacementRule> rules) { this.rules = rules; }

    @Override
    public Event update(Tile oldTile, Tile newTile, GameState gameState) {
        return null;
    }
}
