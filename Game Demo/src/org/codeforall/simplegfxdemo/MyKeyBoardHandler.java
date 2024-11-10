package org.codeforall.simplegfxdemo;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.Timer;
import java.util.TimerTask;


public class MyKeyBoardHandler implements KeyboardHandler{

    private final Keyboard keyboard;
    private final Lugia lugia;
    private Lugia1 lugia1;
    private final LifeBar lifeBar;
    private LifeBar2 lifeBar2;
    private LifeBar3 lifeBar3;
    private LifeBar4 lifeBar4;
    private LifeBar5 lifeBar5;
    private LifeBar6 lifeBar6;
    private LifeBar7 lifeBar7;
    private Picture fire;
    private Picture water;
    private WinBackgroundL winBackgroundL;
    private WinBackgroundO winBackgroundO;

private final Ohho ohho;
private final LifeBar1 lifeBar1;
private int lifesOhho=0;
private int lifesLugia=0;


    public MyKeyBoardHandler(Lugia lugia, LifeBar lifeBar,Ohho ohho,LifeBar1 lifeBar1) {
        keyboard = new Keyboard(this);
        setKeyboardEvents();
        this.lugia = lugia;
        this.lifeBar = lifeBar;
        this.ohho = ohho;
        this.lifeBar1 = lifeBar1;
    }


    private void setKeyboardEvents() {
        KeyboardEvent left = new KeyboardEvent();
        left.setKey(KeyboardEvent.KEY_LEFT);
        left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(left);

        KeyboardEvent right = new KeyboardEvent();
        right.setKey(KeyboardEvent.KEY_RIGHT);
        right.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(right);

        KeyboardEvent up = new KeyboardEvent();
        up.setKey(KeyboardEvent.KEY_UP);
        up.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(up);

        KeyboardEvent down = new KeyboardEvent();
        down.setKey(KeyboardEvent.KEY_DOWN);
        down.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(down);

        KeyboardEvent shoot1 = new KeyboardEvent();
        shoot1.setKey(KeyboardEvent.KEY_ENTER);
        shoot1.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(shoot1);

        KeyboardEvent shoot2 = new KeyboardEvent();
        shoot2.setKey(KeyboardEvent.KEY_ENTER);
        shoot2.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        keyboard.addEventListener(shoot2);

        // /////////////////////////////////////////////////

        KeyboardEvent left1 = new KeyboardEvent();
        left1.setKey(KeyboardEvent.KEY_A);
        left1.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(left1);

        KeyboardEvent right1 = new KeyboardEvent();
        right1.setKey(KeyboardEvent.KEY_D);
        right1.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(right1);

        KeyboardEvent up1 = new KeyboardEvent();
        up1.setKey(KeyboardEvent.KEY_W);
        up1.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(up1);

        KeyboardEvent down1 = new KeyboardEvent();
        down1.setKey(KeyboardEvent.KEY_S);
        down1.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(down1);

        KeyboardEvent shoot3 = new KeyboardEvent();
        shoot3.setKey(KeyboardEvent.KEY_SPACE);
        shoot3.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(shoot3);

        KeyboardEvent shoot4 = new KeyboardEvent();
        shoot4.setKey(KeyboardEvent.KEY_SPACE);
        shoot4.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        keyboard.addEventListener(shoot4);
    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        if (keyboardEvent.getKey() == KeyboardEvent.KEY_LEFT) {
                    lugia.moveLeft();
                    lifeBar.moveLeft();
lifeBar5.moveLeft();
lifeBar6.moveLeft();
lifeBar7.moveLeft();
                }

        if (keyboardEvent.getKey() == KeyboardEvent.KEY_RIGHT) {
                    lugia.moveRight();
                    lifeBar.moveRight();
lifeBar5.moveRight();
lifeBar6.moveRight();
lifeBar7.moveRight();

        }
        if (keyboardEvent.getKey() == KeyboardEvent.KEY_UP) {
            lugia.moveUp();
            lifeBar.moveUp();
            lifeBar5.moveUp();
            lifeBar6.moveUp();
            lifeBar7.moveUp();
        }
        if (keyboardEvent.getKey() == KeyboardEvent.KEY_DOWN) {
            lugia.moveDown();
            lifeBar.moveDown();
            lifeBar5.moveDown();
            lifeBar6.moveDown();
            lifeBar7.moveDown();
        }
        if (keyboardEvent.getKey() == KeyboardEvent.KEY_ENTER){
            BattleSound.tocarSom("Resources/Sounds/249 - Lugia.mp3");



        }
        /////////////////////////////////

        if (keyboardEvent.getKey() == KeyboardEvent.KEY_A) {
            ohho.moveLeft();
            lifeBar1.moveLeft();
            lifeBar2.moveLeft();
            lifeBar3.moveLeft();
            lifeBar4.moveLeft();
        }
        if (keyboardEvent.getKey() == KeyboardEvent.KEY_D) {
            ohho.moveRight();
            lifeBar1.moveRight();
            lifeBar2.moveRight();
            lifeBar3.moveRight();
            lifeBar4.moveRight();
        }
        if (keyboardEvent.getKey() == KeyboardEvent.KEY_W) {
            ohho.moveUp();
            lifeBar1.moveUp();
            lifeBar2.moveUp();
            lifeBar3.moveUp();
            lifeBar4.moveUp();
        }
        if (keyboardEvent.getKey() == KeyboardEvent.KEY_S) {
            ohho.moveDown();
            lifeBar1.moveDown();
            lifeBar2.moveDown();
            lifeBar3.moveDown();
            lifeBar4.moveDown();

        }
    }


    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

        if (keyboardEvent.getKey() == KeyboardEvent.KEY_ENTER) {

            Water water = new Water();

            Timer timer = new Timer();

                    TimerTask task = new TimerTask() {
                        int contador = 0;

                        @Override
                        public void run() {


                            water.translate();
                            contador++;
                            int range =20;
                            if(contador==35){
                                water.delete();
                                timer.cancel();
                            }
                             

                            if ((Math.abs(Ohho.getCol()- water.getX()) <= range && (Math.abs(Ohho.getRow()- water.getY())<= range))&& lifesOhho == 0) {
                                lifeBar1.delete();
                                lifeBar2 = new LifeBar2();
                                water.delete();
                                lifesOhho = lifesOhho + 1;
                                timer.cancel();
                                return;

                            }
                            if ((Math.abs(Ohho.getCol()- water.getX()) <= range && (Math.abs(Ohho.getRow()- water.getY())<= range))&& lifesOhho == 1) {

                                lifeBar2.delete();
                                lifeBar3 = new LifeBar3();
                                water.delete();
                                lifesOhho++;
                                timer.cancel();
                                return;
                            }
                            if ((Math.abs(Ohho.getCol()- water.getX()) <= range && (Math.abs(Ohho.getRow()- water.getY())<= range))&& lifesOhho == 2) {

                                lifeBar3.delete();
                                lifeBar4 = new LifeBar4();
                                water.delete();
                                lifesOhho++;
                                timer.cancel();
                                return;
                            }
                            if ((Math.abs(Ohho.getCol() - water.getX()) <= range
                                    && Math.abs(Ohho.getRow() - water.getY()) <= range)
                                    && lifesOhho == 3) {

                                // Apagar Ohho e Lugia antes de exibir o background de vitória
                                ohho.delete(); // ou ohho.remove();
                                lugia.delete(); // ou lugia.remove();

                                lifeBar4.delete();
                                water.delete();
                                winBackgroundL = new WinBackgroundL();


                                lifesOhho++;

                                System.out.println(lifesOhho);
                                timer.cancel();

                                if (lifesOhho == 4) {
                                    BattleSound.pararTodasAsMusicas();
                                    BattleSound.tocarSom("Resources/Sounds/1-29. Victory (Vs. Gym Leader).mp3");
                                }
                            }



                        }


                    };

            timer.schedule(task, 100, 100);


        }

        if (keyboardEvent.getKey() == KeyboardEvent.KEY_SPACE){
            BattleSound.tocarSom("Resources/Sounds/250 - Ho - Oh.mp3");
            Fire fire = new Fire();
            Timer timer1 = new Timer();

                    TimerTask task1 = new TimerTask() {
                        int contador1 = 0;

                        @Override
                        public void run() {


                            fire.translate();
                            contador1++;
int range =20;
                            if(contador1==35){
                                fire.delete();
                                timer1.cancel();
                            }

                                if ((Math.abs(Lugia.getCol()- fire.getX()) <= range && (Math.abs(Lugia.getRow()- fire.getY())<= range))&& lifesLugia == 0) {
                                    lifeBar.delete();
                                    lifeBar5 = new LifeBar5();
                                    fire.delete();
                                    lifesLugia = lifesLugia + 1;
                                    timer1.cancel();
                                    return;
                                }
                                if ((Math.abs(Lugia.getCol()- fire.getX()) <= range && (Math.abs(Lugia.getRow()- fire.getY())<= range))&& lifesLugia == 1) {
                                    lifeBar5.delete();
                                    lifeBar6 = new LifeBar6();
                                    fire.delete();
                                    lifesLugia = lifesLugia + 1;
                                    timer1.cancel();
                                    return;
                                }
                                if ((Math.abs(Lugia.getCol()- fire.getX()) <= range && (Math.abs(Lugia.getRow()- fire.getY())<= range))&& lifesLugia == 2) {
                                    lifeBar6.delete();
                                    lifeBar7 = new LifeBar7();
                                    fire.delete();
                                    lifesLugia = lifesLugia + 1;
                                    timer1.cancel();
                                    return;
                                }
                                if ((Math.abs(Lugia.getCol()- fire.getX()) <= range && (Math.abs(Lugia.getRow()- fire.getY())<= range))&& lifesLugia == 3) {
                                    lifeBar7.delete();
                                    fire.delete();
                                    lifesLugia++;
                                    winBackgroundO = new WinBackgroundO();
                                    timer1.cancel();

                                    if (lifesLugia == 4) {
                                        BattleSound.pararTodasAsMusicas();
                                        BattleSound.tocarSom("Resources/Sounds/1-29. Victory (Vs. Gym Leader).mp3");

                                    }
                                }


                            }


                        }

                        ;

                    timer1.schedule(task1,100,100);
                    }


        }


    }





