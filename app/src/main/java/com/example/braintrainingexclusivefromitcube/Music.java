package com.example.braintrainingexclusivefromitcube;

import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;

import java.io.IOException;

public class Music implements MediaPlayer.OnCompletionListener {
    //создаем объект плеер
    MediaPlayer mediaPlayer;
    //создаем переменную для показа готовности музыки к воспроизведению
    boolean isPrepared = false;
    //создаем конструктор для загруззки файла
    public Music(AssetFileDescriptor assetFileDescriptor){
        //инициализируем медиаплееер
        mediaPlayer = new MediaPlayer();
        //try-catch используем для отслеживания исключений
        //задаём ресурсы
        try {
            mediaPlayer.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        } catch (IOException e) {
            e.printStackTrace();
        }
        //используем метод для подготовки плеера
        try {
            mediaPlayer.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //меняем значение для отслеживания работы плеера
        isPrepared=true;

        //пишем слушателя
        mediaPlayer.setOnCompletionListener(this);
    }
    //метод для запуска плеера
    //1 значение отвечает за зацикленность, 2 за звук
    public void play(boolean looping, float volume){
        //проверяем работу плеера
        if(mediaPlayer.isPlaying()){
            return;
        }
        //используем метод для предотвращения накладывания потоков
        synchronized (this){
            //проверяем готовность
            if(!isPrepared){
                try {
                    mediaPlayer.prepare();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            //передаем значение зацикленности
            mediaPlayer.setLooping(looping);
            //передаём значение звука ( лево и право )
            mediaPlayer.setVolume(volume, volume);
            mediaPlayer.start();
        }
    }

    //создаем метод для остановки музыки
    public void stop(){
        mediaPlayer.stop();
        synchronized (this){
            isPrepared = false;
        }
    }

    //создаем метод для удалени
    public void dispose(){
        mediaPlayer.stop();
        mediaPlayer.release();
    }
    @Override
    public void onCompletion(MediaPlayer mediaPlayer) {
        synchronized (this){
            isPrepared = false;
        }
    }
}
