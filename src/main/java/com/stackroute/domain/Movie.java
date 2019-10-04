package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Movie {
//    @Autowired
    private Actor actor1;

    @Autowired
    public Movie(Actor actor1) {
        this.actor1 = actor1;
    }

//    @Autowired
    public void setActor1(Actor actor2) {
        this.actor1 = actor2;
    }

    public void printActor() {
        actor1.printActorInfo();
    }

    @PostConstruct
    public void init(){
        System.out.println("Custom init-method called");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Custom destroy-method called");
    }
}
