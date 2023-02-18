package ticTacToe.strategy.gameWinningStrategy;

import ticTacToe.model.Board;
import ticTacToe.model.Cell;
import ticTacToe.model.Player;

public interface GameWinningStrategy {
    boolean checkWinner(Board board, Player lastMovePlayer, Cell lastMoveCell);
}
