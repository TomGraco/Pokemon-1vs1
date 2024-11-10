package org.codeforall.simplegfxdemo;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Game {
    private Ohho ohho;
    private Lugia lugia;
    private WinBackgroundO winBackgroundO;
    private WinBackgroundL winBackgroundL;
    private LifeBar lifeBar;
    private LifeBar1 lifeBar1;
    private LifeBar2 lifeBar2;
    private LifeBar3 lifeBar3;
    private LifeBar4 lifeBar4;
    private LifeBar5 lifeBar5;
    private LifeBar6 lifeBar6;
    private LifeBar7 lifeBar7;

    private int lifesOhho;
    private int lifesLugia;
    public void game(){

        Picture picture= new Picture (0,0,"Resources/Pictures/Design sem nome - copia.png");
        picture.draw();
        Lugia lugia = new Lugia();

        LifeBar lifeBar= new LifeBar();
        Ohho ohho = new Ohho();

        LifeBar1 lifebar1= new LifeBar1();
        BattleSound.pararTodasAsMusicas();
        BattleSound.tocarSom("Resources/Sounds/1-11. Battle! (Trainer).mp3");
        new MyKeyBoardHandler(lugia,lifeBar,ohho,lifebar1);

    }
    public void gameOver(){
        if (ohho != null) {
            ohho.delete();
        }
        if (lugia != null) {
            lugia.delete();
        }

        // Resetar contadores de vidas
        lifesOhho = 0;
        lifesLugia = 0;
        BattleSound.pararTodasAsMusicas();
        redrawInitialScreen();
        // Reinicializar a música ou sons de fundo do jogo, se necessário

        Ohho.startTimer();
        Lugia.startTimer();
      
    }
    private void redrawInitialScreen() {
        Picture picture= new Picture (0,0,"Resources/Pictures/Design sem nome - copia.png");
        picture.draw();
        LifeBar lifeBar= new LifeBar();
        Ohho ohho = new Ohho();
        LifeBar1 lifebar1= new LifeBar1();
        Lugia lugia = new Lugia();
    }
}
