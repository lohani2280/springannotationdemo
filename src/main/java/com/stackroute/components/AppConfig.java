package com.stackroute.components;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.stackroute.domain")
public class AppConfig {
//    @Bean(name = {"movieA", "movieB"})
//    @Scope(value = "prototype")
//    public Movie getMovie(){
//        Movie movie = new Movie(getActor());
//        return movie;
//    }

    @Bean(name="actor1")
    public Actor getActor(){
        Actor actor = new Actor("ayush2280", "Male", 63);
        return actor;
    }
    @Bean(name="actor2")
    public Actor getActor1(){
        Actor actor = new Actor("ayush2280", "Male", 63);
        return actor;
    }
    @Bean
    public Actor getActor2(){
        Actor actor = new Actor("lohani2280", "Female", 40);
        return actor;
    }
}
