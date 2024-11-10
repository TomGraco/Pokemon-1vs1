package org.codeforall.simplegfxdemo;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class LifeBar6 {
    private final Picture lifeBar;
    private int col;
    private int row;

    public LifeBar6(){
        lifeBar = new Picture(Lugia.getCol()-10,Lugia.getRow()-10,"Resources/Pictures/1000088019-removebg-preview.png");

        lifeBar.draw();
    }
    public int getCol(){
        col = lifeBar.getX();
        return col;
    }
    public int getRow(){
        row= lifeBar.getY();
        return row;
    }

    public void moveLeft() {
        if (lifeBar.getX() < 518) {


        } else {
            lifeBar.translate(-10, 0);
        }


    }
    public void delete(){
        lifeBar.delete();
    }

    public void moveRight() {
        if (lifeBar.getX() > 800) {
        } else {
            lifeBar.translate(10, 0);
        }


    }

    public void moveUp() {
        if (lifeBar.getY() < 200) {
        } else {
            lifeBar.translate(0, -10);
        }

    }

    public void moveDown() {
        if (lifeBar.getY() > 430) {}
        else {
            lifeBar.translate(0, 10);

        }
    }
}

