package service;

import domain.Tile;
import events.EventManager;

public class MovementService {

    private EventManager eventManager;

    public MovementService() {
        this.eventManager = new EventManager();
    }

    public Tile moveBug(Tile oldTile, Tile newTile) {
        //TODO
        return null;
    }
}
