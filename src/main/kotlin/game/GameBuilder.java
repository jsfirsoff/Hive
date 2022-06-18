package game;

import domain.*;
import enums.GameType;
import enums.BugColour;
import players.Player;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GameBuilder {
    //create board, pieces, listeners, etc
    //just pass around gamestate object for pretty much everything?

    public GameState createGameState(GameType type) {
        GameState state = new GameState(type);

        state.setBoard(new GameBoard());
        createPlayersAndSelectStarting(state, type);

        return state;
    }

    private void createPlayersAndSelectStarting(GameState state, GameType type) {
        BugColour colour = BugColour.getRandom();
        Player playerOne = new Player(colour);
        Player playerTwo = new Player(BugColour.getOpposite(colour));

        playerOne.setUnplayedBugs(createStartingBugs(type, colour));
        playerTwo.setUnplayedBugs(createStartingBugs(type, playerTwo.getColour()));

        state.setPlayers(new Player[]{ playerOne, playerTwo });
        state.setCurrentPlayer(Arrays.asList(playerOne, playerTwo).get(new Random().nextInt(2)));
    }

    private List<Bug> createStartingBugs(GameType type, BugColour colour) {
        List<Bug> bugs = Arrays.asList(
                new QueenBee(colour),
                new Spider(colour),
                new Spider(colour),
                new Beetle(colour),
                new Beetle(colour),
                new Grasshopper(colour),
                new Grasshopper(colour),
                new Grasshopper(colour),
                new SoldierAnt(colour),
                new SoldierAnt(colour),
                new SoldierAnt(colour)
        );

        if (type == GameType.EXPANSION) {
            bugs.addAll(Arrays.asList(
                    new LadyBug(colour),
                    new Pillbug(colour),
                    new Mosquito(colour)
            ));
        }
        return bugs;
    }
}
