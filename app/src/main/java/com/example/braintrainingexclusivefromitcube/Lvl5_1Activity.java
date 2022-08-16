package com.example.braintrainingexclusivefromitcube;

import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.braintrainingexclusivefromitcube.view.RotatableSquareImageView;

public class Lvl5_1Activity extends AppCompatActivity {
    //создаем переменную звука кнопки
    public MediaPlayer buttonSound;

    RotatableSquareImageView imageButton1;
    RotatableSquareImageView imageButton2;
    RotatableSquareImageView imageButton3;
    RotatableSquareImageView imageButton4;
    RotatableSquareImageView imageButton5;
    RotatableSquareImageView imageButton6;
    RotatableSquareImageView imageButton7;
    RotatableSquareImageView imageButton8;
    RotatableSquareImageView imageButton9;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvl5);

        //создаём связку уровень 5_1 - меню
        //инициализируем переменную звука кнопки
        buttonSound = MediaPlayer.create(this, R.raw.button);
        //создаём обработчик кнопки
        Button buttonGoMenu5 = (Button) findViewById(R.id.buttonGoMenu5);
        //создаем кнопкe обработчик
        buttonGoMenu5.setOnClickListener(new View.OnClickListener() {
            //создаем выход обратно
            @Override
            public void onClick(View view) {
                buttonSound.start();
                Intent intent = new Intent(Lvl5_1Activity.this, MenuActivity.class);
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
                    Toast.makeText(Lvl5_1Activity.this, "grrtgh", Toast.LENGTH_SHORT).show();

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
