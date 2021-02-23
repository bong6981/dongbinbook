package chapter03_2;

import java.util.Scanner;

public class Ex3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int result = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                 int x = sc.nextInt();
                 if(j==0) result = x;
                 if( x < result) result = x;
            }
            int max = 0;
            if(i==0) max = result;
            if(max < result) max = result;
        }

        System.out.println(result);
    }
}
