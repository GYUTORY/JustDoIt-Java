# 메서드 오버로딩 (Method Overloading) 📚

## 1. 개념 정리 🎯

메서드 오버로딩은 같은 이름의 메서드를 여러 개 정의하는 것을 말합니다. 자바는 다음 정보를 사용하여 메서드를 구분합니다:
- 메서드 이름
- 매개변수의 타입
- 매개변수의 순서
- 매개변수의 개수

### 오버로딩의 규칙 📋

1. **성공 조건**
   - 메서드 이름이 같아야 함
   - 매개변수가 달라야 함 (타입, 순서, 개수 중 하나 이상)

2. **실패 조건**
   - 반환 타입만 다른 경우는 오버로딩 불가
   - 매개변수 이름만 다른 경우는 오버로딩 불가

## 2. 예제 코드 💻

### 2.1 매개변수 개수가 다른 오버로딩 (Overloading1.java)
```java
// 두 정수를 더하는 메서드
public static int add(int a, int b) {
    return a + b;
}

// 세 정수를 더하는 메서드
public static int add(int a, int b, int c) {
    return a + b + c;
}
```

### 2.2 매개변수 타입이 다른 오버로딩 (Overloading2.java)
```java
public static void myMethod(int a, double b) {
    System.out.println("int a, double b");
}

public static void myMethod(double a, int b) {
    System.out.println("double a, int b");
}
```

### 2.3 매개변수 타입과 반환 타입이 다른 오버로딩 (Overloading3.java)
```java
public static int add(int a, int b) {
    return a + b;
}

public static double add(double a, double b) {
    return a + b;
}
```

## 3. 오버로딩의 장점 🌟

1. **일관된 메서드 이름**
   - 비슷한 기능은 같은 이름으로 구현 가능
   - 코드의 가독성과 유지보수성 향상

2. **다형성 지원**
   - 같은 메서드 이름으로 다양한 매개변수 처리 가능
   - 타입에 따른 적절한 메서드 자동 선택

3. **API 설계의 유연성**
   - 다양한 매개변수 조합 지원 가능
   - 사용자 편의성 향상

## 4. 주의사항 ⚠️

1. **모호한 호출 피하기**
   - 자동 형변환으로 인한 모호한 호출 주의
   - 명시적 형변환 사용 고려

2. **과도한 오버로딩 피하기**
   - 너무 많은 오버로딩은 코드 복잡도 증가
   - 필요한 경우에만 적절히 사용
 