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
    private MediaPlayer buttonSound;
    // кнопки
    private Button btExit;
    private Button btLvl1;
    private Button btLvl2;
    private Button btLvl3;
    private Button btLvl4;
    private Button btLvl5;
    private Button btLvl6;
    private Button btLvl7;

    //связка меню - начало
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        //инициализируем переменную звука кнопки
        buttonSound = MediaPlayer.create(this, R.raw.button);
        // инициализируем кнопки
        btExit = findViewById(R.id.buttonExitMenu);
        btLvl1 = findViewById(R.id.buttonGoLvl1);
        btLvl2 = findViewById(R.id.buttonGoLvl2);
        btLvl3 = findViewById(R.id.buttonGoLvl3);
        btLvl4 = findViewById(R.id.buttonGoLvl4);
        btLvl5 = findViewById(R.id.buttonGoLvl5);
        btLvl6 = findViewById(R.id.buttonGoLvl6);
        btLvl7 = findViewById(R.id.buttonGoLvl7);

        //выход
        btExit.setOnClickListener(new View.OnClickListener() {
            //создаем выход обратно
            @Override
            public void onClick(View view) {
                buttonSound.start();
                finish();
            }
        });

        // выбор на уровня игры

        btLvl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonSound.start();
                Intent intent = new Intent(MenuActivity.this, Lvl1TextActivity.class);
                startActivity(intent);
            }
        });

        btLvl2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonSound.start();
                Intent intent = new Intent(MenuActivity.this, Lvl1TextActivity.class);
                startActivity(intent);
            }
        });
        btLvl3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonSound.start();
                Intent intent = new Intent(MenuActivity.this, Lvl1TextActivity.class);
                startActivity(intent);
            }
        });
        btLvl4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonSound.start();
                Intent intent = new Intent(MenuActivity.this, Lvl1TextActivity.class);
                startActivity(intent);
            }
        });
        btLvl5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonSound.start();
                Intent intent = new Intent(MenuActivity.this, Lvl1TextActivity.class);
                startActivity(intent);
            }
        });
        btLvl6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonSound.start();
                Intent intent = new Intent(MenuActivity.this, Lvl1TextActivity.class);
                startActivity(intent);
            }
        });
        btLvl7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonSound.start();
                Intent intent = new Intent(MenuActivity.this, Lvl1TextActivity.class);
                startActivity(intent);
            }
        });

    }
}