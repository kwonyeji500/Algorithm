package beakjoon.Q10871;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class q10871 {
    public static void main(String[] args) throws FileNotFoundException {
//        System.setIn(new FileInputStream("src/beakjoon/Q10871/input.txt"));
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int arr[] = new int[a];

        for (int i=0; i<a; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        for (int i=0; i<a; i++) {
            if (arr[i] < b) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
