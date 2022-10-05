/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import config.AppCtxWithPrototype;
import spring.Client;
import spring.Client2;

/**
 *
 * @author Yoon
 */
public class MainWithPrototype {

    public static void main(String[] args) throws IOException {
        AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtxWithPrototype.class);

        Client client1 = ctx.getBean(Client.class);
        Client client2 = ctx.getBean(Client.class);
        System.out.println("프로토타입 client 비교 : " + (client1 == client2));

        Client2 client3 = ctx.getBean(Client2.class);
        Client2 client4 = ctx.getBean(Client2.class);
        System.out.println("싱글톤 client 비교 : " + (client3 == client4));

        ctx.close();

    }

}
