package chapter03_2;

import java.util.Scanner;

public class Ex3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        while (n != 1){
            count += n % k;
            n -= n % k;
            n = n / k;
            count++;
        }
        System.out.println(count);

    }

}
