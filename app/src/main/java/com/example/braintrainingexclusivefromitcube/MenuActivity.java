package com.example.braintrainingexclusivefromitcube;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.braintrainingexclusivefromitcube.core.Loop;

public class MenuActivity extends AppCompatActivity {
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
        //создаем кнопкe обработчик
        buttonExitMenu.setOnClickListener(new View.OnClickListener() {
            //создаем выход обратно
            @Override
            public void onClick(View view) {
                buttonSound.start();
                Intent intent = new Intent(MenuActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        //связка меню - 1лвл

        //создаём обработчик кнопки
        Button buttonStart = (Button) findViewById(R.id.buttonGoLvl1);
        //создаем кнопкe обработчик
        buttonStart.setOnClickListener(new View.OnClickListener() {
            //создаем переход в меню
            @Override
            public void onClick(View view) {
                buttonSound.start();
                Intent intent = new Intent(MenuActivity.this, Lvl1Activity.class);
                startActivity(intent);
            }
        });
    }
}