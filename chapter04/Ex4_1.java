package chapter04;

import java.util.Scanner;

public class Ex4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] list = sc.nextLine().split(" ");
        int x = 1, y = 1;

        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        String[] move = {"L", "R", "U", "D"};


        int nx = 0, ny = 0;
        for (int i = 0; i < list.length; i++) {
            nx = 0;
            ny = 0;
            for (int j = 0; j < move.length; j++) {
                if (list[i].equals(move[j])) {
                    nx += x + dx[j];
                    ny += y + dy[j];
                }
            }
            if (!((1 <= nx && nx <= 5) && (1 <= ny && ny <= 5))) {
                continue;
            }
            x = nx;
            y = ny;
        }
        System.out.println(x + " " + y);
    }
}
