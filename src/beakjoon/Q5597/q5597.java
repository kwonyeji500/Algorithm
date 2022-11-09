package beakjoon.Q5597;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class q5597 {
    public static void main(String[] args) throws FileNotFoundException {
//        System.setIn(new FileInputStream("src/beakjoon/Q5597/input.txt"));
        Scanner sc = new Scanner(System.in);
        int[] student = new int[31];

        for (int i=1; i<29; i++) {
            int success = sc.nextInt();
            student[success] = 1;
        }
        for (int i=1; i< student.length; i++) {
            if (student[i] != 1){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
