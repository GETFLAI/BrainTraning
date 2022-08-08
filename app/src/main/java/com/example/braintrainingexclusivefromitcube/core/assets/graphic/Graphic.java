package com.example.braintrainingexclusivefromitcube.core.assets.graphic;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.renderscript.ScriptGroup;

import java.io.IOException;
import java.io.InputStream;

public class Graphic {
    private AssetManager assetManagerGame;
    private Bitmap frameBufferGame;//для подгона картинки под любое разрешение
    private Canvas canvasGame;
    private Paint paintGame;
    private Bitmap textureGame;

    public Graphic(AssetManager assetManagerGame, Bitmap frameBufferGame) {
        this.assetManagerGame = assetManagerGame;
        this.frameBufferGame = frameBufferGame;
        this.canvasGame = new Canvas(frameBufferGame);
        this.paintGame = new Paint();
    }
    public void clearScen(int colorRGB){
        canvasGame.drawRGB(colorRGB, colorRGB, colorRGB);
    }
    public void srawPixel(int x, int y, int color){
        paintGame.setColor(color);
        canvasGame.drawPoint(x,y,paintGame);
    }
    public void srawLine(int startx, int starty, int stopx, int stopy, int color){
        paintGame.setColor(color);
        canvasGame.drawLine(startx, starty, stopx, stopy, paintGame);
    }
    public void drawText(String text, int x, int y, int color, int sizeText, Typeface font){
        paintGame.setColor(color);
        paintGame.setTextSize(sizeText);
        paintGame.setTypeface(font);
        canvasGame.drawText(text, x, y, paintGame);
    }
    public void drawTexture (Bitmap textureGame, int x, int y){
        canvasGame.drawBitmap(textureGame,x,y,null);
    }

    public int getWidthFrameBuffer(){
        return frameBufferGame.getWidth();
    }
    public int getHeightFrameBuffer(){
        return frameBufferGame.getHeight();
    }

    //метод загрузки текстуры
    public Bitmap newTexture(String fileName){
        InputStream inputStream = null;
        try {
            inputStream = assetManagerGame.open(fileName);
            textureGame = BitmapFactory.decodeStream(inputStream);
            if(textureGame == null){
                throw new RuntimeException("Невозможно загрузить файл" + fileName);
            }
        } catch (IOException e) {
            throw new RuntimeException("Невозможно загрузить файл" + fileName);
        }
        if(inputStream != null){
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return textureGame;
    }
}
