package com.demo.tictactoe;

/**
 * Created by AVK on 19.03.2017.
 */
public class Player {

    ActionFigure figure;

    public Player(ActionFigure figure) {
        this.figure = figure;
    }

    public Move turn(Board board) {
        int[][] availableXY = new int[9][2];
        int count = 0;

        for (int i = 0; i < board.getBoard().length; i++) {
            for (int j = 0; j < board.getBoard().length; j++) {
                if (board.getBoard()[i][j] == null) {
                    availableXY[count][0] = i;
                    availableXY[count][1] = j;
                    count++;
                }
            }
        }
            --count;
            int row = (int) Math.round(Math.random() * count);
            int x = availableXY[row][0];
            int y = availableXY[row][1];
            Move move = new Move(figure, x, y);
            return move;
        }
    }



