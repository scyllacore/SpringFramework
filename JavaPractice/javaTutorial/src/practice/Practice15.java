/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author Yoon
 */
public class Practice15 {

    public static void main(String[] args) {
        try {
            int[] arr = {1, 2};
            System.out.println(arr[2]);

            String str = "12a";
            int n = Integer.parseInt(str);
            System.out.println(n);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스를 벗어남");
        } catch (NumberFormatException e) {
            System.out.println("숫자로 변환 안 됨.");
        } 
//        catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
//            System.out.println("인덱스를 벗어 나거나 숫자로 변한 안됨");
//        } 
        finally {
            System.out.println("무조건 실행");
        }
        
        Practice15parent test = new Practice15parent();
        
        test.method1();
        
        
    }

}
