package com.demo.tictactoe;

/**
 * Created by AVK on 19.03.2017.
 */
public class Referee {

        public void put(Move move, Board board) {
            board.getBoard()[move.getX()][move.getY()] = move.getFigure();
        }

        public boolean isWin(Move move, Board board) {
            if ((board.getBoard()[0][0] == ActionFigure.CROSS) && (board.getBoard()[0][1] == ActionFigure.CROSS) && (board.getBoard()[0][2] == ActionFigure.CROSS)){
                return true;
            } else if ((board.getBoard()[0][0] == ActionFigure.NOUGHT) && (board.getBoard()[0][1] == ActionFigure.NOUGHT) && (board.getBoard()[0][2] == ActionFigure.NOUGHT)){
                return true;
            } else if ((board.getBoard()[1][0] == ActionFigure.CROSS) && (board.getBoard()[1][1] == ActionFigure.CROSS) && (board.getBoard()[1][2] == ActionFigure.CROSS)){
                return true;
            } else if ((board.getBoard()[1][0] == ActionFigure.NOUGHT) && (board.getBoard()[1][1] == ActionFigure.NOUGHT) && (board.getBoard()[1][2] == ActionFigure.NOUGHT)){
                return true;
            } else if ((board.getBoard()[2][0] == ActionFigure.CROSS) && (board.getBoard()[2][1] == ActionFigure.CROSS) && (board.getBoard()[2][2] == ActionFigure.CROSS)){
                return true;
            } else if ((board.getBoard()[2][0] == ActionFigure.NOUGHT) && (board.getBoard()[2][1] == ActionFigure.NOUGHT) && (board.getBoard()[2][2] == ActionFigure.NOUGHT)){
                return true;
            } else if ((board.getBoard()[0][0] == ActionFigure.CROSS) && (board.getBoard()[1][1] == ActionFigure.CROSS) && (board.getBoard()[2][2] == ActionFigure.CROSS)){
                return true;
            } else if ((board.getBoard()[0][0] == ActionFigure.NOUGHT) && (board.getBoard()[1][1] == ActionFigure.NOUGHT) && (board.getBoard()[2][2] == ActionFigure.NOUGHT)){
                return true;
            } else if ((board.getBoard()[0][2] == ActionFigure.CROSS) && (board.getBoard()[1][1] == ActionFigure.CROSS) && (board.getBoard()[2][0] == ActionFigure.CROSS)){
                return true;
            } else if ((board.getBoard()[0][2] == ActionFigure.NOUGHT) && (board.getBoard()[1][1] == ActionFigure.NOUGHT) && (board.getBoard()[2][0] == ActionFigure.NOUGHT)){
                return true;
            } else if ((board.getBoard()[0][0] == ActionFigure.CROSS) && (board.getBoard()[1][0] == ActionFigure.CROSS) && (board.getBoard()[2][0] == ActionFigure.CROSS)){
                return true;
            } else if ((board.getBoard()[0][0] == ActionFigure.NOUGHT) && (board.getBoard()[1][0] == ActionFigure.NOUGHT) && (board.getBoard()[2][0] == ActionFigure.NOUGHT)){
                return true;
            } else if ((board.getBoard()[0][1] == ActionFigure.CROSS) && (board.getBoard()[1][1] == ActionFigure.CROSS) && (board.getBoard()[2][1] == ActionFigure.CROSS)){
                return true;
            } else if ((board.getBoard()[0][1] == ActionFigure.NOUGHT) && (board.getBoard()[1][1] == ActionFigure.NOUGHT) && (board.getBoard()[2][1] == ActionFigure.NOUGHT)){
                return true;
            } else if ((board.getBoard()[0][2] == ActionFigure.CROSS) && (board.getBoard()[1][2] == ActionFigure.CROSS) && (board.getBoard()[2][2] == ActionFigure.CROSS)){
                return true;
            } else if ((board.getBoard()[0][2] == ActionFigure.NOUGHT) && (board.getBoard()[1][2] == ActionFigure.NOUGHT) && (board.getBoard()[2][2] == ActionFigure.NOUGHT)){
                return true;
            }
            return false;
        }
}

