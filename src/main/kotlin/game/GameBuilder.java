package game;

import domain.GameBoard;
import enums.TileColour;
import players.Player;

import java.util.Arrays;
import java.util.Random;

public class GameBuilder {
    //create board, pieces, listeners, etc
    //just pass around gamestate object for pretty much everything?

    //possibly don't need this class
    public GameState createGameState() {
        GameState state = new GameState();

        state.setBoard(new GameBoard());


        return state;
    }

    private Player createPlayersAndSelectStarting() {
        TileColour colour = TileColour.getRandom();
        Player playerOne = new Player(colour);
        Player playerTwo = new Player(TileColour.getOpposite(colour));

        return Arrays.asList(playerOne, playerTwo).get(new Random().nextInt(2));
    }
}
