package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Ran afterPropertiesSet() after all bean properties have been set");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Run destroy() after Spring container is released the bean");
    }

    @PostConstruct
    public void customInit() {
        System.out.println("BeanLifecycleDemoBean Initialized");
    }

    @PreDestroy
    public void customDestroy(){
        System.out.println("BeanLifecycleDemoBean Destroyed");
    }
}
