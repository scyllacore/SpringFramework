/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spring;

import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Yoon
 */
public class ChangePasswordService {
    
    @Autowired
    private MemberDao memberDao;
    
    public void changePassword(String email,String oldPwd,String newPwd){
        Member member = memberDao.selectByEmail(email);
        
        if(member == null){
            throw new MemberNotFoundException();
        }
        
        member.changaPassword(oldPwd, newPwd);
        memberDao.update(member);
        
    }
    
    public void setMemberDao(MemberDao memberDao){
        this.memberDao = memberDao;
    }
    
    
}
