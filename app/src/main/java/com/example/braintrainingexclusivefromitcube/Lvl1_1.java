package com.example.braintrainingexclusivefromitcube;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Lvl1_1 extends AppCompatActivity {
    //создаем переменную звука кнопки
    public MediaPlayer buttonSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvl1_1);
        //инициализируем переменную звука кнопки
        buttonSound = MediaPlayer.create(this, R.raw.button);
        //создаём обработчик кнопки
        Button buttonStart = (Button) findViewById(R.id.buttonGolvl1_2);
        //создаем слушателя
        View.OnClickListener buttonExitLvlListener = new View.OnClickListener() {
            //создаем переход в меню
            @Override
            public void onClick(View view) {
                soundPlay(buttonSound);
                Intent intent = new Intent(Lvl1_1.this, Lvl1_2.class);
                startActivity(intent);
            }
        };

        //создаем кнопкe обработчик
        buttonStart.setOnClickListener(buttonExitLvlListener);

        Loop loop = new Loop();
        loop.startGame();
    }
    //создаем функцию воспроизведения звука кнопки
    public void soundPlay(MediaPlayer sound) {
        sound.start();
    }
}
