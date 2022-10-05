/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author Yoon
 */
public class Practice11 {
    public static void main(String[] args) {
        Practice11interface pt = new Practice11implement();
        Practice11implement pt1 = new Practice11implement();
        Practice11interface pt2 = new Practice11interface(){
            @Override
            public void method1(){
                System.out.println("익명 구현 객체");
            }
            @Override
            public void method4(){
                System.out.println("익명 구현 객체 2");
            }
        };
        
        
        
        pt.method1();
        pt.method3();
        
        pt1.method2();
        
        pt2.method1();
        
        pt1.method5();
        
    }
}
