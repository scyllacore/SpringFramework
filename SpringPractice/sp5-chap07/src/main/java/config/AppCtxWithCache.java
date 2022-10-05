/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import aspect.*;
import chap07.Calculator;
import chap07.RecCalculator;

/**
 *
 * @author Yoon
 */
@Configuration
@EnableAspectJAutoProxy
public class AppCtxWithCache {

    //현재는 적은 bean 순서에 따라 Cache -> Exe 순으로 실행 처리를 한다.
    @Bean
    public CacheAspect cacheAspect() {
        return new CacheAspect();
    } // @Order1

    @Bean
    public ExeTimeAspect exeTimeAspect() {
        return new ExeTimeAspect();
    } // @Order2

    //위의 두 빈의 순서를 바꾸면 Exe가 먼저 Cache가 나중에 실행 된다.
    //이에 따라 Exe가 @Order1, Cache가 @Order2가 되는 것을 알 수 있다. 
    @Bean
    public Calculator calculator() {
        return new RecCalculator();
    }

}
