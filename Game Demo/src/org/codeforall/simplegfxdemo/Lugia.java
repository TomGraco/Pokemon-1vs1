package org.codeforall.simplegfxdemo;

import org.academiadecodigo.simplegraphics.graphics.Canvas;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.Timer;
import java.util.TimerTask;

public class Lugia {
    private static Picture lugia;
    private static boolean isImageDisp = true;

    public Lugia() {
        lugia = new Picture(800, 250, "Resources/Pictures/3.png");
        startTimer();
    }

    public static int getCol() {
        return lugia.getX();
    }

    public static int getRow() {
        return lugia.getY();
    }

    public void moveLeft() {
        if (lugia.getX() >= 518) {
            lugia.translate(-10, 0);
        }
    }

    public void moveRight() {
        if (lugia.getX() <= 800) {
            lugia.translate(10, 0);
        }
    }

    public void moveUp() {
        if (lugia.getY() >= 200) {
            lugia.translate(0, -10);
        }
    }

    public void moveDown() {
        if (lugia.getY() <= 430) {
            lugia.translate(0, 10);
        }
    }
    public void delete(){
        lugia.delete();
    }

    public static Timer startTimer() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                changeImage();
            }
        }, 0, 500);
        return timer;
    }

    private static void changeImage() {
        if (isImageDisp) {
            lugia = new Picture(lugia.getX(), lugia.getY(), "Resources/Pictures/3.png");
        } else {
            lugia = new Picture(lugia.getX(), lugia.getY(), "Resources/Pictures/4.png");
        }
        lugia.draw();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        lugia.delete();

        isImageDisp = !isImageDisp;
        System.out.println(lugia.getX());
    }

    public static void stopTimer(){
        System.out.println(lugia);
        lugia.delete();
        startTimer().cancel();
    }
}