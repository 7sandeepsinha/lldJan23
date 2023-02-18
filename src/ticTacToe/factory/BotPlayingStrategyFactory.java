package ticTacToe.factory;

import ticTacToe.model.BotDifficultyLevel;
import ticTacToe.strategy.botPlayingStrategy.BotPlayingStrategy;
import ticTacToe.strategy.botPlayingStrategy.LinearBotPlayingStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getPlayingStrategy(BotDifficultyLevel difficultyLevel){
        //TODO: depending on the difficulty level return the bot strategy
        return new LinearBotPlayingStrategy();
    }
}
