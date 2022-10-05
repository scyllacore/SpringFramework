/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spring;

import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

/**
 *
 * @author Yoon
 */
public class MemberRegisterService {

    @Autowired
    private MemberDao memberDao;

    public MemberRegisterService(MemberDao memberDao) {
        //this.memberDao = memberDao;
    }

    public Long regist(RegisterRequest req) {
        Member member = memberDao.selectByEmail(req.getEmail());

        if (member != null) {
            throw new DuplicateMemberException("중복 이메일 존재 : " + req.getEmail());
        }
        
        Member newMember = new Member(req.getEmail(),req.getPassword(),req.getName(),LocalDateTime.now());
        memberDao.insert(newMember);
        return newMember.getId();

    }

}
