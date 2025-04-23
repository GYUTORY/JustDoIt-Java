# Java 생성자 학습하기 📚

## 📚 학습 내용

### 1. 생성자의 기본 개념
- 객체 생성 시 초기화를 담당
- 클래스와 동일한 이름을 가짐
- 반환 타입이 없음

### 2. 생성자의 종류
- 기본 생성자 (Default Constructor)
- 매개변수가 있는 생성자
- 복사 생성자

## 📁 패키지 구조

### 1. basic (기본 생성자)
- 기본 생성자와 매개변수가 있는 생성자
- 생성자 오버로딩
- 객체 초기화 패턴

### 2. member (멤버 변수 초기화)
- 필드 기본값
- 명시적 초기화
- 초기화 블록
- 생성자를 통한 초기화

### 3. this (this 키워드)
- this 참조 변수
- this() 생성자
- 메서드 체이닝

## 🎯 주요 포인트

### 1. 생성자 특징
```java
public class Example {
    // 기본 생성자
    public Example() {
        // 초기화 코드
    }
    
    // 매개변수가 있는 생성자
    public Example(String param) {
        // 매개변수를 사용한 초기화
    }
}
```

### 2. 멤버 변수 초기화 순서
1. 필드 기본값 할당
2. 명시적 초기화
3. 초기화 블록
4. 생성자

### 3. this 키워드 활용
```java
public class Person {
    private String name;
    
    public Person(String name) {
        this.name = name;  // this로 필드 접근
    }
    
    public Person setName(String name) {
        this.name = name;
        return this;  // 메서드 체이닝
    }
}
```

## 💡 실습 예제

### 1. 기본 생성자와 오버로딩
```java
class Car {
    private String model;
    private String color;
    
    // 기본 생성자
    public Car() {
        this("unknown", "black");
    }
    
    // 매개변수가 있는 생성자
    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }
}
```

### 2. 초기화 블록 활용
```java
class InitExample {
    private static final int MAX_VALUE;
    private int instanceValue;
    
    // 정적 초기화 블록
    static {
        MAX_VALUE = 100;
    }
    
    // 인스턴스 초기화 블록
    {
        instanceValue = 1;
    }
}
```
