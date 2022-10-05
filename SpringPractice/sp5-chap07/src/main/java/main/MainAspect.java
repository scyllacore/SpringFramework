/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import chap07.Calculator;
import chap07.RecCalculator;
import config.AppCtx;

/**
 *
 * @author Yoon
 */

public class MainAspect {
   
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
        
        Calculator cal = ctx.getBean("calculator",Calculator.class);
        //RecCalculator cal = ctx.getBean("calculator",RecCalculator.class);
        
        long fiveFact = cal.factorial(5);
        
        System.out.println("cal.fac(5) = " + fiveFact);
        System.out.println(cal.getClass().getName());
        ctx.close();
        
    }
    
    
}
