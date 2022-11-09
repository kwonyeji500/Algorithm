package beakjoon.Q10950;

import java.util.Scanner;

public class q10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int arr[] = new int[a];

        for(int i = 0; i < a; i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();
            arr[i] = b + c;
        }
        sc.close();

        for (int k : arr) {
            System.out.println(k);
        }
    }
}
