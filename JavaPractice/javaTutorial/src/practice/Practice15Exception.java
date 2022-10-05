/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author Yoon
 */
public class Practice15Exception extends Exception {
    
    public Practice15Exception(){
        System.out.println("예외처리");
    }
    
     public Practice15Exception(String message){
         super(message);
         System.out.println("예외처리 " + message);
     }
    
    
}
