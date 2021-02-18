package chapter03_2;

import java.util.Scanner;

public class Ex3_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int change = sc.nextInt();
        int[] money = { 500, 100, 50, 10};
        int sum = 0;
        for (int m : money) {
            sum += change / m;
            change %= m;
        }
        System.out.println(sum);
    }
}
