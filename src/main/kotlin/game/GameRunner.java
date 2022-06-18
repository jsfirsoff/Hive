package game;

import enums.GameType;

import java.util.logging.Logger;

public class GameRunner {

    private static final Logger logger = Logger.getLogger(GameRunner.class.getName());

    public static void main(String[] args) {
        logger.info("Prompting for type of game...");
        GameType type = promptForGameType();

        GameBuilder builder = new GameBuilder();
        logger.info("Building game of type " + type + "...");
        GameState state = builder.createGameState(type);

        GamePlay game = new GamePlay();
        logger.info("Running game...");
        game.play(state, logger);
    }

    private static GameType promptForGameType() {
        return GameType.VANILLA; //for now
    }
}
