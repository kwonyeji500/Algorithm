package beakjoon.Q10951;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class q10951 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/beakjoon/Q10951/input.txt"));
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a+b);
        }
    }
}
