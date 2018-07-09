package com.assuresoftTemplate;

public abstract class Game {
    abstract void initialized();
    abstract void startPlay();
    abstract void endPlay();
    public final void play(){
        initialized();
        startPlay();
        endPlay();
    }
}
