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

            System.out.println("max4 -> " + max4(12, 32, 13, 5));
            System.out.println("min3 -> " + min3(6, 45, 9));
        }

    }

    static int max4(int a, int b, int c, int d) {
        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        if (d > max)
            max = d;
        return max;
    }

    static int min3(int a, int b, int c) {
        int min = a;
        if (b < min)
            min = b;
        if (c < min)
            min = c;
        return min;
    }
}

/*
 * 처음 문제를 보고 변수를 하나 생성해서 a가 b보다 크면 그 변수에 a 이런식으로 풀어가려고 했는데 세개의 값 중 하나로 초기화하는 건
 * 생각을 못했다.
 * 1. 순차적으로 실행되는 구조를 순차적(concatenation) 구조라고 한다
 * 2.if문은 식의 평가 결과에 따라 실행 흐름을 변경하고, 이 것을 선택구조(selection)라고 한다.
 * 
 * 알고리즘 : 문제를 해결하기 위한 것으로, 명확하게 정의되고 순서가 있는 유한개의 규칙으로 이루어진 집합
 */