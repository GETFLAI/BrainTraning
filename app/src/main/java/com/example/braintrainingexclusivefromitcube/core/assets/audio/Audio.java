package com.example.braintrainingexclusivefromitcube.core.assets.audio;


import android.app.Activity;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.AudioManager;

import java.io.IOException;

public class Audio {
    //создаем ассет для загруззки файлов музыки
    AssetManager assetManager;

    //создаем конструктор
    public Audio(Activity activity) {
        //создаем метод для прямого обращения к активити и управления звуком
        activity.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        assetManager = activity.getAssets();
    }
    //создаем метод для возвращение новой музыки
    public Music newMusic(String fileName){
        //используем метод для получения файла
        AssetFileDescriptor assetFileDescriptor = null;
        //проверяем на исключения
        try {
            assetFileDescriptor = assetManager.openFd(fileName);
            return new Music(assetFileDescriptor);
        } catch (IOException e) {
            throw new RuntimeException("Невозможно загрузить музыку");
        }
    }
}
