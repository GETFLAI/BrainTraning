package com.example.braintrainingexclusivefromitcube;

import com.example.braintrainingexclusivefromitcube.Graphic;

public class LoaderAssets {
    public LoaderAssets(Core core, Graphic graphic){
        loadAudio(core);
    }

    private void loadAudio(Core core) {
        UtilResource.gameMusic = core.getAudio().newMusic("MainMenu.mp3");
    }
}
