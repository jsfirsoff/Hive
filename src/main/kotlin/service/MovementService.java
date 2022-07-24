package main.kotlin.service;

import main.kotlin.domain.Bug;
import main.kotlin.domain.Tile;
import main.kotlin.enums.Event;
import main.kotlin.events.EventManager;
import main.kotlin.events.MovementRuleListener;
import main.kotlin.game.GameRunner;
import main.kotlin.game.GameState;
import main.kotlin.rules.MovementRule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;


public class MovementService {

    private EventManager eventManager;

    private static final Logger logger = LoggerFactory.getLogger(MovementService.class);

    public MovementService() {
        this.eventManager = new EventManager();
        eventManager.subscribe(Event.MOVE, new MovementRuleListener(new HashMap<Bug, MovementRule>()));
    }

    private GameState moveBug(Tile oldTile, Tile newTile, GameState gameState) {
        Event eventResult = validateMovement(oldTile, newTile, gameState);
        // if okay make updates
        if (eventResult == Event.MOVE_SUCCESS) {
            newTile.placeBug(oldTile.removeBug());
            gameState.getBoard().updateTile(oldTile);
            gameState.getBoard().updateTile(newTile);
        }

        // either way update gamestate with event result
        gameState.setEvent(eventResult);

        return gameState;
    }

    private Event validateMovement(Tile oldTile, Tile newTile, GameState gameState) {
    return null;
    }
}
