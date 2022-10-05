/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chap07;

/**
 *
 * @author Yoon
 */
public class ImpeCalculator implements Calculator {

    @Override
    public long factorial(long num) {
        
       // long start =System.currentTimeMillis();
        
        long res = 1;

        for (long i = 1; i <= num; i++) {
            res *= i;
        }
        
       // long end = System.currentTimeMillis();
       // System.out.println("Impe 실행 시간 : " + (end-start));
        
        return res;

    }

}
