package org.codeforall.simplegfxdemo;


import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.Timer;
import java.util.TimerTask;


public class Ohho {

    private static Picture ohho;
    private static boolean isImageDisp = true;

    public Ohho () {
        ohho = new Picture(100, 260, "Resources/Pictures/1.png");
        startTimer();
    }

    public static int getCol() {
        return ohho.getX();
    }

    public static int getRow() {
        return ohho.getY();
    }

    public void moveLeft() {
        if(ohho.getX() >= 17) {
            ohho.translate(-10, 0);
        }
    }

    public void moveRight() {
        if(ohho.getX() <= 320) {
            ohho.translate(10, 0);
        }
    }

    public void moveUp() {
        if (ohho.getY() >= 200) {
            ohho.translate(0, -10);
        }
    }

    public void moveDown() {
        if (ohho.getY() <= 430) {
            ohho.translate(0, 10);
        }
    }
    public void delete(){
        ohho.delete();
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
            ohho = new Picture(ohho.getX(), ohho.getY(), "Resources/Pictures/2.png");
        } else {
            ohho = new Picture(ohho.getX(), ohho.getY(), "Resources/Pictures/1.png");
        }
        ohho.draw();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ohho.delete();

        isImageDisp = !isImageDisp;

    }
    public static void stopTimer(){
        System.out.println(ohho);
        ohho.delete();
        startTimer().cancel();
    }
}


