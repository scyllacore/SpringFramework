/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

import java.util.Calendar;

/**
 *
 * @author Yoon
 */
public class Practice4 {
    public enum Season{
        SPRING,SUMMER,FALL,WINTER
    }
    
    public static void main(String[] args) {
        
        Season today = null;
        System.out.println(today==Season.WINTER);
            
        Calendar now = Calendar.getInstance();
        
        int year=now.get(Calendar.YEAR);
        
        switch(year){
            case 2022 -> today = Season.SUMMER; // java형 switch문 한 줄일 때 사용한다
            case 2021 -> today = Season.WINTER;
        }
        
        if(today == Season.SUMMER){
            System.out.println("봄이당");
        }
        
        System.out.println(today.name().compareTo(Season.WINTER.name()));
        
        
        
    }
    
}
