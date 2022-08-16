package com.example.braintrainingexclusivefromitcube;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Lvl5Activity extends AppCompatActivity {
    //создаем переменную звука кнопки
    public MediaPlayer buttonSound;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvl5);

        //создаём связку уровень 5 - 5_1
        //инициализируем переменную звука кнопки
        buttonSound = MediaPlayer.create(this, R.raw.button);
        //создаём обработчик кнопки
        Button buttonGoLvl5_1 = (Button) findViewById(R.id.buttonGoLvl5_1);
        //создаем кнопкe обработчик
        buttonGoLvl5_1.setOnClickListener(new View.OnClickListener() {
            //создаем выход обратно
            @Override
            public void onClick(View view) {
                buttonSound.start();
                Intent intent = new Intent(Lvl5Activity.this, Lvl5_1Activity.class);
                startActivity(intent);
            }
        });
    }
}
