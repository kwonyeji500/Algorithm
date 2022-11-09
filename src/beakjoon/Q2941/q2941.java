package beakjoon.Q2941;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class q2941 {
    public static void main(String[] args) throws FileNotFoundException {
//        System.setIn(new FileInputStream("src/beakjoon/Q2941/input.txt"));
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String str[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (int i=0; i<str.length; i++) {
            if (s.contains(str[i]))
                s = s.replace(str[i], "!");
        }
        System.out.print(s.length());
    }
}
