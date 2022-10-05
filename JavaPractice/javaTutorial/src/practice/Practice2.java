/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

import java.util.Arrays;

/**
 *
 * @author Yoon
 */
public class Practice2 {

    public static void main(String[] args) throws IndexOutOfBoundsException {
        String str = "안녕";
        str = null;
        System.out.println(str == "안녕");

        // 같은 heap영역 참조
        String str1 = "반갑";
        String str2 = "반갑";

        System.out.println(str1 == str2);

        // 다른 heap영역 참조 -> 같은지 비교할 때는 equals 사용해야함
        str1 = new String("반갑");
        str2 = new String("반갑");

        System.out.println(str1 == str2);

        //string 배열
        String[] str3 = new String[2];

        str3[0] = "abcd";
        str3[1] = "안녕";

        System.out.println(str == str3[1]);

        for (int i = 0; i < str3[0].length(); i += 2) {
            System.out.printf("%c", str3[0].charAt(i));
        }
        System.out.println("");

        //커맨드 라인
        str1 = args[0];
        str2 = args[1];

        System.out.println(args[0] + ' ' + args[1]); // -> shift f6이 아닌 f6(프로젝트 단위)로 실행하여야 한다.

        int n1 = Integer.parseInt(str1);
        int n2 = Integer.parseInt(str2);

        System.out.println(n1 + n2);


    }
}
