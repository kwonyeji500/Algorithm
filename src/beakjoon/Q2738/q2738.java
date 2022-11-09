package beakjoon.Q2738;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class q2738 {
    public static void main(String[] args) throws FileNotFoundException {
//        System.setIn(new FileInputStream("src/beakjoon/Q2738/input.txt"));
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();//행
        int b = sc.nextInt();//열
        int[][] arr = new int[a][b];

        for (int i=0; i<2; i++) {
            for (int j=0; j<a; j++) {
                for (int k=0; k<b; k++) {
                    arr[j][k] += sc.nextInt();
                }
            }
        }

        for (int i=0; i<a; i++) {
            for (int j=0; j<b; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
