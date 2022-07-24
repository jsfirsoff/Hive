package main.kotlin.events;

import main.kotlin.domain.Tile;
import main.kotlin.enums.Event;
import main.kotlin.game.GameState;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class EventManager {
    private Map<Event, EventListener> listeners;

    private static final Logger logger = LoggerFactory.getLogger(EventManager.class);

    public EventManager() {}

    public void subscribe(Event event, EventListener listener) {
        listeners.put(event, listener);
    }

    public void unsubscribe(Event event, EventListener listener) {
        listeners.remove(event, listener);
    }

    public Event notify(Event event, Tile oldTile, Tile newTile, GameState state) {
        Event currentEvent = state.getEvent();

        logger.info("Validating move for event: {}", currentEvent);

        List<Event> eventResults = new ArrayList<>();
        listeners.entrySet().stream()
                .filter(entry -> entry.getKey().equals(event))
                .forEach(entry -> eventResults.add(entry.getValue().update(oldTile, newTile, state)));

        return consolidateEvents(eventResults);
    }

    private Event consolidateEvents(List<Event> events) {
        logger.info("Consolidating events: {}", events);
        //endgame > movement > placement
        Event nextEvent = null;


        logger.info("Consolidation complete.  Next event: {}", nextEvent);
        return nextEvent;
    }
}
