/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chap07;

/**
 *
 * @author Yoon
 */
public class RecCalculator implements Calculator {

    @Override
    public long factorial(long num) {
       // long start = System.currentTimeMillis();

        try {
            if (num <= 1) {
                return 2;
            }
            return num * factorial(num - 1);
        } finally {
      //      long end = System.currentTimeMillis();
       //     System.out.println("Rec 실행 시간 : " + (end - start));
        }
    }

}
