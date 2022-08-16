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
        Button buttonStart1lvl = (Button) findViewById(R.id.buttonGoLvl1);
        //создаем кнопкe обработчик
        buttonStart1lvl.setOnClickListener(new View.OnClickListener() {
            //создаем переход в меню
            @Override
            public void onClick(View view) {
                buttonSound.start();
                Intent intent = new Intent(MenuActivity.this, Lvl1Activity.class);
                startActivity(intent);
            }
        });

        //связка меню - 2лвл

        //создаём обработчик кнопки
        Button buttonStart2lvl = (Button) findViewById(R.id.buttonGoLvl2);
        //создаем кнопкe обработчик
        buttonStart2lvl.setOnClickListener(new View.OnClickListener() {
            //создаем переход в меню
            @Override
            public void onClick(View view) {
                buttonSound.start();
                Intent intent = new Intent(MenuActivity.this, Lvl2Activity.class);
                startActivity(intent);
            }
        });

        //связка меню - 3лвл

        //создаём обработчик кнопки
        Button buttonStart3lvl = (Button) findViewById(R.id.buttonGoLvl3);
        //создаем кнопкe обработчик
        buttonStart3lvl.setOnClickListener(new View.OnClickListener() {
            //создаем переход в меню
            @Override
            public void onClick(View view) {
                buttonSound.start();
                Intent intent = new Intent(MenuActivity.this, Lvl3Activity.class);
                startActivity(intent);
            }
        });

        //связка меню - 4лвл

        //создаём обработчик кнопки
        Button buttonStart4lvl = (Button) findViewById(R.id.buttonGoLvl4);
        //создаем кнопкe обработчик
        buttonStart4lvl.setOnClickListener(new View.OnClickListener() {
            //создаем переход в меню
            @Override
            public void onClick(View view) {
                buttonSound.start();
                Intent intent = new Intent(MenuActivity.this, Lvl4Activity.class);
                startActivity(intent);
            }
        });

        //связка меню - 5лвл

        //создаём обработчик кнопки
        Button buttonStart5lvl = (Button) findViewById(R.id.buttonGoLvl5);
        //создаем кнопкe обработчик
        buttonStart5lvl.setOnClickListener(new View.OnClickListener() {
            //создаем переход в меню
            @Override
            public void onClick(View view) {
                buttonSound.start();
                Intent intent = new Intent(MenuActivity.this, Lvl5Activity.class);
                startActivity(intent);
            }
        });

        //связка меню - 6лвл

        //создаём обработчик кнопки
        Button buttonStart6lvl = (Button) findViewById(R.id.buttonGoLvl6);
        //создаем кнопкe обработчик
        buttonStart6lvl.setOnClickListener(new View.OnClickListener() {
            //создаем переход в меню
            @Override
            public void onClick(View view) {
                buttonSound.start();
                Intent intent = new Intent(MenuActivity.this, Lvl6Activity.class);
                startActivity(intent);
            }

        });
        //связка меню - 7лвл

        //создаём обработчик кнопки
        Button buttonStart7lvl = (Button) findViewById(R.id.buttonGoLvl7);
        //создаем кнопкe обработчик
        buttonStart7lvl.setOnClickListener(new View.OnClickListener() {
            //создаем переход в меню
            @Override
            public void onClick(View view) {
                buttonSound.start();
                Intent intent = new Intent(MenuActivity.this, Lvl7Activity.class);
                startActivity(intent);
            }
        });

    }
}