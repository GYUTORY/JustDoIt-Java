# Java 형변환(Casting) 학습하기 🔄

## 📚 학습 내용

### 1. 기본형 형변환 (Primitive Type Casting)
- 자동 형변환 (묵시적 형변환)
- 강제 형변환 (명시적 형변환)
- 데이터 손실 주의사항

### 2. 참조형 형변환 (Reference Type Casting)
- 업캐스팅 (Upcasting)
- 다운캐스팅 (Downcasting)
- instanceof 연산자 활용

## 📁 패키지 구조

### 1. primitive
```java
// 기본형 형변환 예제
int intValue = 10;
double doubleValue = intValue;  // 자동 형변환
int backToInt = (int) doubleValue;  // 강제 형변환
```

### 2. reference
```java
// 참조형 형변환 예제
class Animal { }
class Dog extends Animal { }

Animal animal = new Dog();  // 업캐스팅
Dog dog = (Dog) animal;    // 다운캐스팅
```

## 🎯 주요 포인트

### 1. 기본형 형변환 규칙
```
byte(1) → short(2) → int(4) → long(8) → float(4) → double(8)
         → char(2) ↗
```
- 작은 타입에서 큰 타입으로: 자동 형변환
- 큰 타입에서 작은 타입으로: 강제 형변환 필요

### 2. 참조형 형변환 특징
- 상속 관계에서만 가능
- 업캐스팅: 항상 안전
- 다운캐스팅: instanceof로 검사 필요

### 3. 주의사항
1. 기본형 형변환
   - 데이터 손실 가능성 체크
   - 범위 초과 시 값 왜곡 주의

2. 참조형 형변환
   - ClassCastException 주의
   - instanceof 연산자로 안전한 형변환

## 💡 실습 예제

### 1. 기본형 형변환
```java
public class PrimitiveCasting {
    public static void main(String[] args) {
        // 자동 형변환
        int num = 100;
        double doubleNum = num;  // int → double
        
        // 강제 형변환
        double pi = 3.14;
        int intPi = (int) pi;  // double → int: 소수점 손실
    }
}
```

### 2. 참조형 형변환
```java
class Vehicle { }
class Car extends Vehicle {
    void drive() { }
}

public class ReferenceCasting {
    public static void main(String[] args) {
        // 업캐스팅
        Vehicle vehicle = new Car();
        
        // 다운캐스팅 (안전하게)
        if (vehicle instanceof Car) {
            Car car = (Car) vehicle;
            car.drive();
        }
    }
}
```