package CodingTest.baekjoon.one_dimensional_array;

/**
 문제 설명
 총 30명의 학생 중 28명은 과제를 제출했습니다. 제출하지 않은 2명의 학생 번호를 찾아 출력하는 문제입니다.
 학생들의 번호는 1번부터 30번까지 주어집니다. 제출한 학생들의 번호가 주어지면, 제출하지 않은 2명의 학생 번호를 출력합니다.

 입력
 첫 번째 줄에는 제출한 28명의 학생 번호가 주어집니다.

 출력
 제출하지 않은 2명의 학생 번호를 오름차순으로 출력합니다.
 */

import java.util.Scanner;

public class AssignmentNotSubmitted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1번부터 30번까지 학생 번호를 저장하는 배열
        boolean[] submitted = new boolean[30];

        // 제출한 28명 학생의 번호 입력
        for (int i = 0; i < 28; i++) {
            int student = sc.nextInt();
            submitted[student - 1] = true; // 제출한 학생의 번호를 true로 표시
        }

        // 제출하지 않은 학생의 번호 출력
        for (int i = 0; i < 30; i++) {
            if (!submitted[i]) {
                System.out.print((i + 1) + " "); // 제출하지 않은 학생 출력
            }
        }

        sc.close();
    }
}
