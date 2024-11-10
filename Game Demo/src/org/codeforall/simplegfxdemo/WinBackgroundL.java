package org.codeforall.simplegfxdemo;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class WinBackgroundL {
    private final Picture picture;
    public WinBackgroundL() {
        picture = new Picture(0,0,"Resources/Pictures/HOOH won the battle!.png");
        picture.draw();
    }
    public void delete() {
        picture.delete();
    }
}
