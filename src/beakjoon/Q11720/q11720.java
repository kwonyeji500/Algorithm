package beakjoon.Q11720;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class q11720 {
    public static void main(String[] args) throws FileNotFoundException {
//        System.setIn(new FileInputStream("src/beakjoon/Q11720/input.txt"));
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String a = sc.next();
        sc.close();

        int sum = 0;

        for (int i=0; i<N; i++) {
            sum += a.charAt(i)-48; //문자의 아스키코드값을 반환하므로 -48 or -'0'dmf gownjdigka
        }
        System.out.print(sum);

    }
}
