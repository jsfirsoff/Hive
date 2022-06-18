package game;

import enums.TurnStatus;
import players.Player;

import java.util.logging.Logger;

public class GamePlay {
    public GamePlay() {}
    public void play(GameState state, Logger logger) {
        TurnStatus status = null;

        while (status != TurnStatus.END_GAME && status != TurnStatus.GAME_DRAW) {
            status = playerTurn(state, state.getCurrentPlayer());
        }
        endGame(status);
    }

    private TurnStatus playerTurn(GameState state, Player player) {





        state.switchPlayers();
        return null;
    }

    private GameState promptTurn(GameState state) { //?
        return null;
    }

    private void endGame(TurnStatus status) {

    }
}
