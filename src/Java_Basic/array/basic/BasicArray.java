package Java_Basic.array.basic;

/**
 * 1차원 배열의 기본적인 사용법을 보여주는 예제
 */
public class BasicArray {
    public static void main(String[] args) {
        // 1. 배열 선언과 초기화
        int[] numbers = new int[5];  // 크기가 5인 int 배열 선언
        System.out.println("1. 배열 선언 후 자동 초기화");
        printArray(numbers);  // 기본값 0으로 초기화됨
        
        // 2. 배열 요소 값 변경
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;  // 1, 2, 3, 4, 5 저장
        }
        System.out.println("\n2. 배열 요소 값 변경");
        printArray(numbers);
        
        // 3. 배열 선언과 초기화를 동시에
        int[] scores = {95, 80, 87, 92, 88};  // 초기값 지정
        System.out.println("\n3. 배열 선언과 동시에 초기화");
        printArray(scores);
        
        // 4. 배열의 길이
        System.out.println("\n4. 배열의 길이");
        System.out.println("numbers 배열 길이: " + numbers.length);
        System.out.println("scores 배열 길이: " + scores.length);
        
        // 5. 배열의 평균값 계산
        int sum = 0;
        for (int score : scores) {  // 향상된 for문 사용
            sum += score;
        }
        double average = (double) sum / scores.length;
        System.out.println("\n5. 점수의 평균: " + average);
    }
    
    // 배열 출력 메서드
    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) System.out.print(", ");
            System.out.print(arr[i]);
        }
        System.out.println();
    }
} 