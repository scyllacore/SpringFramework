/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.scyllacore.mavenapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 *
 * @author Yoon
 */
@Configuration
public class AppContext {
    
    @Bean
    public Greeter greeter(){
        Greeter g= new Greeter();
        g.setFormat("%s,안녕하세요!");
        return g;
    }
}
