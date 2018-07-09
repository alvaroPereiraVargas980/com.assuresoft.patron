package com.assuresoftTemplate;

import javax.swing.plaf.synth.SynthEditorPaneUI;

public class Fooball extends Game {

    @Override
    void initialized() {
        System.out.println("Football Game Initialized");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Initialized! Start palying");
    }

    @Override
    void endPlay() {
        System.out.println("Fooball Game Started. Enjoy the game");
    }
}
