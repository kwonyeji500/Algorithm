package beakjoon.Q2292;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class q2292 {
    public static void main(String[] args) throws FileNotFoundException {
//        System.setIn(new FileInputStream("src/beakjoon/Q2292/input.txt"));
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int count = 1;
        int range = 2;

        if (a == 1) {
            System.out.println(1);
        } else {
            while (range <= a) {
                range = range + (6 * count);
                count++;
            }
            System.out.println(count);
        }
    }
}
