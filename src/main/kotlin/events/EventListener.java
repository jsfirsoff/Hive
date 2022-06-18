package events;

import game.GameState;

public interface EventListener {
    public void update(GameState gameState);
}
