package beakjoon.Q10818;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class q10818 {
    public static void main (String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/beakjoon/Q10818/input.txt"));
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int arr[] = new int[a];


        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[a-1]);

        }
    }
