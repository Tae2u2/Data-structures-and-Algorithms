package chap01;

import java.util.Scanner;
//3개의 정수를 입력하고 그 중간 값 받는다

/*세개의 값의 대소관계 조합은 13가지 종류이고 그걸 나열하면 나무 = tree 형태가 된다. 이걸 결정트리 decision tree 라고 한다.
왼쪽 끝에서 시작해서 오른쪽으로 진행되고, 참이면 윗가지 아니면 아랫가지로 이동 한다.*/

public class Median {

    static int med3(int a, int b, int c) {
        // 책에 나오는 결과값이 나오게 식을 짜봄 1.b가 중간값인 경우 4/13
        if (a >= b) {
            if (b >= c) {
                return c;// a가 b보다 같거나 크고 b가 c보다 같거나 클때
            } else if (a <= c) {
                return a;// a가 b보나 같거나 크고 c보다 같거나 작을때
            } else
                return b;
        } else if (a < b) {
            if (a >= c) {
                return a;// a가 b보다 작고 b가 c보다 같거나 클때
            } else if (b >= c) {
                return c;// a가 b보나 작고 b는 c보다 같거나 클때
            } else {
                return b;
            }
        } else {
            return b;
        }

    }

    // 입력하는 3개의 정수 값의 간격 값이 연속될 때, 라는 조건이 들어간다. 123 , 122, 322같은 135, 147, 이렇게도 되는데
    // 133 117이렇게 하면 가장 큰 값이 나온다.
    // 그리고 책에 조건에도 133이 없다. 대소관계라는 조건에선 원래 이런건가

    public static void main(String[] args) {
        try (Scanner stdIn = new Scanner(System.in)) {
            System.out.println("세 정수의 중간 값을 구합니다.");
            System.out.println("a : ");
            int a = stdIn.nextInt();
            System.out.println("b : ");
            int b = stdIn.nextInt();
            System.out.println("c : ");
            int c = stdIn.nextInt();
            System.out.println("중간값은 : " + med3(a, b, c) + "입니다.");

        }
    }
}

/*
 * 문제 5 => 효율이 떨어지는 이유 논리연산자를 중첩해서 쓰고 있고 처음에 걸러지는 값이 적어서 계속해서 여러번 돌아간다.
 * if문에 조건을 잘 주면 데이터의 반만 찾을 수 있다. 이거 이진검색인가
 */