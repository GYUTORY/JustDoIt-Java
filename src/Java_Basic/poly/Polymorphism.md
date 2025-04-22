# Java 다형성 학습하기 🔄

## 📚 학습 내용

### 1. 다형성의 개념
- 한 객체가 여러 타입의 객체로 취급될 수 있는 능력
- 상속 관계에서의 메서드 오버라이딩
- 실행 시점의 동적 바인딩

### 2. 다형성의 종류
- 컴파일 타임 다형성 (오버로딩)
- 런타임 다형성 (오버라이딩)
- 매개변수 다형성 (제네릭)

## 📁 패키지 구조

### 1. basic (기본 개념)
- 다형성의 기본 원리
- 참조 변수의 타입과 인스턴스의 타입
- 형변환 (업캐스팅, 다운캐스팅)

### 2. car (자동차 예제)
- car0: 다형성 미적용 예제
- car1: 다형성 적용 예제
- 상속과 다형성의 관계

### 3. shape (도형 예제)
- 추상 클래스와 다형성
- 인터페이스와 다형성
- 도형의 계층 구조

## 🎯 주요 포인트

### 1. 업캐스팅과 다운캐스팅
```java
// 업캐스팅 (자동 형변환)
Parent parent = new Child();
parent.parentMethod();  // 가능
// parent.childMethod();  // 불가능

// 다운캐스팅 (명시적 형변환)
Child child = (Child) parent;
child.childMethod();  // 가능
```

### 2. instanceof 연산자
```java
public void checkType(Animal animal) {
    if (animal instanceof Dog) {
        Dog dog = (Dog) animal;
        dog.bark();
    } else if (animal instanceof Cat) {
        Cat cat = (Cat) animal;
        cat.meow();
    }
}
```

### 3. 추상 클래스와 인터페이스
```java
// 추상 클래스
abstract class Shape {
    abstract double getArea();
    
    // 공통 메서드
    void describe() {
        System.out.println("이것은 도형입니다.");
    }
}

// 인터페이스
interface Drawable {
    void draw();  // 추상 메서드
    default void print() {  // 디폴트 메서드
        System.out.println("도형을 출력합니다.");
    }
}
```

## 💡 다형성의 활용

### 1. 메서드 오버라이딩
```java
class Car {
    void run() {
        System.out.println("차가 달립니다.");
    }
}

class SportsCar extends Car {
    @Override
    void run() {
        System.out.println("스포츠카가 빠르게 달립니다.");
    }
}
```

### 2. 다형성을 활용한 객체 관리
```java
// 배열을 이용한 여러 객체 관리
Car[] cars = new Car[3];
cars[0] = new Car();
cars[1] = new SportsCar();
cars[2] = new Truck();

// 모든 차량 운행
for (Car car : cars) {
    car.run();  // 각 객체의 오버라이딩된 메서드 호출
}
```

### 3. 인터페이스를 통한 확장
```java
interface Movable {
    void move();
}

class Car implements Movable {
    @Override
    public void move() {
        System.out.println("도로를 달립니다.");
    }
}

class Ship implements Movable {
    @Override
    public void move() {
        System.out.println("바다를 항해합니다.");
    }
}
```

## ⚠️ 주의사항
1. 무분별한 다운캐스팅 지양
2. instanceof 연산자 사용 시 주의
3. 적절한 추상화 수준 유지
4. 인터페이스 분리 원칙 준수 