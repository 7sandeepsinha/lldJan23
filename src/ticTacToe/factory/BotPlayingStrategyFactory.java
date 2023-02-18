package ticTacToe.factory;

import ticTacToe.model.BotDifficultyLevel;
import ticTacToe.strategy.BotPlayingStrategy;
import ticTacToe.strategy.LinearBotPlayingStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getPlayingStrategy(BotDifficultyLevel difficultyLevel){
        //TODO: depending on the difficulty level return the bot strategy
        return new LinearBotPlayingStrategy();
    }
}
