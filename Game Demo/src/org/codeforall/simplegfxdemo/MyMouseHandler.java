package org.codeforall.simplegfxdemo;

import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseEventType;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class MyMouseHandler implements MouseHandler {

    private final Mouse mouse;
    private final Game game;


    public MyMouseHandler(Game game) {
        mouse = new Mouse(this);
        mouse.addEventListener(MouseEventType.MOUSE_CLICKED);
        this.game = game;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        System.out.println(mouseEvent.getX() + " " + mouseEvent.getY());

        if (mouseEvent.getX() > 345 && mouseEvent.getX() < 546 && mouseEvent.getY() > 329 && mouseEvent.getY() < 388) {
            BattleSound.tocarSom("Resources/Sounds/Pikachu Sound.mp3");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            game.game();

        } else if (mouseEvent.getX() > 387 && mouseEvent.getX() < 503 && mouseEvent.getY() > 412 && mouseEvent.getY() < 464) {
            System.exit(0);
        } else if (mouseEvent.getX() > 21 && mouseEvent.getX() < 86 && mouseEvent.getY() > 70 && mouseEvent.getY() < 148) {
            System.exit(0);
        } else if (mouseEvent.getX() > 8 && mouseEvent.getX() < 166 && mouseEvent.getY() > 120 && mouseEvent.getY() < 180) {
            BattleSound.tocarSom("Resources/Sounds/Pikachu Sound.mp3");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
          game.gameOver();

        }
    }
        @Override
        public void mouseMoved (MouseEvent mouseEvent){

        }


}

