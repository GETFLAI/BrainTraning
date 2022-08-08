package com.example.braintrainingexclusivefromitcube.core.assets;

import com.example.braintrainingexclusivefromitcube.core.Core;
import com.example.braintrainingexclusivefromitcube.core.assets.graphic.Graphic;

public class LoaderAssets {
    public LoaderAssets(Core core, Graphic graphic){
        loadAudio(core);
    }

    private void loadAudio(Core core) {
        UtilResource.gameMusic = core.getAudio().newMusic("MainMenu.mp3");
    }
}
