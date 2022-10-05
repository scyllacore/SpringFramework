/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import config.AppCtx;
import spring.Client;
import spring.Client2;


/**
 *
 * @author Yoon
 */
public class Main {
    
    public static void main(String[] args) throws IOException {
        AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
        
//        Client client = ctx.getBean(Client.class);
//        client.send();
//        ctx.close();
 
        Client2 client2 = ctx.getBean(Client2.class);
        client2.send();
        ctx.close();   
        
    }
    
}
