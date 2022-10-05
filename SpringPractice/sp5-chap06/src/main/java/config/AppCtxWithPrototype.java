/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


import spring.Client;
import spring.Client2;

/**
 *
 * @author Yoon
 */
@Configuration
public class AppCtxWithPrototype {
    @Bean
    @Scope("prototype")
    public Client client(){
        Client client = new Client();
        client.setHost("host");
        return client;
    }
    
    @Bean(initMethod = "connect",destroyMethod = "close")
    @Scope("singleton")
    public Client2 client2(){
        Client2 client2 = new Client2();
        client2.setHost("host");
        return client2;
    }
}
