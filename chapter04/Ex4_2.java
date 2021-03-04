package chapter04;

import java.util.Scanner;

public class Ex4_2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        char x = input.charAt(0);
//        int y =Character.getNumericValue(input.charAt(1));
//
//        int countAx = 0;
//        int countBx = 0;
//
//        int countAy = 0;
//        int countBy = 0;
//
//        if( 'a' <= x-1 && x-1 <= 'h'){
//            countBx++;
//            if ( 'a' <= x-2 && x-2 <= 'h'){
//                countAx++;
//            }
//        }
//
//        if( 'a' <= x+1 && x+1 <= 'h'){
//            countBx++;
//            if ( 'a' <= x+2 && x+2 <= 'h'){
//                countAx++;
//            }
//        }
//
//        if( 1 <= y-1 && y-1 <= 8){
//            countAy++;
//            if ( 1 <= y-2 && y-2 <= 8){
//                countBy++;
//            }
//        }
//
//        if( 1 <= y+1 && y+1 <= 8){
//            countAy++;
//            if ( 1 <= y+2 && y+2 <= 8){
//                countBy++;
//            }
//        }
//        int result = countAx * countAy + countBx * countBy;
//        System.out.println(result);
//    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    int row = input.charAt(1) - '0';
    int column = input.charAt(0) - 'a' + 1;

    int[] dx = {-2, -1, 1, 2, 2, 1, -1, -1};
    int[] dy = {-1, -2, -2, 1, -1, 2, 2, 1};

    int result = 0;
    for(int i=0; i<8; i++){
        int nextRow = row + dx[i];
        int nextColumn = column + dy[i];
        if ( nextRow >= 1 && nextRow <= 8 && nextColumn >=1 && nextColumn <=8 ) {
            result +=1;
        }
    }
    System.out.println(result);
}
}
