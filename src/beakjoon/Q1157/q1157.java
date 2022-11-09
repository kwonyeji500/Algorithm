package beakjoon.Q1157;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class q1157 {
    public static void main(String[] args) throws FileNotFoundException {
//        System.setIn(new FileInputStream("src/beakjoon/Q1157/input.txt"));
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[26];
        String s = sc.next().toUpperCase();
        int max = -1;
        char result = '?';

        for (int i=0; i < s.length(); i++) {
            int a = s.charAt(i) - 'A';
            arr[a]++;
            if(max < arr[a]) {
                max = arr[a];
                result = s.charAt(i);
            } else if(max == arr[a]) {
                result = '?';
            }
        }
        System.out.print(result);
    }
}
