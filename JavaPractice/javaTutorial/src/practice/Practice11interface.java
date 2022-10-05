/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package practice;

/**
 *
 * @author Yoon
 */
public interface Practice11interface {
          
    int MAX_X=10; // public static final
    
    public void method1();  // static final
    
     public void method4();
    
    public default void method3(){
        System.out.println("test");
    };
    
    
}
