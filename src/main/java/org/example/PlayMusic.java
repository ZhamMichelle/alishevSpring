package org.example;

//import org.apache.logging.log4j.*;
import org.apache.logging.log4j.Level;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class PlayMusic {
//    private final static Logger logger = LogManager.getLogger(PlayMusic.class);
    private final static Logger logger = LoggerFactory.getLogger(PlayMusic.class);
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

        logger.warn("name={}", name);
        logger.error("name={}", name);
        logger.info("name={}", name);
        logger.debug("name={}", name);
        logger.trace("name={}", name);
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
