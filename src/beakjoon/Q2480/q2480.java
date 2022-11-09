package beakjoon.Q2480;

import java.util.Scanner;

public class q2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        sc.close();

        //3개 다 같지 않을 때
        if (A != B && B != C && A != C) {
            int max = Math.max(A, Math.max(B, C));
            System.out.println(max * 100);
            //3대다 다 같을 때
        } else if (A == B && A == C) {
            System.out.println(10000 + A * 1000);
            //A와 B,C가 같을 때
        } else if (A == B || A == C) {
            System.out.println(1000 + A * 100);
            //B와 C가 같을 때
        } else {
            System.out.println(1000 + C * 100);
        }
    }
}
