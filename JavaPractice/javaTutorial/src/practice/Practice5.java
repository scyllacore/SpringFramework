/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author Yoon
 */
public class Practice5 {

    static int three = 3;
    int testNum;

    static int powCal(int[][] arr) {

        int i, j, sum = 1;

        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                sum *= arr[i][j];
            }
        }

        return sum;

    }

    public static void main(String[] args) throws IOException { // main
        Practice5_1 test = new Practice5_1("myungsik", "010010");
        Practice5_1 test1 = new Practice5_1();
        Practice5_1 test2 = new Practice5_1("good", "101", 27);

        System.out.println(test.name);
        System.out.println(test.phone);
        System.out.println(test.age);

        System.out.println(test1.name);
        System.out.println(test1.phone);
        System.out.println(test1.age);

        System.out.println(test2.name);
        System.out.println(test2.phone);
        System.out.println(test2.age);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];

        int i, j;

        for (i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());
            for (j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (i = 0; i < n; i++) {

            for (j = 0; j < m; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println("");
        }

        int sum = test.sumCal(arr);

        System.out.println(sum);

        sum = powCal(arr) * Practice5.three;

        System.out.println(sum);

        Practice5 test3 = new Practice5();

        test3.testNum = 3;
        
        System.out.println(test3.testNum);
        
        
    }

}
