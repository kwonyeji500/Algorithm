package beakjoon.Q1316;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class q1316 {
    public static void main(String[] args) throws FileNotFoundException {
//        System.setIn(new FileInputStream("src/beakjoon/Q1316/input.txt"));
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int cnt = 0; //그룹단어 수

        for (int i=0; i<N; i++) {
            String s = sc.next();
            boolean check[] = new boolean[26]; //알파벳 사용내역
            boolean tmp = true; //그룹단어 인지

            for (int j=0; j<s.length(); j++) {
                int index = s.charAt(j) - 'a';
                if (check[index]) {
                    if (s.charAt(j) != s.charAt(j - 1)) {
                        tmp = false;
                        break;
                    }
                }else {
                        check[index] = true;
                    }
                }
                if (tmp) cnt++;
            }
        System.out.print(cnt);
    }
}
