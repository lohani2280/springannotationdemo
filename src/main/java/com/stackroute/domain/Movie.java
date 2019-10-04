package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {
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

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean factory: " + beanFactory);
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean Name: " + s);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application Context: " + applicationContext);
    }
}
