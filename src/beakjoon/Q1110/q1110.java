package beakjoon.Q1110;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class q1110 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/beakjoon/Q1110/input.txt"));
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int count = 0;
        int copy = a;

        while (true) {
            a = ((a%10) *10) + (((a/10) + (a%10)) %10);
            count++;

            if (copy == a) {
                break;
            }
        }
        System.out.println(count);
    }
}
