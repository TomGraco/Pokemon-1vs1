package org.codeforall.simplegfxdemo;

import org.academiadecodigo.simplegraphics.graphics.Canvas;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Line;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;


public class Main {
    public static void main(String[] args) {

        Canvas.setMaxX(960);
        Canvas.setMaxY(540);
        Picture picture1= new Picture(0,0,"Resources/Pictures/Design sem nome.png");
        picture1.draw();
        Game game = new Game();
        BattleSound.tocarSom("Resources/Sounds/1-01. Opening.mp3");
        new MyMouseHandler(game);
        //Game game =new Game();
        //game.game();

    }
}
