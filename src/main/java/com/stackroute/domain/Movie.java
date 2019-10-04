package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

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
}
