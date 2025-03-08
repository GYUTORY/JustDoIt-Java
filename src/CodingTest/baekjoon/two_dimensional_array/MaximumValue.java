package CodingTest.baekjoon.two_dimensional_array;

/*
문제 설명
2차원 배열이 주어졌을 때, 배열에서 가장 큰 값을 찾고, 그 값이 있는 위치를 출력하는 문제입니다.
가장 큰 값과 그 값의 위치는 여러 번 나올 수 있습니다.
따라서, 첫 번째로 나오는 가장 큰 값의 위치를 출력합니다.

입력
첫째 줄부터 아홉 번째 줄까지 9개의 줄에 걸쳐 9개의 정수가 주어집니다.
각 정수는 공백으로 구분되어 있고, 1부터 100까지의 자연수입니다.

출력
첫 번째 줄에 가장 큰 값을 출력하고,
두 번째 줄에 그 값이 위치한 행 번호와 열 번호를 출력합니다.
행 번호와 열 번호는 1부터 시작합니다.

입력 예시:
3 23 85 34 17 74 25 52 65
10 7 39 42 88 52 14 72 63
87 42 18 78 53 45 18 84 53
34 28 64 85 12 16 75 36 55
21 77 45 35 28 75 90 76 1
25 87 65 15 28 11 37 28 74
65 27 75 41 7 89 78 64 39
47 47 70 45 23 65 3 41 44
87 13 82 38 31 12 29 29 80

출력 예시:
90
5 7
* */

import java.util.Scanner;

public class MaximumValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 초기화
        int maxValue = 0;  // 가장 큰 값
        int maxRow = 0;    // 가장 큰 값이 있는 행
        int maxCol = 0;    // 가장 큰 값이 있는 열

        // 9x9 크기의 배열 입력
        int[][] matrix = new int[9][9];

        // 배열 값 입력받기
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                matrix[i][j] = sc.nextInt();

                // 가장 큰 값 찾기
                if (matrix[i][j] > maxValue) {
                    maxValue = matrix[i][j];
                    maxRow = i + 1;  // 행 번호는 1부터 시작
                    maxCol = j + 1;  // 열 번호는 1부터 시작
                }
            }
        }

        // 결과 출력
        System.out.println(maxValue);  // 가장 큰 값 출력
        System.out.println(maxRow + " " + maxCol);  // 가장 큰 값의 위치 출력

        sc.close();
    }
}
