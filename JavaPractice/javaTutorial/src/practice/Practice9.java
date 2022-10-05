/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author Yoon
 */
public class Practice9 {

    public static void main(String[] args) {
        Practice9_parent Parent = new Practice9_parent("sik");
        Practice9_child Child = new Practice9_child("sik");

        Practice9_parent changeParent = new Practice9_child("sik");

        Parent.method2();
        Child.method2();

        changeParent.method2(); // method overriding

        Child.typeCheck(Parent);
        Child.typeCheck(Child);
        //changeParent.method3(); 불가능
        Child.typeCheck(changeParent); // instanceof로 원래 자식형으로 변환가능한지 확인

    }

}
