package beakjoon.Q10809;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class q10809 {
    public static void main(String[] args) throws FileNotFoundException {
//        System.setIn(new FileInputStream("src/beakjoon/Q10809/input.txt"));
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int arr[] = new int[26];
        for (int i=0; i<26; i++) {
            arr[i] = -1;
        }

        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);

            if (arr[ch - 'a'] == -1) {
                arr[ch - 'a'] = i;
            }
        }
        for (int var : arr) {
            System.out.print(var + " ");
        }
    }
}
