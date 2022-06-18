package events;

import enums.Event;
import game.GameState;

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

    public void notify(Event event, GameState state) {
        listeners.entrySet().stream()
                .filter(entry -> entry.getKey().equals(event))
                .forEach(entry -> entry.getValue().update(state));
    }
}
