package com.example.braintrainingexclusivefromitcube;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Lvl1_2 extends AppCompatActivity {
    ImageButton imageButton;
    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvl1_2);

        //находим картику среди наших ресурсов
        imageButton=(ImageButton) findViewById(R.id.imageButton);
        //создаем обработчик
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageButton.setImageResource(R.drawable.mozayka1_2);
            }
        });
        //обработчик 2
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageButton.setImageResource(R.drawable.mozayka1_1);
            }
        });
        //обработчик 3
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageButton.setImageResource(R.drawable.mozayka1);
            }
        });

        //находим картику2 среди наших ресурсов
        imageButton=(ImageButton) findViewById(R.id.imageButton2);
        //создаем обработчик
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageButton.setImageResource(R.drawable.mozayka2_1);
            }
        });
        //обработчик 2
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageButton.setImageResource(R.drawable.mozayka2_2);
            }
        });
        //обработчик 3
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { imageButton.setImageResource(R.drawable.mozayka2_1); }//картинка 2 удалена, надо будет вернуть
        });

        //находим картику3 среди наших ресурсов
        imageButton=(ImageButton) findViewById(R.id.imageButton3);
        //создаем обработчик
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageButton.setImageResource(R.drawable.mozayka3);
            }
        });
        //обработчик 2
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageButton.setImageResource(R.drawable.mozayka3_1);
            }
        });
        //обработчик 3
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageButton.setImageResource(R.drawable.mozayka3_2);
            }
        });

        //находим картику4 среди наших ресурсов
        imageButton=(ImageButton) findViewById(R.id.imageButton4);
        //создаем обработчик
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageButton.setImageResource(R.drawable.mozayka4);
            }
        });
        //обработчик 2
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageButton.setImageResource(R.drawable.mozayka4_1);
            }
        });
        //обработчик 3
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageButton.setImageResource(R.drawable.mozayka4_2);
            }
        });

        //находим картику5 среди наших ресурсов
        imageButton=(ImageButton) findViewById(R.id.imageButton5);
        //создаем обработчик
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageButton.setImageResource(R.drawable.mozayka5_2);
            }
        });
        //обработчик 2
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageButton.setImageResource(R.drawable.mozayka5);
            }
        });
        //обработчик 3
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageButton.setImageResource(R.drawable.mozayka5_1);
            }
        });

        //находим картику6 среди наших ресурсов
        imageButton=(ImageButton) findViewById(R.id.imageButton6);
        //создаем обработчик
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageButton.setImageResource(R.drawable.mozayka6_1);
            }
        });
        //обработчик 2
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageButton.setImageResource(R.drawable.mozayka6_2);
            }
        });
        //обработчик 3
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageButton.setImageResource(R.drawable.mozayka6);
            }
        });

        //находим картику7 среди наших ресурсов
        imageButton=(ImageButton) findViewById(R.id.imageButton7);
        //создаем обработчик
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageButton.setImageResource(R.drawable.mozayka7_2);
            }
        });
        //обработчик 2
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageButton.setImageResource(R.drawable.mozayka7);
            }
        });
        //обработчик 3
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageButton.setImageResource(R.drawable.mozayka7_1);
            }
        });

        //находим картику8 среди наших ресурсов
        imageButton=(ImageButton) findViewById(R.id.imageButton8);
        //создаем обработчик
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageButton.setImageResource(R.drawable.mozayka8);
            }
        });
        //обработчик 2
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageButton.setImageResource(R.drawable.mozayka8_1);
            }
        });
        //обработчик 3
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageButton.setImageResource(R.drawable.mozayka8_2);
            }
        });

        //находим картику9 среди наших ресурсов
        imageButton=(ImageButton) findViewById(R.id.imageButton9);
        //создаем обработчик
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageButton.setImageResource(R.drawable.mozayka9_1);
            }
        });
        //обработчик 2
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageButton.setImageResource(R.drawable.mozayka9_2);
            }
        });
        //обработчик 3
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageButton.setImageResource(R.drawable.mozayka9);
            }
        });
    }
}
