package org.codeforall.simplegfxdemo;

import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.Timer;

public class Fire {
    private final Picture fire;

    public Fire() {
        fire = new Picture(Ohho.getCol(), Ohho.getRow(), "Resources/Pictures/1000088240-removebg-preview-2-3.png");
        fire.draw();
        Timer timer = new Timer();

    }

    public void translate() {
        fire.translate(20, 0);
    }

    public void delete() {
        fire.delete();
    }

    public int getX() {
        return fire.getX();
    }

    public int getY() {
        return fire.getY();
    }
}
