package main.kotlin.game;

import main.kotlin.enums.GameType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GameRunner {

    private static final Logger logger = LoggerFactory.getLogger(GameRunner.class);

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
