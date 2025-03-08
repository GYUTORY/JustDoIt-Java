package CodingTest.baekjoon.advance_level1;

/*
문제 설명
체스에서 퀸은 상, 하, 좌, 우, 대각선 8방향으로 이동할 수 있다.
체스판에는 킹, 퀸, 룩, 비숍, 나이트, 폰이 각각 1개씩 존재하며, 그 외의 기물은 없다.

주어진 체스판에서 퀸의 수를 확인한 후,
기본적으로 체스판에는 퀸이 1개 있어야 하므로, 현재 주어진 퀸의 수와 기본 퀸 수 1개를 비교하여 부족한 수를 출력하는 문제이다.

입력
첫째 줄에 체스판에 놓인 퀸의 수가 주어진다.
각각의 수는 공백으로 구분되어 있으며,
주어진 수는 각각 킹, 퀸, 룩, 비숍, 나이트, 폰의 수이다.

출력
주어진 수에 대해, 퀸이 1개일 때 부족한 퀸의 개수를 출력한다.

입력 예시:
0 1 2 2 2 7

출력 예시:
1 0 0 0 0 1
* */
import java.util.Scanner;

public class Queen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 체스의 기물 수 입력 (킹, 퀸, 룩, 비숍, 나이트, 폰)
        int[] pieces = new int[6];
        for (int i = 0; i < 6; i++) {
            pieces[i] = sc.nextInt();
        }

        // 각 기물의 부족한 개수를 계산하고 출력
        int[] correctPieces = {1, 1, 2, 2, 2, 8};  // 기본적으로 있어야 하는 기물 수
        for (int i = 0; i < 6; i++) {
            System.out.print(correctPieces[i] - pieces[i] + " ");
        }

        sc.close();
    }
}
