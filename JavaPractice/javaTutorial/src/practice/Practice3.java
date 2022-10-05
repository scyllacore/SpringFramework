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
public class Practice3 {

    public static void main(String[] args) {
        //다차원 배열, 깊은 복사
        int[][] arr1 = new int[2][3];
        int[][] arr2 = {{1, 2, 3}, {4, 5}};

        for (int i = 0; i < 2; i++) {
            arr1[i] = Arrays.copyOf(arr2[i], arr2[i].length); // copyOf를 이용하여
        }

        for (int i = 0; i < 2; i++) {
            arr1[i] = arr2[i].clone(); // clone을 이용하여
        }

        // copyOf와 clone은 새로운 객체를 만들어서 배열을 복사하고 기존 객체는 없애는 것 같다. 값이 직접 대입되는 형태는 아님. 
        for (int i = 0; i < 2; i++) {
            System.arraycopy(arr2[i], 0, arr1[i], 0, 2); // array copy 이게 제일 쓰기 좋을 것 같다. 값이 직접 대입되는 형태인 것 같다.
        }

        System.out.println("전");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.printf("%d ", arr1[i][j]);
            }
            System.out.println("");
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.printf("%d ", arr2[i][j]);
            }
            System.out.println("");
        }
        System.out.println("후");
        arr1[0][2] = 10;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.printf("%d ", arr1[i][j]);
            }
            System.out.println("");
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.printf("%d ", arr2[i][j]);
            }
            System.out.println("");
        }

        //강화된 for문 , 얕은 복사
        int[] arr3 = new int[]{1, 2, 3, 4, 5};
        int[] arr4 = arr3;

        System.out.println("전");

        for (int num : arr3) {
            System.out.printf("%d ", num);
        }
        System.out.println("");
        for (int num : arr4) {
            System.out.printf("%d ", num);
        }
        
        arr3[2]=10;
        System.out.println("후");
        
        for (int num : arr3) {
            System.out.printf("%d ", num);
        }
        System.out.println("");
        for (int num : arr4) {
            System.out.printf("%d ", num);
        }
        

    }
}
