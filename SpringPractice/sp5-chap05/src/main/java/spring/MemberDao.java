/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spring;

import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Yoon
 */

@Component
public class MemberDao {

    private static long nextId = 0;
    
    private Map<String,Member> map = new HashMap<>();
    
    public Member selectByEmail(String email){
        return map.get(email);
    }
    
    public void insert(Member member){
        member.setId(++nextId);
        map.put(member.getEmail(), member);
    }
    
    public void update(Member member){
        map.put(member.getEmail(), member);
    }
    
    public Collection<Member> selectAll(){
        return map.values();
    }
    
    
}
