package ticTacToe.strategy;

import ticTacToe.model.Board;
import ticTacToe.model.Move;
import ticTacToe.model.Player;

public interface BotPlayingStrategy {
    Move decideMove(Player player, Board board);
}
