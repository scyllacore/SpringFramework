/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppCtxWithCache;
import chap07.Calculator;

/**
 *
 * @author Yoon
 */
public class MainAspectWithCache {
     public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtxWithCache.class);
        
        Calculator cal = ctx.getBean("calculator",Calculator.class);
        //RecCalculator cal = ctx.getBean("calculator",RecCalculator.class);
        
        cal.factorial(7);
        cal.factorial(7);
        cal.factorial(5);
        cal.factorial(5);
        ctx.close();
        
    }
    
}
