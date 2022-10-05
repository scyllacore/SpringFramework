/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spring;

/**
 *
 * @author Yoon
 */
public class MemberPrinter {

    public void print(Member member) {
        System.out.printf("id : %d, email : %s, name : %s, creDay : %tF\n",
                member.getId(),
                member.getEmail(),
                member.getName(),
                member.getRegisterDateTime());
    }

}
