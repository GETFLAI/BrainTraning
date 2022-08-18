package com.example.braintrainingexclusivefromitcube;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Lvl2TaskActivity extends AppCompatActivity {
    //создаем переменную звука кнопки
    private MediaPlayer buttonSound;
    //поле для ввода ответа
    private EditText vopros2;
    //кнопки
    private Button btBack;
    private Button btNext;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvl2_task);
        //инициализируем переменную звука кнопки
        buttonSound = MediaPlayer.create(this, R.raw.button);
        // инициализируем EditText
        vopros2 = findViewById(R.id.Vopros2);
        //инициализируем кнопки
        btBack = findViewById(R.id.buttonBack);
        btNext = findViewById(R.id.buttonNext);
        //далее/назад
        btBack.setOnClickListener(new View.OnClickListener() {
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
                Intent intent = new Intent(Lvl2TaskActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });

        if(vopros2.getText().toString().toLowerCase().equals("ветер")){
            AlertDialog.Builder b = new AlertDialog.Builder(Lvl2TaskActivity.this);
            b.setTitle("Поздравляем!");
            b.setMessage("Вы прошли второй уровень!");
            b.setPositiveButton("ок", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            });
            AlertDialog d = b.create();
            d.show();

            btNext.setVisibility(View.VISIBLE);
            findViewById(R.id.barrier).setVisibility(View.VISIBLE);
        }
    }
}