package com.example.braintrainingexclusivefromitcube;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.braintrainingexclusivefromitcube.core.Loop;

public class Lvl1_1Activity extends AppCompatActivity {
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
        //создаем кнопкe обработчик
        buttonStart.setOnClickListener(new View.OnClickListener() {
            //создаем переход в меню
            @Override
            public void onClick(View view) {
                soundPlay(buttonSound);
                Intent intent = new Intent(Lvl1_1Activity.this, Lvl1_2Activity.class);
                startActivity(intent);
            }
        });
    }
    //создаем функцию воспроизведения звука кнопки
    public void soundPlay(MediaPlayer sound) {
        sound.start();
    }
}
