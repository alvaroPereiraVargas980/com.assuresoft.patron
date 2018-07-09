package com.assuresoftTemplate;

public class Cricket extends Game {
    @Override
    void initialized() {
        System.out.println("Cricket Game Finished!");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Initialized");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game Started, Enjoy the game");
    }
}
