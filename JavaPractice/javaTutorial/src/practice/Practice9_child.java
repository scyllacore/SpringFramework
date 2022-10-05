/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author Yoon
 */
public class Practice9_child extends Practice9_parent {

    String name2;

    public Practice9_child(String name) {
        super(name);
        this.name2 = name + "test";
    }

    @Override
    public void method2() {
        System.out.println("자식 메소드2 : " + name + ' ' + name2);
    }
    
    public void typeCheck(Practice9_parent test) {
        
        if((test instanceof Practice9_child)){
            Practice9_child Child = (Practice9_child) test;
            Child.method3();
        }else{
            System.out.println("변형 불가능");
        }
        
        
    }
    
    public void method3() {
        System.out.println("변형 완료");
        System.out.println("자식 메소드3 : " + "method3");
    }
    
    

}
