package com.example.braintrainingexclusivefromitcube;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import com.google.firebase.database.DatabaseReference;

public class Core extends AppCompatActivity {
    private final float FRAME_BUFFER_WIDTH = 800;
    private final float FRAME_BUFFER_HIGHT = 600;


    private Loop loop;
    private Graphic graphic;
    private DatabaseReference myDataBase;
    private Audio audio;

    private Display display;
    private Point sizeDisplay;
    private Bitmap frameBuffer;
    //места для сцены

    private boolean stateOnPause;
    private boolean stateOnResume;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //запрешаем переход в спящий режим
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        //получаем размер экрана
        sizeDisplay = new Point();
        display = getWindowManager().getDefaultDisplay();
        display.getSize(sizeDisplay);

        frameBuffer = Bitmap.createBitmap((int) FRAME_BUFFER_WIDTH, (int) FRAME_BUFFER_HIGHT, Bitmap.Config.ARGB_8888);

        //loop = new Loop(this, frameBuffer);
        graphic = new Graphic(getAssets(), frameBuffer);

        stateOnPause = false;
        stateOnResume = false;
        //setContentView(loop); //пока не решил проблему

        audio = new Audio(this);
    }

    public Core() {

    }

    public void onResume() {
        super.onResume();
        //место для сцены
        loop.startGame();
    }

    public void inPause() {
        super.onPause();
        //место для сыены
        loop.stopGame();
        stateOnPause = true;
        if (isFinishing()) {
            //место для сцены
        }
    }

    //возвращение графики
    public Graphic getGraphic() {
        return graphic;
    }
    //задование сцены
    //public void setScene(Scene scene){
    //if(scene == null){
    // throw new IlegalArgumentException("Не возможно загрузить сцену");
    // }
    //this.scene.pause();
    //this.scene.dispose();
    //scene.resume();
    //scene.update();
    //this.scene=scene;
    // }
    //получение сцены
    //public Scene getCurrentScene(){
    //return scene;
    //}
    //получение новой сцены
    //public Scene getStartScene(){
    //return scene;
    // }

    public Audio getAudio() {
        return audio;
    }
}
