package com.example.braintrainingexclusivefromitcube;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lvl1 extends AppCompatActivity {
    //создаем переменную звука кнопки
    public MediaPlayer buttonSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvl1);
        //инициализируем переменную звука кнопки
        buttonSound = MediaPlayer.create(this, R.raw.button);
        //создаём обработчик кнопки
        Button buttonExit = (Button) findViewById(R.id.buttonExitLvl1);
        //создаем слушателя
        View.OnClickListener buttonExitLvlListener = new View.OnClickListener() {
            //создаем переход в меню
            @Override
            public void onClick(View view) {
                soundPlay(buttonSound);
                Intent intent = new Intent(Lvl1.this, Menu.class);
                startActivity(intent);
            }
        };

        //создаем кнопкe обработчик
        buttonExit.setOnClickListener(buttonExitLvlListener);

        //связка 1лвл - 1_1лвл

        //создаём обработчик кнопки
        Button buttonStart = (Button) findViewById(R.id.buttonGolvl1_1);
        //создаем слушателя
        View.OnClickListener buttonStartListener = new View.OnClickListener() {
            //создаем переход в 1_1lvl
            @Override
            public void onClick(View view) {
                soundPlay(buttonSound);
                Intent intent = new Intent(Lvl1.this, Lvl1_1.class);
                startActivity(intent);
            }
        };

        //создаем кнопкe обработчик
        buttonStart.setOnClickListener(buttonStartListener);

        Loop loop = new Loop();
        loop.startGame();
    }
    //создаем функцию воспроизведения звука кнопки
    public void soundPlay(MediaPlayer sound) {
        sound.start();
    }
}