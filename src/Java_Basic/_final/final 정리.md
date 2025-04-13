# Java의 final 키워드와 상수

## 1. 상수(Constant)
상수는 변하지 않고, 항상 일정한 값을 갖는 수를 말합니다. 자바에서는 보통 단 하나만 존재하는 변하지 않는 고정된 값을 상수라 합니다.

### 1.1 자바 상수의 특징
- `static final` 키워드를 사용합니다.
  - `static`: 클래스 레벨에서 공유되는 값
  - `final`: 한 번 초기화되면 변경할 수 없음
- 대문자를 사용하고 구분은 `_` (언더스코어)로 합니다.
  - 예: `MAX_USERS`, `PI`, `HOURS_IN_DAY`
- 필드를 직접 접근해서 사용합니다.
  - 상수는 기능이 아니라 고정된 값 자체를 사용하는 것이 목적입니다.
  - 상수는 값을 변경할 수 없으므로 필드에 직접 접근해도 안전합니다.

### 1.2 상수를 사용하는 이유
1. 매직 넘버 제거
   - 의미가 불명확한 숫자를 의미 있는 이름으로 대체
   - 코드의 가독성 향상
2. 유지보수성 향상
   - 값 변경 시 한 곳만 수정하면 됨
   - 실수로 인한 버그 방지
3. 중앙 집중화 관리
   - 모든 상수 값을 한 곳에서 관리
   - 값의 일관성 보장

### 1.3 상수 사용 예시
```java
public class Constant {
    // 수학 상수
    public static final double PI = 3.14;

    // 시간 상수
    public static final int HOURS_IN_DAY = 24;
    public static final int MINUTES_IN_HOUR = 60;

    // 애플리케이션 설정 상수
    public static final int MAX_USERS = 1000;
}
```

## 2. final 변수와 참조

### 2.1 final의 의미
- `final`은 변수의 값을 변경하지 못하게 막습니다.
- 변수의 종류에 따라 다른 제약이 적용됩니다:
  1. 기본형 변수: 값 자체를 변경할 수 없음
  2. 참조형 변수: 참조값을 변경할 수 없음 (객체의 내부 상태는 변경 가능)

### 2.2 final 변수의 종류
1. final 필드 (멤버 변수)
   - 클래스 내부에서 선언된 final 변수
   - 생성자에서 초기화하거나 선언과 동시에 초기화해야 함

2. final 지역 변수
   - 메서드 내부에서 선언된 final 변수
   - 선언과 동시에 초기화하거나 한 번만 초기화 가능

3. final 매개변수
   - 메서드의 매개변수로 선언된 final 변수
   - 메서드 내부에서 값을 변경할 수 없음

### 2.3 final 사용 시 주의사항
1. 초기화
   - final 필드는 반드시 초기화해야 함
   - 초기화되지 않은 final 필드는 컴파일 에러 발생

2. 상속
   - final 메서드는 오버라이딩 불가
   - final 클래스는 상속 불가

3. 참조형 변수
   - final 참조형 변수의 경우 참조값만 변경 불가
   - 객체의 내부 상태는 변경 가능

## 3. final 사용의 장점
1. 안전성
   - 실수로 인한 값 변경 방지
   - 컴파일 시점에 오류 발견 가능

2. 가독성
   - 코드의 의도를 명확히 전달
   - 변수의 불변성 보장

3. 유지보수성
   - 코드의 복잡성 감소
   - 버그 발생 가능성 감소

## 4. 사용 예시
```java
public class Example {
    // final 필드
    private final String id;
    
    // final 지역 변수
    public void method() {
        final int number = 10;
        // number = 20; // 컴파일 에러
    }
    
    // final 매개변수
    public void process(final String data) {
        // data = "new value"; // 컴파일 에러
    }
}
```
