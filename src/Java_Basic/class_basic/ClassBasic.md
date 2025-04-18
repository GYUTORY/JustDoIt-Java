# Java 클래스 기초 학습하기 📚

## 📚 학습 내용

### 1. 클래스의 기본 구조
- 클래스 선언과 객체 생성
- 필드(멤버 변수)와 메서드
- 생성자 사용법
- 접근 제어자의 활용

### 2. 객체 지향 프로그래밍 기초
- 캡슐화와 정보 은닉
- 메서드를 통한 객체 상호작용
- 객체 배열 활용

## 📁 패키지 구조

### 1. basic (기본 예제)
```java
class Person {
    String name;    // 필드
    int age;        // 필드
    
    // 생성자
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // 메서드
    void introduce() {
        System.out.println("안녕하세요, " + name + "입니다.");
    }
}
```

### 2. review (영화 리뷰 시스템)
```java
class MovieReview {
    String title;
    String review;
    double rating;
    
    void printReview() {
        System.out.println("영화: " + title + ", 평점: " + rating);
        System.out.println("리뷰: " + review);
    }
}
```

### 3. order (주문 시스템)
```java
class ProductOrder {
    String productName;
    int price;
    int quantity;
    
    int getTotalPrice() {
        return price * quantity;
    }
}
```

## 🎯 주요 포인트

### 1. 클래스 구성 요소
- 필드: 객체의 데이터
- 생성자: 객체 초기화
- 메서드: 객체의 행동

### 2. 객체 생성과 사용
```java
// 객체 생성
Person person = new Person("홍길동", 20);

// 객체 사용
person.introduce();
```

### 3. 접근 제어
- private: 클래스 내부에서만 접근
- default: 같은 패키지 내에서 접근
- public: 어디서나 접근 가능

## 💡 실습 예제

### 1. 학생 정보 관리
```java
public class Student {
    private String name;
    private int score;
    
    public void setScore(int score) {
        if (score >= 0 && score <= 100) {
            this.score = score;
        }
    }
    
    public String getGrade() {
        if (score >= 90) return "A";
        if (score >= 80) return "B";
        if (score >= 70) return "C";
        return "D";
    }
}
```

### 2. 영화 리뷰 시스템
```java
public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview[] reviews = new MovieReview[2];
        reviews[0] = new MovieReview("인셉션", "흥미진진한 영화", 4.5);
        reviews[1] = new MovieReview("어바웃타임", "감동적인 영화", 4.0);
    }
}
```
