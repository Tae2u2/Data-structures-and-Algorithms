package chap01;

import java.util.Scanner;

class SumFor {

    static int sumof(int c, int d) {
        int sum = 0;
        if (c > d) {
            // c가 d보다 클때
            for (int i = d; i <= c; i++) {
                sum += i;
            }
            System.out.println("입력한 " + d + "와 " + c + "사이의 모든 정수의 합 = " + sum);
            return sum;
        } else if (d > c) {
            // d가 c보다 클때
            for (int i = c; i <= d; i++) {
                sum += i;
            }
            System.out.println("입력한 " + c + "와 " + d + " 사이의 모든 정수의 합 = " + sum);
            return sum;
        } else {
            System.out.println("서로 다른 정수를 입력하세요");
            return sumof(c, d);
        }
    }

    public static void main(String[] args) {
        try (Scanner stdIn = new Scanner(System.in)) {
            System.out.println("1부터 입력한 숫자까지의 합을 구해드릴게요.");
            int n = stdIn.nextInt();
            if (n < 0) {
                System.out.println("음수를 입력하셨습니다. 양수를 입력해주세요");
            } else {
                if (n % 2 == 0) {
                    // 가우스 덧셈 짝수일때
                    int a = (1 + n) * (n / 2);
                    System.out.println("1부터 " + n + "까지의 합은 = " + a);
                } else {
                    // 롷수일때
                    int b = n - 1;
                    int a = (1 + b) * (b / 2);
                    System.out.println("1부터 " + n + "까지의 합은 = " + (a + n));
                }
            }

            System.out.println("이번엔 입력한 두 정수 사이의 정수들의 합을 구해드릴게요");
            int c = stdIn.nextInt();
            int d = stdIn.nextInt();
            if (c < 0 || d < 0) {
                System.out.println("음수를 입력하셨습니다. 양수를 입력해주세요");
            } else {
                System.out.println(sumof(c, d));
            }
        }
    }
}

/*
 * 하나의 입구와 하나의 출구를 가진 구성 요소만을 계층적으로 배치하여 프로그램을 구성하는 방법을 구조적 프로그래밍이라고 한다.
 * 구조적 프로그래밍은 순차,선택, 반복이라는 3종류의 제어흐름을 사용한다.
 */