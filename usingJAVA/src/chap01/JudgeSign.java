package chap01;

import java.util.Scanner;

//양수인지 음수인지 
public class JudgeSign {
    public static void main(String[] args) {
        try (Scanner stdIn = new Scanner(System.in)) {
            System.out.println("정수를 입력하세요!");
            int n = stdIn.nextInt();

            if (n > 0) {
                System.out.println("양수입니다!");
            } else if (n < 0) {
                System.out.println("음수에요!");
            } else {
                System.out.println("0입니다.");
            }
        }

    }
}
