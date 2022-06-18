package events;

import enums.TurnStatus;
import game.GameState;
import rules.EndGameRule;

import java.util.List;

public class EndGameListener implements EventListener {
    List<EndGameRule> rules;

    public EndGameListener(List<EndGameRule> rules) {
        this.rules = rules;
    }

    @Override
    public TurnStatus update(GameState gameState) {
        return null;
    }
}
