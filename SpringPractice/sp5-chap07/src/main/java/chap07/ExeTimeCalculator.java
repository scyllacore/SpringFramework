/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chap07;

/**
 *
 * @author Yoon
 */
public class ExeTimeCalculator implements Calculator {

    private Calculator delegate;

    public ExeTimeCalculator(Calculator delegate) {
        this.delegate = delegate;
    }

    @Override
    public long factorial(long num) {
        long start = System.nanoTime();
        long res = delegate.factorial(num);
        long end = System.nanoTime();
        System.out.println(delegate.getClass().getSimpleName() + " 실행 시간fac(" + num + ") : " + (end - start));
        return res;
    }

}
