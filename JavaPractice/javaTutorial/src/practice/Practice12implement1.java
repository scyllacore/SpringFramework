/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author Yoon
 */
public class Practice12implement1 implements Practice12interface {
 
    @Override
    public void fuc(int n){
        System.out.println(n + " 1");
    }
    
    @Override
    public void f(){
        System.out.println("f1");
    }
    
     void imple()
    {
        System.out.println("imple1");
    }  
     
     
    @Override
    public void interChild(){
        System.out.println("imp1의 inter override");
    } 
     
     @Override
    public void interParent(){
        System.out.println("abstract 재정의1");
    };
    
}
    
