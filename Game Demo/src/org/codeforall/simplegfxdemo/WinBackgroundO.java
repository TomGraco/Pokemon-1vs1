package org.codeforall.simplegfxdemo;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class WinBackgroundO {
    private final Picture picture;
    public WinBackgroundO() {
        picture = new Picture(0,0,"Resources/Pictures/LUGIA won the battle! - copia.png");
        picture.draw();

    }
    public void delete() {
        picture.delete();
    }
}
