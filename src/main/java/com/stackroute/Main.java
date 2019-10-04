package com.stackroute;

import com.stackroute.components.AppConfig;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main( String[] args ) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Movie x_movie = ctx.getBean("movieA", Movie.class);
        x_movie.printActor();
        Movie y_movie = ctx.getBean("movieB", Movie.class);
        y_movie.printActor();

        System.out.println(x_movie == y_movie);
    }
}
