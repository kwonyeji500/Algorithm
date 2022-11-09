package beakjoon.Q10807;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class q10807 {
    public static void main(String[] args) throws FileNotFoundException {
//        System.setIn(new FileInputStream("src/beakjoon/Q10807/input.txt"));
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 정수의 수
        int[] arr = new int[a];

        int count =0;

        for (int i=0; i<a; i++) {
            arr[i] = sc.nextInt();
        }

        int b = sc.nextInt(); //찾으려고 하는 정수
        for (int i=0; i<arr.length; i++) {
            if (b == arr[i]){
                count++;
            }
        }

        System.out.println(count);
    }
}
