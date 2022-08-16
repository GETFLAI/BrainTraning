package com.example.braintrainingexclusivefromitcube.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;

public class BitmapMosaicUtil {

    public static Bitmap[][] sliceBitmap(Bitmap source, int x, int y) {
        Bitmap[][] res = new Bitmap[y][x];
        int height = (int) Math.floor(source.getHeight()/y) * y;
        int width = (int) Math.floor(source.getWidth()/x) * x;
        source = Bitmap.createBitmap(source, 0, 0, width, height, null, false);

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
               res[j][i] = Bitmap.createBitmap(source, i*source.getWidth()/x, j*source.getHeight()/y, source.getWidth()/x, source.getHeight()/y, null, false);
            }
        }

        return res;
    }
}
