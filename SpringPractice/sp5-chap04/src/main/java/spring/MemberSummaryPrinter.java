/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spring;

/**
 *
 * @author Yoon
 */
public class MemberSummaryPrinter extends MemberPrinter {

    @Override
    public void print(Member member) {
        System.out.printf("회원 정보 : 이메일=%s, 이름=%s\n",member.getEmail(),member.getName());
    }
    
        
    
}
