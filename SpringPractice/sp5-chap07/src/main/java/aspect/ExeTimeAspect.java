/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aspect;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

/**
 *
 * @author Yoon
 */
@Aspect
//@Order(1)
public class ExeTimeAspect {

    @Pointcut("execution(public * chap07..*(..))")
    private void publicTarget() {

    }

    @Around("publicTarget()")
    public Object measure(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.nanoTime();

        try {
            Object res = joinPoint.proceed();
            return res;
        } finally {
            long end = System.nanoTime();
            Signature sig = joinPoint.getSignature();

            System.out.println(joinPoint.getTarget().getClass().getSimpleName()+ "."+sig.getName()+ " 실행 시간fac(" +Arrays.toString(joinPoint.getArgs())+ ") : " + (end - start));
        }
    }

}
