package com.example.braintrainingexclusivefromitcube;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.braintrainingexclusivefromitcube.view.RotatableSquareImageView;

public class Lvl1TaskActivity extends AppCompatActivity {

    //создаем переменную звука кнопки
    private MediaPlayer buttonSound;

    private Button btBack;
    private Button btNext;

    private RotatableSquareImageView imageButton1;
    private RotatableSquareImageView imageButton2;
    private RotatableSquareImageView imageButton3;
    private RotatableSquareImageView imageButton4;
    private RotatableSquareImageView imageButton5;
    private RotatableSquareImageView imageButton6;
    private RotatableSquareImageView imageButton7;
    private RotatableSquareImageView imageButton8;
    private RotatableSquareImageView imageButton9;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvl1_task);

        //создаём связку уровень 1_2 - меню
        //инициализируем переменную звука кнопки
        buttonSound = MediaPlayer.create(this, R.raw.button);
        //инициализируем переменную кнопки
        btBack = findViewById(R.id.buttonBack);
        btNext = findViewById(R.id.buttonNext);
        // далее/назад
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
                Intent intent = new Intent(Lvl1TaskActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });

        imageButton1 = findViewById(R.id.imageButton);
        imageButton2 = findViewById(R.id.imageButton2);
        imageButton3 = findViewById(R.id.imageButton3);
        imageButton4 = findViewById(R.id.imageButton4);
        imageButton5 = findViewById(R.id.imageButton5);
        imageButton6 = findViewById(R.id.imageButton6);
        imageButton7 = findViewById(R.id.imageButton7);
        imageButton8 = findViewById(R.id.imageButton8);
        imageButton9 = findViewById(R.id.imageButton9);

        imageButton1.setMaster(RotatableSquareImageView.Rotate.FIRST, ((BitmapDrawable)getDrawable(R.drawable.mozayka1)).getBitmap());
        imageButton2.setMaster(RotatableSquareImageView.Rotate.SECOND, ((BitmapDrawable)getDrawable(R.drawable.mozayka2)).getBitmap());
        imageButton3.setMaster(RotatableSquareImageView.Rotate.FOURTH, ((BitmapDrawable)getDrawable(R.drawable.mozayka3)).getBitmap());
        imageButton4.setMaster(RotatableSquareImageView.Rotate.FOURTH, ((BitmapDrawable)getDrawable(R.drawable.mozayka4)).getBitmap());
        imageButton5.setMaster(RotatableSquareImageView.Rotate.SECOND, ((BitmapDrawable)getDrawable(R.drawable.mozayka5)).getBitmap());
        imageButton6.setMaster(RotatableSquareImageView.Rotate.SECOND, ((BitmapDrawable)getDrawable(R.drawable.mozayka6)).getBitmap());
        imageButton7.setMaster(RotatableSquareImageView.Rotate.FOURTH, ((BitmapDrawable)getDrawable(R.drawable.mozayka7)).getBitmap());
        imageButton8.setMaster(RotatableSquareImageView.Rotate.FOURTH, ((BitmapDrawable)getDrawable(R.drawable.mozayka8)).getBitmap());
        imageButton9.setMaster(RotatableSquareImageView.Rotate.FIRST, ((BitmapDrawable)getDrawable(R.drawable.mozayka9)).getBitmap());

        View.OnClickListener onImageClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((RotatableSquareImageView)view).rotate();
                if(
                        imageButton1.isMaster() &&
                                imageButton2.isMaster() &&
                                imageButton3.isMaster() &&
                                imageButton4.isMaster() &&
                                imageButton5.isMaster() &&
                                imageButton6.isMaster() &&
                                imageButton7.isMaster() &&
                                imageButton8.isMaster() &&
                                imageButton9.isMaster()
                ){
                    // если все картинки в изначальном положении
                    AlertDialog.Builder b = new AlertDialog.Builder(Lvl1TaskActivity.this);
                    b.setTitle("Поздравляем!");
                    b.setMessage("Вы прошли первый уровень!");
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
        };

        imageButton1.setOnClickListener(onImageClickListener);
        imageButton2.setOnClickListener(onImageClickListener);
        imageButton3.setOnClickListener(onImageClickListener);
        imageButton4.setOnClickListener(onImageClickListener);
        imageButton5.setOnClickListener(onImageClickListener);
        imageButton6.setOnClickListener(onImageClickListener);
        imageButton7.setOnClickListener(onImageClickListener);
        imageButton8.setOnClickListener(onImageClickListener);
        imageButton9.setOnClickListener(onImageClickListener);

    }
}