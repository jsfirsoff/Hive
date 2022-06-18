package events;

import enums.TurnStatus;
import game.GameState;

public interface EventListener {
    TurnStatus update(GameState gameState);

    //controller-call style instead of gameplay loop?
}
