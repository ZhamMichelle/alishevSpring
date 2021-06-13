package org.example;

public class PlayMusic {
    private Music music;

    //IoC
    public PlayMusic(Music music) {
        this.music = music;
    }

    public void player(){
        System.out.println("playing: " + music.getSong());
    }
}
