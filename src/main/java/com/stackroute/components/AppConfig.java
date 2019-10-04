package com.stackroute.components;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Movie getMovie(){
        Movie movie = new Movie();
        movie.setActor1(getActor());
        return movie;
    }

    @Bean
    public Actor getActor(){
        Actor actor = new Actor();
        actor.setAge(22);
        actor.setGender("Male");
        actor.setName("lohani2280");
        return actor;
    }
}
