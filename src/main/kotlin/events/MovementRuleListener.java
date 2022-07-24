package main.kotlin.events;

import main.kotlin.domain.Bug;
import main.kotlin.domain.Tile;
import main.kotlin.enums.Event;
import main.kotlin.game.GameState;
import main.kotlin.rules.MovementRule;

import java.util.Map;

public class MovementRuleListener implements EventListener {
    private Map<Bug, MovementRule> rules; //for filtering

    public MovementRuleListener(Map<Bug, MovementRule> rules) {
        this.rules = rules;
    }

    @Override
    public Event update(Tile oldTile, Tile newTile, GameState gameState) {
        return null;
    }
}
