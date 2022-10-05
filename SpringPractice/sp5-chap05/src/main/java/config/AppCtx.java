/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ComponentScan.Filter;


import spring.MemberPrinter;
import spring.MemberSummaryPrinter;
import spring.VersionPrinter;

/**
 *
 * @author Yoon
 */
@Configuration
@ComponentScan(basePackages = {"spring"}// ,
       // excludeFilters = { @Filter(type = FilterType.ANNOTATION, classes = mual...)
)
public class AppCtx {

   
    @Bean 
    @Qualifier("printer")
    public MemberPrinter memberPrinter() { // component로 설정한 빈 이름과 같다면 수동 설정한 빈이 우선으로 사용된다.
        return new MemberPrinter();
    }
    
//    @Bean // 
//    @Qualifier("printer")
//    public MemberPrinter memberPrinter2() { 같은 타입의 빈임으로 component로 설정한 빈을 포함하여 빈 2개 생성 -> Qualifier를 사용하여 알맞은 빈 설정하여야 함.
//        return new MemberPrinter();
//    }


    @Bean
    @Qualifier("summaryPrinter")
    public MemberSummaryPrinter memberPrinter2() {
        return new MemberSummaryPrinter();
    }

    @Bean
    public VersionPrinter versionPrinter() {
        VersionPrinter versionPrinter = new VersionPrinter();
        versionPrinter.setMajorVersion(5);
        versionPrinter.setMinorVersion(0);
        return versionPrinter;
    }

}
