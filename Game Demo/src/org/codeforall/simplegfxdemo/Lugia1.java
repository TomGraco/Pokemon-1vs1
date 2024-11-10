package org.codeforall.simplegfxdemo;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Lugia1 {
private static Picture lugia;
private static int col;
private static int row;

    public Lugia1(){
         lugia = new Picture(Lugia.getCol(),Lugia.getRow(),"Resources/Pictures/lugia - copia.gif");

        lugia.draw();
    }


    public static int getCol(){
        col = lugia.getX();
        return col;
    }
    public static int getRow(){
        row= lugia.getY();
        return row;
    }

    public void moveLeft() {
        if( lugia.getX()<=5){


        }else{
            if(lugia.getX()<345 && lugia.getY()<280){

            }else{
                lugia.translate(-10, 0);
            }

        }

    }

    public void moveRight() {
        if (lugia.getX()>=634){

        }else{
            if(lugia.getX()>350 && lugia.getY()<280){

            }else{
                lugia.translate(10, 0);
            }

        }

    }
    public void moveUp() {
        if(lugia.getY()<=39){

        }else{
            if(lugia.getX()<305 && lugia.getY()<280){

            }else{
                if(lugia.getX()>350 && lugia.getY()<280){

                }else{
                    lugia.translate(0, -10);
                }
            }

        }

    }
    public void moveDown() {
        if(lugia.getY()>=865){

        }else{
            lugia.translate(0, 10);
        }


    }
    public void delete (){
        lugia.delete();
    }
}
