/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author Yoon
 */
public class Practice13 {
    
    public static void main(String[] args) {
        
        Practice13_class test1 = new Practice13_class();
        
        Practice13_class.Practice13_class1 test2 = test1.new Practice13_class1(); // 인스턴스형 중첩 클래스는 객체를 생성하고 사용 가능 
        
        test1.method();
        test2.method1();
        
        Practice13_class.Practice13_class2 test3 = new Practice13_class.Practice13_class2();
        
        test3.method1();
        
         Practice13_class.Practice13_class2.method2();
        
    }
    
}
