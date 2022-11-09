package beakjoon.Q2566;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class q2566 {
    public static void main(String[] args) throws FileNotFoundException {
//        System.setIn(new FileInputStream("src/beakjoon/Q2566/input.txt"));

        Scanner sc = new Scanner(System.in);

        int nums[][] = new int[10][10];
        int max = 0;
        int a =0; int b= 0;

        for (int i=0; i<9; i++) {
            for (int j=0; j<9; j++) {
                nums[i][j] = sc.nextInt();
                if (max < nums[i][j]) {
                    max = nums[i][j];
                    a = i; b = j;
                }
            }
        }
        System.out.println(max);
        System.out.println((a+1) + " " + (b+1));
    }
}
