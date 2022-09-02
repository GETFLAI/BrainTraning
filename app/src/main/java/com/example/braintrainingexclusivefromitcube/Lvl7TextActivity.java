package com.example.braintrainingexclusivefromitcube;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lvl7TextActivity extends AppCompatActivity {

    //создаем переменную звука кнопки
    private MediaPlayer buttonSound;
    // кнопки
    private Button btExit;
    private Button btNext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvl7_text);
        //инициализируем переменную звука кнопки
        buttonSound = MediaPlayer.create(this, R.raw.button);
        // инициализируем кнопки
        btExit = findViewById(R.id.buttonBack);
        btNext = findViewById(R.id.buttonNext);

        // далее/назад
        btExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonSound.start();
                finish();
            }
        });
        btNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonSound.start();
                Intent intent = new Intent(Lvl7TextActivity.this, Lvl7TaskActivity.class);
                startActivity(intent);
            }
        });
    }
}