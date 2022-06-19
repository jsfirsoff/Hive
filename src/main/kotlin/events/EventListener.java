package events;

import enums.Event;
import game.GameState;

public interface EventListener {
    Event update(GameState gameState);
}
