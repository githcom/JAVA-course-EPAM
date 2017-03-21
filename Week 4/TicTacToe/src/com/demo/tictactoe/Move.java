package com.demo.tictactoe;

/**
 * Created by AVK on 19.03.2017.
 */
public class Move {

    public Move(ActionFigure figure, int x, int y){
        this.figure = figure;
        this.x = x;
        this.y = y;
    }

        private int x;
        private int y;
        private ActionFigure figure;

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public ActionFigure getFigure() {
            return figure;
        }

        public void setFigure(ActionFigure figure) {
            this.figure = figure;
        }
    }


