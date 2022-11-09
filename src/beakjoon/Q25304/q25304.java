package beakjoon.Q25304;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class q25304 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/beakjoon/Q25304/q25304.txt"));
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int arr[] = new int[b];
        int sum = 0;

        for (int i = 0; i < b; i++) {
            int c = sc.nextInt();
            int d = sc.nextInt();
            arr[i] = c * d;
        }

        for (int i = 0; i < b; i++) {
            sum += arr[i];
        }
        if (sum == a) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

