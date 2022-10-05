/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author Yoon
 */
public class Practice15parent {

    public void method1() {
        try {
            method2();
            method3();
        } catch (ClassNotFoundException e) {
            System.out.println("클래스가 존재하지 않습니다.");
        } catch (Practice15Exception e) {
            System.out.println("사용자 지정 예외처리");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public void method2() throws ClassNotFoundException {
        Class clazz = Class.forName("java.lang.String");
    }

    public void method3() throws Practice15Exception {
        //throw new Practice15Exception();
        throw new Practice15Exception("메세지를 받아왔습니다");
    }

}
