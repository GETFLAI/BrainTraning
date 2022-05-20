package com.example.braintrainingexclusivefromitcube;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //создаем переменную звука кнопки
    public MediaPlayer buttonSound;

    //связка начало - меню
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //инициализируем переменную звука кнопки
        buttonSound = MediaPlayer.create(this, R.raw.button);
        //создаём обработчик кнопки
        Button buttonStart = (Button) findViewById(R.id.buttonStart);
        //создаем слушателя
        View.OnClickListener buttonStartListener = new View.OnClickListener() {
            //создаем переход в меню
            @Override
            public void onClick(View view) {
                soundPlay(buttonSound);
                Intent intent = new Intent(MainActivity.this, Menu.class);
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