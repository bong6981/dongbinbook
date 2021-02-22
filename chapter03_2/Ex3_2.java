package chapter03_2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int fist = arr[n-1];
        int second = arr[n-2];

        int sum = 0;

        int num_f = ( m / (k + 1) ) * k;
        num_f += m % (k +1);

        sum += fist * num_f + second * ( m / (k+1));
        System.out.println(sum);
    }


}
