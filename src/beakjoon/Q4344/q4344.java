package beakjoon.Q4344;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class q4344 {
    public static void main(String[] args) throws FileNotFoundException {
//        System.setIn(new FileInputStream("src/beakjoon/Q4344/input.txt"));
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[];

        for(int i=0; i<a; i++) {
            int b = sc.nextInt(); //학생 수
            arr = new int[b];

            double sum =0; //성적 누적

            //성적 입력
            for (int j=0; j<b; j++) {
                int c = sc.nextInt(); //성적 입력
                arr[j] = c;
                sum += c; //성적 누적 합
            }

            double average = (sum/b);
            double count = 0; //평균 넘는 학생 수

            //평균 넘는 학생 찾기
            for (int j=0; j<b; j++) {
                if (arr[j] > average) {
                    count++;
                }
            }

            System.out.printf("%.3f%%\n",(count/b)*100);
        }
    }
}
