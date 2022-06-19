package service;

import enums.Event;
import events.EventManager;
import events.PlacementRuleListener;

import java.util.Arrays;

public class PlacementService {
    private EventManager eventManager;

    public PlacementService() {
        this.eventManager = new EventManager();
        eventManager.subscribe(Event.PLACE, new PlacementRuleListener(Arrays.asList())); //add all placement rules
    }
}
