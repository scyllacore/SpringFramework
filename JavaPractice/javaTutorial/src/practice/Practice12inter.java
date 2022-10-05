/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package practice;

/**
 *
 * @author Yoon
 */
public interface Practice12inter {
    
    public void f();
    
    
    public default void interParent() {
        System.out.println("interParent");
    }
    
}
