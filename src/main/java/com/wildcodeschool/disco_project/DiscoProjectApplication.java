package com.wildcodeschool.disco_project;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DiscoProjectApplication {

    private static Logger L = LoggerFactory.getLogger(DiscoProjectApplication.class);


    public static void main(String[] args) {
        L.info("starting app..");
        new SpringApplication(DiscoProjectApplication.class).run();
    }
//    public static void main(String[] args) {
//        SpringApplication.run(DiscoProjectApplication.class, args);
//    }
//}
}