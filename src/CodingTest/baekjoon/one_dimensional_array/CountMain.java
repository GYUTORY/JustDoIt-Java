
/*
문제 설명
주어진 수 N개 중에서, 특정 수 X가 몇 번 나타나는지 세는 문제입니다.
N은 1 이상 100 이하이고, X는 -1000 이상 1000 이하의 정수입니다.
N개의 정수들 중에서 X가 등장하는 횟수를 구하는 프로그램을 작성해야 합니다.

입력
첫째 줄에 N (1 ≤ N ≤ 100)과 X (-1000 ≤ X ≤ 1000)가 주어진다.
둘째 줄에는 N개의 정수가 주어진다. 이 정수는 -1000 이상 1000 이하이다.

출력
첫째 줄에 X가 등장한 횟수를 출력한다.

예시
입력:
코드 복사
10 2
1 2 3 2 2 1 2 3 4 2

출력:
코드 복사
4

풀이
N개의 정수 중에서 X가 몇 번 등장하는지 세는 문제입니다. 이를 해결하기 위해서는 주어진 수열에서 X와 같은 숫자를 찾고 그 개수를 세면 됩니다.
Java에서 주어진 배열을 순회하면서 X와 일치하는 값이 있으면 카운트를 증가시킵니다.
* */
package CodingTest.baekjoon.one_dimensional_array;

import java.util.Scanner;

public class CountMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N과 X 입력
        int N = sc.nextInt();
        int X = sc.nextInt();

        // 수열 입력
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // X의 등장 횟수 계산
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] == X) {
                count++;
            }
        }

        // 결과 출력
        System.out.println(count);

        sc.close();
    }
}

