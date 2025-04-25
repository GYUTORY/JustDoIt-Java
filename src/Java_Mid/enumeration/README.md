# Java 열거형(Enum) 학습 📚

## 1. 패키지 구조 📁

```
src/Java_Mid/enumeration/
├── README.md              # 패키지 설명
├── basic/                 # 기본 예제
│   ├── Grade.java        # 기본 열거형 예제
│   └── EnumMethodMain.java # 열거형 메서드 사용 예제
├── grade/                 # 성적 처리 예제
│   ├── ClassGrade.java   # 학급 성적 처리
│   └── StringGrade.java  # 문자열 기반 성적 처리
├── discount/              # 할인 정책 예제
│   └── DiscountService.java # 할인 서비스 구현
└── example/              # 실전 예제
    ├── ClassGradeEx*.java  # 학급 성적 처리 예제
    └── StringGradeEx*.java # 문자열 성적 처리 예제
```

## 2. 열거형 개념 🎯

### 2.1 열거형이란?
- 관련된 상수들의 집합을 정의하는 데이터 타입
- 타입 안전성 보장
- 코드의 가독성과 유지보수성 향상

### 2.2 열거형의 특징
1. **타입 안전성**
   - 컴파일 시점에 타입 체크
   - 지정된 상수만 사용 가능

2. **싱글톤 보장**
   - 각 상수는 하나의 인스턴스로만 존재
   - 메모리 효율성

3. **메서드와 필드 추가 가능**
   - 단순 상수 그룹 이상의 기능 구현 가능
   - 관련 동작을 응집도 있게 구현

## 3. 주요 예제 💡

### 3.1 기본 열거형
```java
public enum Grade {
    A, B, C, D, F
}
```

### 3.2 필드를 가진 열거형
```java
public enum Grade {
    A(90, "우수"),
    B(80, "양호"),
    C(70, "보통"),
    D(60, "미흡"),
    F(0, "불합격");

    private final int score;
    private final String description;

    Grade(int score, String description) {
        this.score = score;
        this.description = description;
    }
}
```

### 3.3 메서드를 가진 열거형
```java
public enum DiscountPolicy {
    NONE(0) {
        @Override
        public int applyDiscount(int price) {
            return price;
        }
    },
    FIXED_AMOUNT(1000) {
        @Override
        public int applyDiscount(int price) {
            return price - discountAmount;
        }
    };

    protected final int discountAmount;
    
    DiscountPolicy(int discountAmount) {
        this.discountAmount = discountAmount;
    }

    public abstract int applyDiscount(int price);
}
```

## 4. 실습 예제 설명 📝

### 4.1 성적 처리 시스템
- `StringGrade`: 문자열 기반 성적 처리
- `ClassGrade`: 열거형 기반 성적 처리
- 장단점 비교 및 리팩토링 예제

### 4.2 할인 정책 시스템
- `DiscountService`: 다양한 할인 정책 구현
- 열거형을 활용한 전략 패턴 구현
- 확장성과 유지보수성 개선

## 5. 실행 방법 🚀

1. 기본 예제 실행:
```bash
java Java_Mid.enumeration.basic.EnumMethodMain
```

2. 성적 처리 예제 실행:
```bash
java Java_Mid.enumeration.example.ClassGradeEx1
```

## 6. 주의사항 ⚠️

1. **상속 제한**
   - 열거형은 다른 클래스를 상속받을 수 없음
   - 인터페이스 구현은 가능

2. **생성자 제한**
   - 생성자는 항상 private
   - new 연산자로 인스턴스 생성 불가

3. **상수 정의 위치**
   - 열거형 상수는 항상 맨 앞에 정의
   - 다른 필드나 메서드보다 먼저 선언

4. **equals() 대신 ==**
   - 열거형 상수 비교는 == 연산자 사용 권장
   - equals() 메서드도 사용 가능 