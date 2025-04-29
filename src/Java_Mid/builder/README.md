# Builder Pattern (빌더 패턴)

## 개요
빌더 패턴은 복잡한 객체의 생성 과정과 표현 방법을 분리하여 다양한 구성의 인스턴스를 만들 수 있게 해주는 생성 패턴입니다.

## 필요성
1. **생성자 매개변수가 많은 경우**
   - 많은 매개변수를 가진 객체를 생성할 때 가독성 문제 해결
   - 선택적 매개변수 처리가 용이

2. **불변성이 필요한 경우**
   - 객체 생성 후 상태를 변경할 수 없도록 보장
   - Thread-safe한 객체 생성 가능

3. **유연한 객체 생성**
   - 필요한 데이터만 선택적으로 설정
   - 매개변수의 순서에 구애받지 않음

## 장점
1. **가독성 향상**
   ```java
   // 빌더 패턴 사용
   Person person = new Person.Builder()
       .name("John")
       .age(30)
       .address("Seoul")
       .build();

   // 생성자 사용 (가독성 떨어짐)
   Person person = new Person("John", 30, "Seoul", null, null);
   ```

2. **유연성**
   - 필수 값과 선택적 값을 구분하여 처리
   - 검증 로직을 빌더 내부에 캡슐화

3. **불변성 보장**
   - 객체 생성 후 상태 변경 불가
   - final 필드 사용 가능

4. **안전성**
   - 빌드 시점에 유효성 검사 가능
   - 잘못된 상태의 객체 생성 방지

## 단점
1. **코드량 증가**
   - 빌더 클래스를 별도로 작성해야 함
   - 기본 생성자보다 많은 코드 필요

2. **복잡성**
   - 간단한 객체 생성에는 과도할 수 있음
   - 추가적인 클래스 생성으로 인한 복잡도 증가

## 구현 예제

### 1. 기본 구현 (Person 클래스)
```java
public class Person {
    private final String name;    // 필수
    private final int age;       // 필수
    private final String address; // 선택
    private final String phone;   // 선택
    private final String email;   // 선택

    public static class Builder {
        // 빌더 구현
    }
}
```

### 2. 실제 활용 예제 (Product 클래스)
```java
Product product = new Product.Builder("노트북", 1000000)
    .color("블랙")
    .warranty(24)
    .insurance(true)
    .giftWrapping(true)
    .build();
```

## 사용 시나리오

### 1. 복잡한 객체 생성이 필요한 경우
- 데이터베이스 연결 설정
- 네트워크 설정
- UI 컴포넌트 생성

### 2. 불변 객체가 필요한 경우
- 설정 객체
- 도메인 모델
- DTO (Data Transfer Object)

### 3. 선택적 매개변수가 많은 경우
- 사용자 프로필 정보
- 상품 주문 정보
- 시스템 설정

## 실제 사용 예시

### 1. 기본 사용
```java
Person person = new Person.Builder()
    .name("John")
    .age(30)
    .build();
```

### 2. 모든 필드 사용
```java
Person person = new Person.Builder()
    .name("Mike")
    .age(35)
    .address("Busan")
    .phone("010-9876-5432")
    .email("mike@example.com")
    .build();
```

### 3. 유효성 검사
```java
public Person build() {
    if (name == null || name.isEmpty()) {
        throw new IllegalStateException("이름은 필수 입력값입니다.");
    }
    if (age <= 0) {
        throw new IllegalStateException("나이는 0보다 커야 합니다.");
    }
    return new Person(this);
}
```

## 모범 사례

1. **필수 매개변수는 Builder 생성자에서 처리**
   ```java
   public Builder(String name, int price) {
       this.name = name;
       this.price = price;
   }
   ```

2. **선택적 매개변수는 메서드 체이닝으로 처리**
   ```java
   public Builder email(String email) {
       this.email = email;
       return this;
   }
   ```

3. **빌드 시점에 유효성 검사**
   ```java
   public Product build() {
       // 유효성 검사 로직
       return new Product(this);
   }
   ```

## 주의사항

1. **불필요한 사용 피하기**
   - 매개변수가 4개 이하인 경우는 생성자 사용 고려
   - 간단한 객체는 기본 생성자 사용

2. **일관성 있는 네이밍**
   - 빌더 메서드는 필드명과 동일하게 작성
   - build() 메서드는 항상 마지막에 호출

3. **유효성 검사**
   - 필수 값에 대한 검증은 반드시 수행
   - 데이터 형식이나 범위에 대한 검증 추가

## 결론
빌더 패턴은 복잡한 객체 생성을 단순화하고, 코드의 가독성과 유지보수성을 향상시키는 강력한 도구입니다. 특히 많은 선택적 매개변수를 가진 객체를 생성할 때 유용하며, 객체의 불변성을 보장하면서도 유연한 객체 생성을 가능하게 합니다. 