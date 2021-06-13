package org.example;

public class PlayMusic {
    private Music music;
    private String name;
    private int volume;

    public PlayMusic() {
    }

    //IoC
    public PlayMusic(Music music) {
        this.music = music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void player() {
        System.out.println("playing: " + music.getSong());
    }
}
