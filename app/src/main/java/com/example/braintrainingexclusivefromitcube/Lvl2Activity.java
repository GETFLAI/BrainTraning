package com.example.braintrainingexclusivefromitcube;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Lvl2Activity extends AppCompatActivity {

    //создаем переменную звука кнопки
    public MediaPlayer buttonSound;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvl2);

        //создаём связку уровень 2 - 2_1
        //инициализируем переменную звука кнопки
        buttonSound = MediaPlayer.create(this, R.raw.button);
        //создаём обработчик кнопки
        Button buttonGoLvl2_1 = (Button) findViewById(R.id.buttonGoLvl2_1);
        //создаем кнопкe обработчик
        buttonGoLvl2_1.setOnClickListener(new View.OnClickListener() {
            //создаем выход обратно
            @Override
            public void onClick(View view) {
                buttonSound.start();
                Intent intent = new Intent(Lvl2Activity.this, Lvl2_1Activity.class);
                startActivity(intent);
            }
        });
    }
}
