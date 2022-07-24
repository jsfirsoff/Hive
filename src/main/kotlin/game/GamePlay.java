package main.kotlin.game;

import main.kotlin.enums.Event;
import main.kotlin.players.Player;

import org.slf4j.Logger;

public class GamePlay {
    public GamePlay() {}
    public void play(GameState state, Logger logger) {
        Event event = state.getEvent();

        while (event != Event.END_GAME && event != Event.GAME_DRAW) {
            state = playerTurn(state, state.getEvent(), state.getCurrentPlayer());
            event = state.getEvent();


            //
        }
        endGame(state);
    }

    private GameState playerTurn(GameState state, Event event, Player player) {

        while (event == Event.READY || event == Event.MOVE_FAIL || event == Event.PLACE_FAIL) {

            //prompt player for action
            //validate
            //update or retry
        }



        state.switchPlayers();
        return null;
    }

    private GameState promptTurn(GameState state) { //?
        return null;
    }

    private void endGame(GameState state) {

    }
}
