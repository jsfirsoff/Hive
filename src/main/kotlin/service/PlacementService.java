package main.kotlin.service;

import main.kotlin.enums.Event;
import main.kotlin.events.EventManager;
import main.kotlin.events.PlacementRuleListener;

import java.util.Arrays;

public class PlacementService {
    private EventManager eventManager;

    public PlacementService() {
        this.eventManager = new EventManager();
        eventManager.subscribe(Event.PLACE, new PlacementRuleListener(Arrays.asList())); //add all placement rules
    }
}
