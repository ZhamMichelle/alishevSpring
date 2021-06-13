package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        //обращается к файлу applicationContext.xml, считывает его и
        //помещает все бины, которые там есть, в ApplicationContext
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        PlayMusic firstPlayMusic=context.getBean("playMusic",PlayMusic.class);
        PlayMusic secondPlayMusic=context.getBean("playMusic",PlayMusic.class);

        boolean comparison = firstPlayMusic==secondPlayMusic;

        context.close();
    }
}
