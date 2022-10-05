/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.scyllacore.mavenapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Yoon
 */
public class Main {
   
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
        Greeter g= ctx.getBean("greeter",Greeter.class);
        String msg = g.greet("스프링");
        System.out.println(msg);
        ctx.close();
   
    }

}
