package beakjoon.Q2525;

import java.util.Scanner;

public class q2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        sc.close();

        int total = (A * 60) + B;
        total += C;

        int closeH = total / 60;
        int closeM = total % 60;

        if(closeH >= 24) {
            closeH -=24;
        }
        System.out.println(closeH + " " + closeM);
    }
}
