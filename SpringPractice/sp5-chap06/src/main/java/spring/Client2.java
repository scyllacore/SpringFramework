/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spring;

/**
 *
 * @author Yoon
 */
public class Client2 {
    
    private String host;

    public void setHost(String host) {
        this.host = host;
    }
    
    public void connect() throws Exception{
        System.out.println("Client2.connect() 실행");
    }
    
    public void send(){
        System.out.println("Client2.send() to " + host);
    }
    
    public void close() throws Exception{
        System.out.println("Client2.connect() 실행");
    }
    
}
