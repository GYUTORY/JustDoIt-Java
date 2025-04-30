# Java 메서드 체이닝 (Method Chaining) 🔗

## 1. 메서드 체이닝이란?
메서드 체이닝은 객체의 메서드를 연속적으로 호출하는 프로그래밍 패턴입니다. 메서드가 객체 자신을 반환함으로써 여러 메서드 호출을 마치 체인처럼 연결할 수 있습니다.

### 1.1 기본 개념
- **정의**: 한 객체의 메서드를 호출한 후, 그 결과로 받은 객체에서 다시 다른 메서드를 호출하는 방식
- **목적**: 코드의 가독성 향상과 간결한 표현을 위해 사용
- **특징**: 각 메서드는 객체 자신(`this`)을 반환하여 연속적인 호출이 가능

### 1.2 일반 호출과 체이닝 비교
```java
// 1. 일반적인 메서드 호출
ValueAdder adder = new ValueAdder();
adder.add(10);          // 첫 번째 호출
adder.add(20);          // 두 번째 호출
adder.add(30);          // 세 번째 호출
int result = adder.getValue();

// 2. 메서드 체이닝 사용
int result = new ValueAdder()
    .add(10)            // 첫 번째 호출 후 객체 반환
    .add(20)            // 두 번째 호출 후 객체 반환
    .add(30)            // 세 번째 호출 후 객체 반환
    .getValue();        // 최종 값 반환
```

## 2. 메서드 체이닝의 구현 방법

### 2.1 기본 구현 패턴
```java
public class ValueAdder {
    private int value;  // 객체의 상태를 저장하는 필드
    
    // 1. 생성자
    public ValueAdder() {
        this.value = 0;
    }
    
    // 2. 체이닝을 위한 메서드 - 자기 자신을 반환
    public ValueAdder add(int value) {
        this.value += value;
        return this;    // 현재 객체를 반환하여 체이닝 가능
    }
    
    // 3. 결과를 반환하는 메서드 - 체이닝의 종료
    public int getValue() {
        return value;
    }
}
```

### 2.2 체이닝 가능한 메서드의 조건
1. **반환 타입**
   - 메서드의 반환 타입은 클래스 자신이어야 함
   - void가 아닌 현재 클래스 타입을 반환

2. **상태 변경**
   - 객체의 상태를 변경하는 작업 수행
   - 변경된 상태를 가진 현재 객체를 반환

3. **독립성**
   - 각 메서드는 독립적으로 동작 가능해야 함
   - 호출 순서에 따른 부작용이 없어야 함

## 3. 메서드 체이닝의 장점과 활용

### 3.1 코드 가독성 향상
1. **간결성**
   - 여러 줄의 코드를 하나의 문장으로 표현
   - 불필요한 중간 변수 제거
   
2. **명확성**
   - 작업의 순서가 시각적으로 명확
   - 코드의 의도를 쉽게 파악 가능

3. **유지보수**
   - 관련된 작업들을 그룹화
   - 코드 수정이 용이

### 3.2 실제 활용 사례

1. **StringBuilder 클래스**
```java
// 문자열 연결 작업
StringBuilder sb = new StringBuilder()
    .append("Hello")    // 문자열 추가
    .append(" ")        // 공백 추가
    .append("World")    // 문자열 추가
    .append("!")        // 문자열 추가
    .toString();        // 최종 문자열 생성
```

2. **Stream API**
```java
// 데이터 처리 파이프라인
List<Integer> result = numbers.stream()
    .filter(n -> n > 0)     // 양수만 필터링
    .map(n -> n * 2)        // 각 숫자를 2배로
    .sorted()               // 정렬
    .collect(Collectors.toList()); // 리스트로 수집
```

## 4. 주의사항 및 모범 사례

### 4.1 디버깅 고려사항
1. **체인 길이**
   - 너무 긴 체인은 디버깅을 어렵게 만듦
   - 적절한 길이로 분리하여 사용

2. **중간 상태 확인**
   - 디버깅 시 중간 결과 확인이 어려울 수 있음
   - 필요한 경우 중간 결과를 로깅

### 4.2 안전한 체이닝 구현
1. **널 체크**
```java
// Optional을 활용한 안전한 체이닝
Optional.ofNullable(obj)
    .map(o -> o.method1())
    .map(o -> o.method2())
    .orElse(defaultValue);
```

2. **예외 처리**
```java
try {
    result = obj.method1()
        .method2()
        .method3();
} catch (Exception e) {
    // 체인 중간에서 발생한 예외 처리
    handleException(e);
}
```

### 4.3 성능 고려사항
- 각 체인 단계마다 새로운 객체를 생성하지 않도록 주의
- 불필요한 중간 연산 최소화
- 큰 데이터셋에서는 성능 영향을 고려 