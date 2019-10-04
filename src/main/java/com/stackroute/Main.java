package com.stackroute;

import com.stackroute.components.AppConfig;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main( String[] args ) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Movie y_movie = ctx.getBean(Movie.class);
        y_movie.printActor();
        ((AnnotationConfigApplicationContext)ctx).close();
    }
}
