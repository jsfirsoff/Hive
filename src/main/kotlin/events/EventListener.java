package main.kotlin.events;

import main.kotlin.domain.Tile;
import main.kotlin.enums.Event;
import main.kotlin.game.GameState;

public interface EventListener {
    Event update(Tile oldTile, Tile newTile, GameState gameState);
}
