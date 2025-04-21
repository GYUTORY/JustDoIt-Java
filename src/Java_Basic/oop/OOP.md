# Java 객체 지향 프로그래밍 학습하기 🎯

## 📚 학습 내용

### 1. 객체 지향 프로그래밍 기본 개념
- 클래스와 객체
- 인스턴스와 참조
- 객체 지향 프로그래밍의 특징

### 2. 객체 지향의 핵심 원리
- 캡슐화와 정보 은닉
- 상속과 확장
- 다형성과 추상화

## 📁 패키지 구조

### 1. basic (기본 개념)
- 클래스와 객체의 기본 구조
- 인스턴스 생성과 사용
- 객체 간의 관계

### 2. access (접근 제어)
- 접근 제어자 (public, private, protected)
- 캡슐화 구현
- getter/setter 메서드

### 3. construct (생성자)
- 기본 생성자
- 매개변수가 있는 생성자
- 생성자 오버로딩

### 4. inherit (상속)
- 상속의 개념과 구현
- 메서드 오버라이딩
- super 키워드

### 5. poly (다형성)
- 다형성의 개념
- 업캐스팅과 다운캐스팅
- 추상 클래스와 인터페이스

## 🎯 주요 포인트

### 1. 클래스와 객체
```java
public class Person {
    // 필드 (상태)
    private String name;
    private int age;
    
    // 생성자
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // 메서드 (행위)
    public void introduce() {
        System.out.println("안녕하세요, 저는 " + name + "입니다.");
    }
}
```

### 2. 캡슐화와 접근 제어
```java
public class Account {
    private long balance;  // 정보 은닉
    
    public void deposit(long amount) {
        if (amount > 0) {  // 유효성 검사
            balance += amount;
        }
    }
    
    public boolean withdraw(long amount) {
        if (amount <= balance) {  // 유효성 검사
            balance -= amount;
            return true;
        }
        return false;
    }
}
```

### 3. 상속과 다형성
```java
// 부모 클래스
public abstract class Animal {
    protected String name;
    
    public abstract void makeSound();  // 추상 메서드
}

// 자식 클래스
public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("멍멍!");
    }
}

// 다형성 활용
Animal animal = new Dog();  // 업캐스팅
animal.makeSound();  // "멍멍!" 출력
```

## 💡 객체 지향 특징

### 1. 캡슐화 (Encapsulation)
- 데이터와 해당 데이터를 처리하는 메서드를 하나로 묶음
- 정보 은닉을 통한 데이터 보호
- 코드의 유지보수성 향상

### 2. 상속 (Inheritance)
- 기존 클래스의 속성과 기능을 재사용
- 코드의 재사용성 증가
- 계층적 관계 구현

### 3. 다형성 (Polymorphism)
- 하나의 객체가 여러 타입의 형태를 가질 수 있음
- 인터페이스를 통한 유연한 설계
- 코드의 확장성 향상

## ⚠️ 주의사항
1. 적절한 접근 제어자 사용
2. 불필요한 상속 지양
3. 인터페이스와 구현의 분리
4. 단일 책임 원칙 준수 