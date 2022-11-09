package beakjoon.Q1546;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class q1546 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/beakjoon/Q1546/input.txt"));
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double arr[] = new double[a];

        for (int i=0; i<a; i++) {
            arr[i] = sc.nextDouble();
        }
        sc.close();

        double sum =0;
        Arrays.sort(arr);

        for (int i=0; i<a; i++) {
            sum += ((arr[i] / arr[a-1]) * 100);
        }
        System.out.println(sum/a);
    }
}
