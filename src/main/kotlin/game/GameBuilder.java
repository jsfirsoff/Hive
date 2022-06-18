package game;

import domain.GameBoard;

public class GameBuilder {
    //create board, pieces, listeners, etc
    //just pass around gamestate object for pretty much everything?
    public GameState createGameState() {
        GameState state = new GameState();

        state.setBoard(new GameBoard());


        return state;
    }
}
