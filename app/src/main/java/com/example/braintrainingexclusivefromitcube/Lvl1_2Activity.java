package com.example.braintrainingexclusivefromitcube;

import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.braintrainingexclusivefromitcube.view.RotatableSquareImageView;
import com.google.android.filament.Texture;

public class Lvl1_2Activity extends AppCompatActivity {


    RotatableSquareImageView imageButton1;
    RotatableSquareImageView imageButton2;
    RotatableSquareImageView imageButton3;
    RotatableSquareImageView imageButton4;
    RotatableSquareImageView imageButton5;
    RotatableSquareImageView imageButton6;
    RotatableSquareImageView imageButton7;
    RotatableSquareImageView imageButton8;
    RotatableSquareImageView imageButton9;

/*
    Texture[] texturesType1Array = {getDrawable(R.drawable.mozayka1), R.drawable.mozayka1_1, R.drawable.mozayka1_2};
    Texture[] texturesType2Array = {R.drawable.mozayka2, R.drawable.mozayka2_1, R.drawable.mozayka2_2};
    Texture[] texturesType3Array = {R.drawable.mozayka3, R.drawable.mozayka3_1, R.drawable.mozayka3_2};
    Texture[] texturesType4Array = {R.drawable.mozayka4, R.drawable.mozayka4_1, R.drawable.mozayka4_2};
    Texture[] texturesType5Array = {R.drawable.mozayka5, R.drawable.mozayka5_1, R.drawable.mozayka5_2};
    Texture[] texturesType6Array = {R.drawable.mozayka6, R.drawable.mozayka6_1, R.drawable.mozayka6_2};
    Texture[] texturesType7Array = {R.drawable.mozayka7, R.drawable.mozayka7_1, R.drawable.mozayka7_2};
    Texture[] texturesType8Array = {R.drawable.mozayka8, R.drawable.mozayka8_1, R.drawable.mozayka8_2};
    Texture[] texturesType9Array = {R.drawable.mozayka9, R.drawable.mozayka9_1, R.drawable.mozayka9_2};

    @Override
    protected void onCreate(Bundle savedinstanceState) {
        super.onCreate(savedinstanceState);

        setContentView(R.layout.activity_lvl1_2);

        imageButton1 = findViewById(R.id.imageButton);
        imageButton2 = findViewById(R.id.imageButton2);
        imageButton3 = findViewById(R.id.imageButton3);
        imageButton4 = findViewById(R.id.imageButton4);
        imageButton5 = findViewById(R.id.imageButton5);
        imageButton6 = findViewById(R.id.imageButton6);
        imageButton7 = findViewById(R.id.imageButton7);
        imageButton8 = findViewById(R.id.imageButton8);
        imageButton9 = findViewById(R.id.imageButton9);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.imageButton:
                        type1 += 1;
                        if (type1 > 2){
                            type1 = 0;
                        }
                        break;
                    case R.id.imageButton2:
                        type2+=1;
                        if (type2 > 2){
                            type2 = 0;
                        }
                        break;
                    case R.id.imageButton3:
                        type3+=1;
                        if (type3 > 2){
                            type3 = 0;
                        }
                        break;
                    case R.id.imageButton4:
                        type4+=1;
                        if (type4 > 2){
                            type4 = 0;
                        }
                        break;
                    case R.id.imageButton5:
                        type5+=1;
                        if (type5 > 2){
                            type5 = 0;
                        }
                        break;
                    case R.id.imageButton6:
                        type6+=1;
                        if (type6 > 2){
                            type6 = 0;
                        }
                        break;
                    case R.id.imageButton7:
                        type7+=1;
                        if (type7 > 2){
                            type7 = 0;
                        }
                        break;
                    case R.id.imageButton8:
                        type8+=1;
                        if (type8 > 2){
                            type8 = 0;
                        }
                        break;
                    case R.id.imageButton9:
                        type9+=1;
                        if (type9 > 2){
                            type9 = 0;
                        }
                        break;

                }


                /*switch (view.getId()) {
                    case R.id.imageButton:
                        switch (type1) {
                            case 0:
                                type1 = 2;
                                imageButton1.setImageResource(R.drawable.mozayka1_2);
                                break;
                            case 1:
                                type1 = 1;
                                imageButton1.setImageResource(R.drawable.mozayka1_1);
                                break;
                            case 2:
                                type1 = 0;
                                imageButton1.setImageResource(R.drawable.mozayka1);
                                break;
                        }
                        if (type1 > 2){
                            type1 = 0;
                        }
                    case R.id.imageButton2:
                        switch (type2) {
                            case 0:
                                type2 = 2;
                                imageButton2.setImageResource(R.drawable.mozayka2_2);
                                break;
                            case 1:
                                type2 = 1;
                                imageButton2.setImageResource(R.drawable.mozayka2_1);
                                break;
                            case 2:
                                type2 = 0;
                                imageButton2.setImageResource(R.drawable.mozayka2);
                                break;
                        }
                        if (type2 > 2){
                            type2 = 0;
                        }
                    case R.id.imageButton3:
                        switch (type3) {
                            case 0:
                                type3 = 2;
                                imageButton3.setImageResource(R.drawable.mozayka3_2);
                                break;
                            case 1:
                                type3 = 1;
                                imageButton3.setImageResource(R.drawable.mozayka3_1);
                                break;
                            case 2:
                                type3 = 0;
                                imageButton3.setImageResource(R.drawable.mozayka3);
                                break;
                        }
                        if (type3 > 2){
                            type3 = 0;
                        }
                    case R.id.imageButton4:
                        switch (type4) {
                            case 0:
                                type4 = 2;
                                imageButton4.setImageResource(R.drawable.mozayka4_2);
                                break;
                            case 1:
                                type4 = 0;
                                imageButton4.setImageResource(R.drawable.mozayka4);
                                break;
                            case 2:
                                type4 = 1;
                                imageButton4.setImageResource(R.drawable.mozayka4_1);
                                break;
                        }
                        if (type4 > 2){
                            type4 = 0;
                        }
                    case R.id.imageButton5:
                        switch (type5) {
                            case 0:
                                type5 = 2;
                                imageButton5.setImageResource(R.drawable.mozayka5_2);
                                break;
                            case 1:
                                type5 = 0;
                                imageButton5.setImageResource(R.drawable.mozayka5);
                                break;
                            case 2:
                                type5 = 1;
                                imageButton5.setImageResource(R.drawable.mozayka5_1);
                                break;
                        }
                        if (type5 > 2){
                            type5 = 0;
                        }
                    case R.id.imageButton6:
                        switch (type6) {
                            case 0:
                                type6 = 2;
                                imageButton6.setImageResource(R.drawable.mozayka6_2);
                                break;
                            case 1:
                                type6 = 0;
                                imageButton6.setImageResource(R.drawable.mozayka6);
                                break;
                            case 2:
                                type6 = 1;
                                imageButton6.setImageResource(R.drawable.mozayka6_1);
                                break;
                        }
                        if (type6 > 2){
                            type6 = 0;
                        }
                    case R.id.imageButton7:
                        switch (type7) {
                            case 0:
                                type7 = 2;
                                imageButton7.setImageResource(R.drawable.mozayka7_2);
                                break;
                            case 1:
                                type7 = 0;
                                imageButton7.setImageResource(R.drawable.mozayka7);
                                break;
                            case 2:
                                type7 = 1;
                                imageButton4.setImageResource(R.drawable.mozayka7_1);
                                break;
                        }
                        if (type7 > 2){
                            type7 = 0;
                        }
                    case R.id.imageButton8:
                        switch (type8) {
                            case 0:
                                type8 = 2;
                                imageButton8.setImageResource(R.drawable.mozayka8_2);
                                break;
                            case 1:
                                type8 = 0;
                                imageButton4.setImageResource(R.drawable.mozayka8);
                                break;
                            case 2:
                                type8 = 1;
                                imageButton4.setImageResource(R.drawable.mozayka8_1);
                                break;
                        }
                        if (type8 > 2){
                            type8 = 0;
                        }
                    case R.id.imageButton9:
                        switch (type9) {
                            case 0:
                                type9 = 2;
                                imageButton9.setImageResource(R.drawable.mozayka9_2);
                                break;
                            case 1:
                                type9 = 0;
                                imageButton9.setImageResource(R.drawable.mozayka9);
                                break;
                            case 2:
                                type9 = 1;
                                imageButton9.setImageResource(R.drawable.mozayka9_1);
                                break;
                        }
                        if (type9 > 2){
                            type9 = 0;
                        }
                }

            }
        };
    }
    */

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvl1_2);

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
        imageButton2.setMaster(RotatableSquareImageView.Rotate.FIRST, ((BitmapDrawable)getDrawable(R.drawable.mozayka2)).getBitmap());
        imageButton3.setMaster(RotatableSquareImageView.Rotate.FIRST, ((BitmapDrawable)getDrawable(R.drawable.mozayka3)).getBitmap());
        imageButton4.setMaster(RotatableSquareImageView.Rotate.FIRST, ((BitmapDrawable)getDrawable(R.drawable.mozayka4)).getBitmap());
        imageButton5.setMaster(RotatableSquareImageView.Rotate.FIRST, ((BitmapDrawable)getDrawable(R.drawable.mozayka5)).getBitmap());
        imageButton6.setMaster(RotatableSquareImageView.Rotate.FIRST, ((BitmapDrawable)getDrawable(R.drawable.mozayka6)).getBitmap());
        imageButton7.setMaster(RotatableSquareImageView.Rotate.FIRST, ((BitmapDrawable)getDrawable(R.drawable.mozayka7)).getBitmap());
        imageButton8.setMaster(RotatableSquareImageView.Rotate.FIRST, ((BitmapDrawable)getDrawable(R.drawable.mozayka8)).getBitmap());
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
                    Toast.makeText(Lvl1_2Activity.this, "grrtgh", Toast.LENGTH_SHORT).show();

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