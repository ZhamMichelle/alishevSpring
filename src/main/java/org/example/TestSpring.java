package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        //обращается к файлу applicationContext.xml, считывает его и
        //помещает все бины, которые там есть, в ApplicationContext
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Music music= context.getBean("musicBean",Music.class);
        PlayMusic playMusic=new PlayMusic(music);
        playMusic.player();

        context.close();
    }
}
