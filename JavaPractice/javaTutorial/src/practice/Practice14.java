/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author Yoon
 */
public class Practice14 {

    public static void main(String[] args) {

        
    // 익명 객체    
        
        Practice14parent test =new Practice14parent()
        {
            int child;
            
            @Override
            void fuc1(){
                System.out.println("부모함수 오버라이딩");
            }

        };
        
        
       test.fuc1();
        
    }

}
