package beakjoon.Q2908;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class q2908 {
    public static void main(String[] args) throws FileNotFoundException {
//        System.setIn(new FileInputStream("src/beakjoon/Q2908/input.txt"));
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        sc.close();

        int ra = (a%10) * 100 + ((a%100) / 10) *10 + (a/100);
        int rb = (b%10) * 100 + ((b%100) / 10) *10 + (b/100);

        System.out.print(Math.max(ra, rb));
    }
}
