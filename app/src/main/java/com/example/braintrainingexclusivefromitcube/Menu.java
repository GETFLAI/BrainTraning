package com.example.braintrainingexclusivefromitcube;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {
    //создаем переменную звука кнопки
    public MediaPlayer buttonSound;

    //связка меню - начало
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        //инициализируем переменную звука кнопки
        buttonSound = MediaPlayer.create(this, R.raw.button);
        //создаём обработчик кнопки
        Button buttonExitMenu = (Button) findViewById(R.id.buttonExitMenu);
        //создаем слушателя
        View.OnClickListener buttonExitMenuListener = new View.OnClickListener() {
            //создаем выход обратно
            @Override
            public void onClick(View view) {
                soundPlay(buttonSound);
                Intent intent = new Intent(Menu.this, MainActivity.class);
                startActivity(intent);
            }
        };

        //создаем кнопкe обработчик
        buttonExitMenu.setOnClickListener(buttonExitMenuListener);

    //связка меню - 1лвл

        //создаём обработчик кнопки
        Button buttonStart = (Button) findViewById(R.id.buttonGoLvl1);
        //создаем слушателя
        View.OnClickListener buttonGoLvl1Listener = new View.OnClickListener() {
            //создаем переход в меню
            @Override
            public void onClick(View view) {
                soundPlay(buttonSound);
                Intent intent = new Intent(Menu.this, Lvl1.class);
                startActivity(intent);
            }
        };

        //создаем кнопкe обработчик
        buttonStart.setOnClickListener(buttonGoLvl1Listener);

        Loop loop = new Loop();
        loop.startGame();
    }

    //создаем функцию воспроизведения звука кнопки
    public void soundPlay(MediaPlayer sound) {
        sound.start();
    }
}