package beakjoon.Q1712;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class q1712 {
    public static void main(String[] args) throws FileNotFoundException {
//        System.setIn(new FileInputStream("src/beakjoon/Q1712/input.txt"));
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (c <= b) {
            System.out.println("-1");
        } else {
            System.out.println((a/(c-b))+1);
        }
    }
}
