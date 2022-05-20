package com.example.braintrainingexclusivefromitcube;

import java.util.Date;

public class Loop implements Runnable{

    private final float FPS = 60;
    private final float SECOND = 1000000000;
    private final float UPDATE_TIME = SECOND/FPS;

    private boolean running = false;

    //создаем отдельный поток
    Thread gameTread = null;

    //TEMP
    float update = 0;
    float drawing = 0;
    long timer = 0;
    //TEMP

    @Override
    public void run() {
        float lastTime = System.nanoTime();
        float delta = 0;
        timer=System.currentTimeMillis();

        while(running = true){
            float nowTime = System.nanoTime();
            float elapsedTime = nowTime - lastTime;
            lastTime = nowTime;
            delta += elapsedTime/UPDATE_TIME;
            if(delta>1){
                updateGame();
                drawingGame();
                delta-=1;
            }
            if(System.currentTimeMillis()-timer>1000){
                Date date = new Date();
                System.out.println("UPDATE = " + update + "DRAWING" + drawing + "DATE" + date);
                update = 0;
                drawing = 0;
                timer += 1000;
            }
        }
    }

    //метод для обновления игры каждые UPDATE_TIME
    private void updateGame(){
        update++;
    }

    private void drawingGame(){
        drawing++;
    }

    public void startGame(){
        if(running = true){
            return;
        }
        running=true;
        gameTread = new Thread(this);
        gameTread.start();
    }

    public void stopGame(){
        if(running = false){
            return;
        }
        running = false;
        try {
            gameTread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
