package main.kotlin.events;

import main.kotlin.domain.Tile;
import main.kotlin.enums.Event;
import main.kotlin.game.GameState;
import main.kotlin.rules.EndGameRule;

import java.util.List;

public class EndGameListener implements EventListener {
    private List<EndGameRule> rules;

    public EndGameListener(List<EndGameRule> rules) {
        this.rules = rules;
    }

    @Override
    public Event update(Tile oldTile, Tile newTile, GameState gameState) {
        return null;
    }
}
