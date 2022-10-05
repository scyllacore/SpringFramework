package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice1 {

    public static void main(String[] args) throws IOException {

        
        int x = (int)(Math.random()*6)+1;
        
        System.out.println(x);
        
        
        //equal
        String str = "안녕";
        System.out.println(str.equals("안뇽"));

  
        //입력 및 라벨로 분기 관리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        x = Integer.parseInt(br.readLine());
        System.out.println(x);

        int i, j;

        Outter:
        for (i = 1; i <= x; i++) {
            for (j = 1; j <= x; j++) {
                System.out.printf("%d ", i + j);
                if (i == 3 && j == 3) {
                    break Outter;
                }
            }
            System.out.println("");
        }

        System.out.println("\n종료");

    }

}
