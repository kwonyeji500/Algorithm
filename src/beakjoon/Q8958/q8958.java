package beakjoon.Q8958;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class q8958 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/beakjoon/Q8958/input.txt"));
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String arr[] = new String[a];

        for (int i=0; i<arr.length; i++) {
            arr[i] = sc.next();
        }
        sc.close();

        for (int i=0; i<arr.length; i++) {
            int add =0;
            int sum =0;
            for (int j=0; j<arr[i].length(); j++) {
                if (arr[i].charAt(j) == 'O') {
                    add++;
                }
                else {
                    add =0;
                }
                sum+= add;
            }
            System.out.println(sum);
        }
    }
}
