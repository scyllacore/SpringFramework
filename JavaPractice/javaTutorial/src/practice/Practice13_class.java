/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author Yoon
 */
public class Practice13_class {
    
    
    int val;
    static int stVal;
    Practice13_class1 Pc1 = new Practice13_class1();
    //static  Practice13_class1 Pc2 = new Practice13_class1();
    

    Practice13_class() {
        System.out.println("Practice13_class객체 생성자");
    }

    class Practice13_class1 {

        Practice13_class1() {
            System.out.println("Practice13_class1 중첩객체");
        }

        void method1() {
            System.out.println("Practice13_class1 중첩객체 메소드");
        }

    }

    static class Practice13_class2 {

        Practice13_class2() {
            System.out.println("static형 Practice13_class2 중첩객체 생성자");
        }

        void method1() {
            System.out.println("Practice13_class2 중첩객체 인스턴스 멤버 메소드1");
        }

        static void method2() {
            System.out.println("static형 Practice13_class2 중첩객체 인스턴스 멤버 메소드2");
        }

    }

    void method() {
        
         Practice13_class1 Pc1 = new Practice13_class1();
    //static  Practice13_class1 Pc2 = new Practice13_class1();
        
        val=10;
        stVal =20; // static method에서는 사용할 수 없다.
    
        class Practice13_class3 {

            Practice13_class3() {
                System.out.println("메소드 호출형 Practice13_class3 인스턴스 객체 생성자");
            }

            void method1() {
                System.out.println("Practice13_class3 중첩객체 인스턴스 멤버 메소드1");
            }

//        static void method2() {
//            System.out.println("static형 Practice13_class2 중첩객체 인스턴스 멤버 메소드2");
//        }
           
        }
        Practice13_class3 test = new Practice13_class3();
    }
}
