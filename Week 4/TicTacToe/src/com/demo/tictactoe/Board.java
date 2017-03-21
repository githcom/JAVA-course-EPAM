package com.demo.tictactoe;

/**
 * Created by AVK on 19.03.2017.
 */
public class Board {

    private ActionFigure [][] board = new ActionFigure[3][3];


    public ActionFigure[][] getBoard() {
        return this.board;
    }

    public boolean hasMoreSpace() {
            int count = 0;
            for (int i=0; i<board.length; i++){
                for (int j=0; j<board.length; j++){
                    if (board[i][j] == null){
                        count++;
                    }
                }
            }
            if (count >= 2){
                return true;
            } else {
                return false;
            }
        }

        public void print() {
            for (int i=0; i<board.length; i++){
                for (int j=0; j<board.length; j++){
                    if (board[i][j] == null){
                        System.out.print("☐" + " ");
                    } else if (board[i][j] == ActionFigure.CROSS){
                        System.out.print("☒" + " ");
                    } else if (board[i][j] == ActionFigure.NOUGHT){
                        System.out.print("O" + " ");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }

