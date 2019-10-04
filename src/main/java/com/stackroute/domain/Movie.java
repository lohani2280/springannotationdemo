package com.stackroute.domain;

public class Movie {
    private Actor actor1;

    public Movie(Actor actor) {
        this.actor1 = actor;
    }

    public void setActor1(Actor actor) {
        this.actor1 = actor;
    }
    public void printActor() {
        actor1.printActorInfo();
    }
}
