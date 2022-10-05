/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.scyllacore.mavenapp;

/**
 *
 * @author Yoon
 */
public class Greeter {
    private String format;
    
    public String greet(String guest){
        return String.format(format, guest);
    }
    
    public void setFormat(String format){
        this.format = format;
    }
    
}
