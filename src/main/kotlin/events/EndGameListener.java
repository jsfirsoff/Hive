package events;

import game.GameState;
import rules.EndGameRule;

import java.util.Map;

public class EndGameListener implements EventListener {
    Map<GameState, EndGameRule> rules;

    public EndGameListener(Map<GameState, EndGameRule> rules) {
        this.rules = rules;
    }

    @Override
    public void update(GameState gameState) {

    }
}
