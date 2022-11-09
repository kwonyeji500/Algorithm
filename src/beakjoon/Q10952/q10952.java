package beakjoon.Q10952;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class q10952 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/beakjoon/Q10952/input.txt"));
        Scanner sc = new Scanner(System.in);

        while(true) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a==0 && b==0){
                sc.close();
                break;
            }
            System.out.println(a+b);
        }
    }
}
