package game;

import java.util.logging.Logger;

public class GameRunner {

    private static final Logger logger = Logger.getLogger(GameRunner.class.getName());

    public static void main(String[] args) {
        GameBuilder builder = new GameBuilder();

        logger.info("Building game...");
        GameState state = builder.createGameState();

    }
}
