package beakjoon.Q1152;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class q1152 {
    public static void main(String[] args) throws FileNotFoundException {
//        System.setIn(new FileInputStream("src/beakjoon/Q1152/input.txt"));
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        s = s.trim();// trim 은 문자 앞뒤에있는 공백을 제거해준다.
        String ans[] = s.split(" ");
        if(ans.length == 1&& ans[0].equals("")) {
            System.out.print(0);
        }else {
            System.out.print(ans.length);
        }
    }
}
