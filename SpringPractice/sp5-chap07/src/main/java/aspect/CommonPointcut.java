/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aspect;

import org.aspectj.lang.annotation.Pointcut;

/**
 *
 * @author Yoon
 */
public class CommonPointcut {

    @Pointcut("execution(public * chap07..*(long))")
    public void commonTarget() {

    }
}
