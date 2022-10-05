/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author Yoon
 */
public class Practice5_1 {

    String name;
    String phone;
    int age;

    public Practice5_1() {
        this("defualt", "none", 30);
        //this.name = "default";
        //this.phone = "none";
    }

    public Practice5_1(String name) {
        this(name, "none", 30);
        //this.name = name;
        //this.phone = "none";

    }

    public Practice5_1(String name, String phone) {
        this(name, phone, 30);
    }

    public Practice5_1(String name, String phone, int age) {
        this.name = name;
        this.phone = phone;
        this.age = age;
    }
    
     int sumCal(int[][] arr){
        int sum=0,i,j;
        
        for(i=0; i<arr.length; i++){
            for(j=0; j<arr[i].length; j++){
            sum += arr[i][j];
            }
        }
        return sum;
        
    }
    

}
