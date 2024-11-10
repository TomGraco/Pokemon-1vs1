package org.codeforall.simplegfxdemo;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class LifeBar1 {
    private final Picture lifeBar;
    private int col;
    private int row;

    public LifeBar1(){
        lifeBar = new Picture(Ohho.getCol(),Ohho.getRow(),"Resources/Pictures/rsz_1000088018-removebg-preview.png");

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
        if( lifeBar.getX()<17){

        }else{
            lifeBar.translate(-10, 0);
        }

    }

    public void moveRight() {
        if( lifeBar.getX()>320){}
        else{lifeBar.translate(10, 0);}


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
    public void delete(){
        lifeBar.delete();
    }
}


