package beakjoon.Q2562;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class q2562 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/beakjoon/Q2562/input.txt"));
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[9];
        int count = 0;
        int max =0;

        for (int i=0; i<9; i++) {
            int input = sc.nextInt();
            arr[i] = input;
        }

        for (int i=0; i<9; i++) {
            if (arr[i] > max) {
                max = arr[i];
                count= i+1;
            }
        }
        System.out.println(max);
        System.out.println(count);
    }
}
