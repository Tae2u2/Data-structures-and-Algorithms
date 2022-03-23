package chap01;

import java.util.Scanner;

class Max3 {
    public static void main(String[] args) {
        try (Scanner stdIn = new Scanner(System.in)) {
            System.out.println("세 정수의 최대 값을 구합니다.");
            System.out.println("a : ");
            int a = stdIn.nextInt();
            System.out.println("b : ");
            int b = stdIn.nextInt();
            System.out.println("c : ");
            int c = stdIn.nextInt();

            int max = a;
            if (b > max) {
                max = b;
            }
            ;
            if (c > max) {
                max = c;
            }
            ;

            System.out.println("최대값은 : " + max + "입니다.");
        }
    }
}

// 처음 문제를 보고 변수를 하나 생성해서 a가 b보다 크면 그 변수에 a 이런식으로 풀어가려고 했는데
// 세개의 값 중 하나로 초기화하는 건 생각을 못했다.