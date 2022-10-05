/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spring;

import java.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;

/**
 *
 * @author Yoon
 */
public class MemberPrinter {

   // @Autowired
   // @Nullable
    private DateTimeFormatter dateTimeFormatter;
    
    public MemberPrinter(){
        dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
    }
    
    public void print(Member member) {

        System.out.printf("id : %d, email : %s, name : %s ",
                member.getId(),
                member.getEmail(),
                member.getName()
        );

        if (dateTimeFormatter == null) {
            System.out.printf("creDay : %tF\n", member.getRegisterDateTime());
        } else {
            System.out.printf("creDay : %s\n", dateTimeFormatter.format(member.getRegisterDateTime()));
        }

    }
    
    //@Autowired(required = false)
    @Autowired
    public void setDateTimeFormatter(@Nullable DateTimeFormatter dateTimeFormatter) { //@Nullable
        this.dateTimeFormatter = dateTimeFormatter;
    }

    
    
}
