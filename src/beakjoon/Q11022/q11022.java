package beakjoon.Q11022;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class q11022 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/beakjoon/Q11022/input.txt"));
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int arr[] = new int[a];

        for (int i =0; i<a; i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();

            arr[i] = b+c;
            System.out.println("Case #"+(i+1)+": "+b+" + "+c+" = "+arr[i]);
        }
    }
}
