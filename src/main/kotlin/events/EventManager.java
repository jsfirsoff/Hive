package events;

import enums.Event;
import game.GameState;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EventManager {
    private Map<Event, EventListener> listeners;

    public EventManager() {}

    public void subscribe(Event event, EventListener listener) {
        listeners.put(event, listener);
    }

    public void unsubscribe(Event event, EventListener listener) {
        listeners.remove(event, listener);
    }

    public Event notify(Event event, GameState state) {
        Event currentEvent = state.getEvent();
        List<Event> eventResults = new ArrayList<>();
        listeners.entrySet().stream()
                .filter(entry -> entry.getKey().equals(event))
                .forEach(entry -> eventResults.add(entry.getValue().update(state)));

        return consolodateEvents(eventResults);
    }

    private Event consolodateEvents(List<Event> events) {
        return null;
    }
}
