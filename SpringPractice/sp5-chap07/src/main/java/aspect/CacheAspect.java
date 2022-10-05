/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aspect;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import org.springframework.core.annotation.Order;

/**
 *
 * @author Yoon
 */
@Aspect
//@Order(2)
public class CacheAspect {

    private Map<Long, Object> cache = new HashMap<>();

    @Pointcut("execution(public * chap07..*(long))")
    public void cacheTarget() {

    }

    //@Around("cacheTarget()")
    @Around("aspect.CommonPointcut.commonTarget()")
    public Object execute(ProceedingJoinPoint joinPoint) throws Throwable {
        Long num = (Long) joinPoint.getArgs()[0];

        if (cache.containsKey(num)) {
            System.out.println("CacheAspect : Cache에서 구함" + "[" + num + "]");
            return cache.get(num);
        }
        
        Object res = joinPoint.proceed();
        cache.put(num, res);
        System.out.println("CacheAspect : Cache에 추가" + "[" + num + "]");
        return res;
    }

}
