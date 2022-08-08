package com.example.braintrainingexclusivefromitcube.view;

import static android.provider.SyncStateContract.Helpers.update;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class RotatableSquareImageView extends androidx.appcompat.widget.AppCompatImageView {

    private Rotate rotate;
    private Bitmap master;
    private Bitmap[] variants = new Bitmap[4];

    public RotatableSquareImageView(@NonNull Context context) {
        super(context);
    }

    public RotatableSquareImageView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public RotatableSquareImageView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setMaster(Rotate rotate, Bitmap master){
        this.rotate = rotate;
        this.master = master;

        Matrix matrix0 = new Matrix();
        Matrix matrix1 = new Matrix();
        Matrix matrix2 = new Matrix();
        Matrix matrix3 = new Matrix();

        matrix0.postRotate(0);
        matrix1.postRotate(90);
        matrix2.postRotate(180);
        matrix3.postRotate(270);

        variants[0] = Bitmap.createBitmap(master, 0, 0, master.getWidth(), master.getHeight(), matrix0, true);
        variants[1] = Bitmap.createBitmap(master, 0, 0, master.getWidth(), master.getHeight(), matrix1, true);
        variants[2] = Bitmap.createBitmap(master, 0, 0, master.getWidth(), master.getHeight(), matrix2, true);
        variants[3] = Bitmap.createBitmap(master, 0, 0, master.getWidth(), master.getHeight(), matrix3, true);

        update();
    }

    public boolean isMaster(){
        return rotate.equals(Rotate.FIRST);
    }

    private void update(){
        switch(rotate){
            case FIRST:
                setImageBitmap(variants[0]);
                break;
            case SECOND:
                setImageBitmap(variants[1]);
                break;
            case THIRD:
                setImageBitmap(variants[2]);
                break;
            case FOURTH:
                setImageBitmap(variants[3]);
                break;
        }
    }

    public void rotate(){
        switch(rotate){
            case FIRST:
                rotate = Rotate.SECOND;
                update();
                break;
            case SECOND:
                rotate = Rotate.THIRD;
                update();
                break;
            case THIRD:
                rotate = Rotate.FOURTH;
                update();
                break;
            case FOURTH:
                rotate = Rotate.FIRST;
                update();
                break;
        }
    }

    public enum Rotate{
        FIRST, SECOND, THIRD, FOURTH;
    }
}
