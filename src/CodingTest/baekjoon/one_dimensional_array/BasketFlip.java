package CodingTest.baekjoon.one_dimensional_array;


/*
문제 설명
총 30명의 학생이 있는데, 그 중에서 28명은 과제를 제출했습니다. 제출하지 않은 2명의 학생의 번호를 찾아 출력하는 문제입니다.
학생들의 번호는 1번부터 30번까지 주어집니다. 제출한 학생들의 번호가 주어지면, 제출하지 않은 학생들의 번호를 출력합니다.
입력
첫 번째 줄에는 제출한 28명의 학생 번호가 주어집니다.
출력
제출하지 않은 2명의 학생 번호를 오름차순으로 출력합니다.
* */
import java.util.Scanner;

public class BasketFlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N: 바구니의 수, M: 작업의 수
        int N = sc.nextInt();
        int M = sc.nextInt();

        // 바구니를 1부터 N까지 초기화
        int[] baskets = new int[N];
        for (int i = 0; i < N; i++) {
            baskets[i] = i + 1; // 1번부터 N번까지 번호 할당
        }

        // M번 작업 처리
        for (int m = 0; m < M; m++) {
            int i = sc.nextInt(); // 시작 바구니 번호
            int j = sc.nextInt(); // 끝 바구니 번호

            // i번 바구니부터 j번 바구니까지 뒤집기 (배열은 0부터 시작하므로 i-1, j-1)
            while (i < j) {
                // i와 j의 바구니 번호를 교환
                int temp = baskets[i - 1];
                baskets[i - 1] = baskets[j - 1];
                baskets[j - 1] = temp;

                // i는 증가시키고, j는 감소시킨다
                i++;
                j--;
            }
        }

        // 결과 출력
        for (int b : baskets) {
            System.out.print(b + " ");
        }

        sc.close();
    }
}
