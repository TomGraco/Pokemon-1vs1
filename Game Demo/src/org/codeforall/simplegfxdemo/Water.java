package org.codeforall.simplegfxdemo;

import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.Timer;
import java.util.TimerTask;

public class Water {

    private final Picture water;
    public Water() {
        water = new Picture(Lugia.getCol(), Lugia.getRow(),"Resources/Pictures/rsz_rsz_energy-ball-pixel-art-maker-735406-removebg-preview.png");
        water.draw();
        Timer timer = new Timer();

    }
    public void translate(){
        water.translate(-20,0);
    }
public void delete(){
        water.delete();
}
public int getX(){
    return    water.getX();
}
public int getY(){
     return   water.getY();
}
}
