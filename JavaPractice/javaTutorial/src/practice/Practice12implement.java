/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author Yoon
 */
public class Practice12implement implements Practice12interface {
 
    @Override
    public void fuc(int n){
        System.out.println(n);
    }
    
    @Override
    public void f(){
        System.out.println("f");
    }
    
    void imple()
    {
        System.out.println("imple");
    }   
    
    @Override
    public void interParent(){
        System.out.println("abstract 재정의");
    };
    
}
