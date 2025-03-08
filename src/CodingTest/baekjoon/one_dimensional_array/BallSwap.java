package CodingTest.baekjoon.one_dimensional_array;

/*
문제 설명
도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 매겨져 있다.
또, 1번부터 N번까지 번호가 적혀있는 공을 매우 많이 가지고 있다.
가장 처음 바구니에는 공이 들어있지 않으며, 바구니에는 공을 1개만 넣을 수 있다.

도현이는 앞으로 M번 공을 바꿀 것이다.
각각의 바구니에 들어있는 공을 서로 바꾸는 작업을 M번 진행한다고 할 때,
M번 작업을 모두 마친 후 바구니에 들어있는 공의 상태를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 바구니의 수 N과 공을 바꾸는 횟수 M이 주어진다.
둘째 줄부터 M개의 줄에 걸쳐서 두 바구니의 번호가 주어진다.
두 바구니의 공을 서로 바꾸는 작업을 나타낸다.

출력
M번의 작업을 마친 후 바구니에 들어있는 공의 상태를 출력한다.
바구니 번호가 작은 순서대로 공을 출력한다.

입력 예시
5 4
1 2
3 4
1 4
2 5

출력 예시
4 1 3 2 5
* */
import java.util.Scanner;

public class BallSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N: 바구니의 수, M: 공을 바꾸는 횟수
        int N = sc.nextInt();
        int M = sc.nextInt();

        // 바구니를 1부터 N까지 번호를 할당하여 초기화
        int[] baskets = new int[N];
        for (int i = 0; i < N; i++) {
            baskets[i] = i + 1; // 1번부터 N번까지 공을 할당
        }

        // M번의 공 바꾸기 작업 처리
        for (int m = 0; m < M; m++) {
            int i = sc.nextInt(); // 첫 번째 바구니 번호
            int j = sc.nextInt(); // 두 번째 바구니 번호

            // 두 바구니의 공을 서로 바꿈 (배열은 0부터 시작하므로 i-1, j-1)
            int temp = baskets[i - 1];
            baskets[i - 1] = baskets[j - 1];
            baskets[j - 1] = temp;
        }

        // 결과 출력
        for (int b : baskets) {
            System.out.print(b + " ");
        }

        sc.close();
    }
}
