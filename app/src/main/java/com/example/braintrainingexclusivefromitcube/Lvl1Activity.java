package com.example.braintrainingexclusivefromitcube;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.braintrainingexclusivefromitcube.core.Loop;

public class Lvl1Activity extends AppCompatActivity {
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
        //создаем кнопкe обработчик
        buttonExit.setOnClickListener(new View.OnClickListener() {
            //создаем переход в меню
            @Override
            public void onClick(View view) {
                buttonSound.start();
                Intent intent = new Intent(Lvl1Activity.this, MenuActivity.class);
                startActivity(intent);
            }
        });

        //связка 1лвл - 1_1лвл

        //создаём обработчик кнопки
        Button buttonStart = (Button) findViewById(R.id.buttonGolvl1_1);
        //создаем кнопкe обработчик
        buttonStart.setOnClickListener(new View.OnClickListener() {
            //создаем переход в 1_1lvl
            @Override
            public void onClick(View view) {
                buttonSound.start();
                Intent intent = new Intent(Lvl1Activity.this, Lvl1_1Activity.class);
                startActivity(intent);
            }
        });

    }
}