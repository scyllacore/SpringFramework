/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author Yoon
 */
public class Practice7 extends Practice7_parent {
   
    int c,d;

    public Practice7(int c, int d, int a, int b) {
        super(a, b);
        this.c = c;
        this.d = d;
    }
    
    @Override
    public int sum(int c,int d){//protected
        return super.sum(a, b)+c+d;
    }
    
        
    public static void main(String[] args) {
        
        Practice7 test = new Practice7(1,2,3,4);
        
        System.out.println(test.a + " " + test.d);
        
        System.out.println(test.sum(1, 2));
            
        
    }
          
   
    
}
