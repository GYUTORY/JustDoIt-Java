# Java 배열 학습하기 🎯

## 📚 학습 내용

### 1. 1차원 배열 기초
- 배열 선언과 초기화
- 배열 요소 접근과 수정
- 배열 길이와 인덱스
- 배열 복사와 참조

### 2. 다차원 배열
- 2차원 배열 선언과 초기화
- 행렬(Matrix) 다루기
- 가변 길이 배열
- 다차원 배열 순회

### 3. 향상된 for문
- 배열 순회의 간편한 방법
- 컬렉션과의 호환성

## 📁 패키지 구조

### 1. basic (기본 예제)
```java
// 1차원 배열 기본
int[] numbers = new int[5];
int[] numbers = {1, 2, 3, 4, 5};

// 2차원 배열 기본
int[][] matrix = new int[3][4];
int[][] matrix = {{1, 2}, {3, 4}};
```

### 2. reference (참조와 복사)
```java
// 배열 참조
int[] arr1 = {1, 2, 3};
int[] arr2 = arr1;  // 참조 복사 (같은 배열을 가리킴)

// 배열 복사
int[] arr3 = Arrays.copyOf(arr1, arr1.length);  // 실제 복사
```

### 3. dimension (다차원 배열)
```java
// 2차원 배열 예제
int[][] grades = {
    {90, 85, 95},   // 학생1의 성적
    {75, 88, 89},   // 학생2의 성적
    {88, 92, 96}    // 학생3의 성적
};
```

## 🎯 주요 포인트

### 1. 배열의 특징
- 고정된 크기
- 같은 타입의 데이터만 저장
- 인덱스는 0부터 시작
- `length` 속성으로 크기 확인

### 2. 배열 사용 시 주의사항
- 배열 인덱스 범위 주의 (ArrayIndexOutOfBoundsException)
- null 참조 주의 (NullPointerException)
- 배열 크기는 변경 불가 (필요시 새로운 배열 생성)

### 3. 자주 사용하는 배열 메서드
```java
// 배열 정렬
Arrays.sort(arr);

// 배열 채우기
Arrays.fill(arr, 0);

// 배열 비교
Arrays.equals(arr1, arr2);

// 배열 문자열로 변환
Arrays.toString(arr);
```

## 💡 실습 예제

### 1. 성적 관리 시스템
```java
public class GradeSystem {
    private int[] scores;
    
    public double getAverage() {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
    }
}
```

### 2. 좌석 예약 시스템
```java
public class SeatReservation {
    private boolean[][] seats;  // true: 예약됨, false: 빈좌석
    
    public boolean reserveSeat(int row, int col) {
        if (!seats[row][col]) {
            seats[row][col] = true;
            return true;
        }
        return false;
    }
}
```

## 📝 연습문제
1. 배열의 최대/최소값 찾기
2. 2차원 배열로 행렬 곱셈 구현
3. 배열을 활용한 간단한 게임 만들기
4. 학생 성적 분석 프로그램 작성 