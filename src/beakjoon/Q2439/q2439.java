package beakjoon.Q2439;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class q2439 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/beakjoon/Q2439/input.txt"));
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        sc.close();

        for (int i=1; i<=a; i++) {
            for (int j=1; j<=a-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
