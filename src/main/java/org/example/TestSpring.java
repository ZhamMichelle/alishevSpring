package org.example;

import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Date;

import static org.apache.commons.lang3.StringUtils.trimToEmpty;
import static com.google.common.base.Preconditions.checkNotNull;


public class TestSpring {
    public static void main(String[] args) throws URISyntaxException {
        //обращается к файлу applicationContext.xml, считывает его и
        //помещает все бины, которые там есть, в ApplicationContext
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        String limit = "12:00:00";
        DateTimeFormatter df = DateTimeFormat.forPattern("HH:mm:ss");
        DateTime lim = df.parseLocalTime(limit).toDateTimeToday();
        DateTime relativeTime = new DateTime(new Date());

        System.out.println(relativeTime.isAfter(lim) ? true : false);
        PlayMusic firstPlayMusic = context.getBean("playMusic", PlayMusic.class);
        PlayMusic secondPlayMusic = context.getBean("playMusic", PlayMusic.class);

        System.out.println(firstPlayMusic.getName());

        boolean comparison = firstPlayMusic == secondPlayMusic;
        System.out.println("empty: " + StringUtils.EMPTY);
        String path = "/my-orders/#!/order/{order-code}";
        //{matches("(\\$[a-zA-Z0-9]+\\.)*" + field + "(\\.\\$[a-zA-Z0-9]+)*"))
        //{matches("(\\$[a-zA-Z0-9]+\\.)*" + field + "(\\.\\$[a-zA-Z0-9]+)*"))
//"\\d\\{\\*\\}"
//        URI u = new URI(path);
//        System.out.println(u);
        String test = "order-code";
        System.out.println("matches: " + path.matches(".*\\{" + test + "}*$"));
        System.out.println("end: " + path.matches(".*\\{(.)}*$"));



        String lala = "gfgt";
        String lastName = trimToEmpty(lala);
        System.out.println("trim: " + lastName + "trim");

        checkNotNull(lala, "[lala] can mfdk");

        context.close();
    }
}
