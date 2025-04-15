# Java final 키워드 정리 📚

## 1. final 키워드의 기본 개념

final 키워드는 Java에서 변수, 메서드, 클래스에 적용할 수 있는 제어자(modifier)입니다. 
final이 적용된 대상은 초기화 후 변경이 불가능합니다.

## 2. final의 주요 사용 사례

### 2.1 필드(Field)에 final 사용
- 인스턴스 변수나 클래스 변수에 final을 적용
- 초기화 후 값 변경 불가
- 생성자에서 초기화하거나 선언 시 초기화

### 2.2 지역 변수(Local Variable)에 final 사용
- 메서드 내부의 변수에 final 적용
- 초기화 후 값 변경 불가
- 메서드 파라미터에도 적용 가능

### 2.3 참조 변수(Reference Variable)에 final 사용
- 객체 참조 변수에 final 적용
- 참조하는 객체는 변경 불가
- 객체의 내부 상태는 변경 가능

### 2.4 상수(Constant) 정의
- static final 조합으로 상수 정의
- 대문자와 언더스코어로 명명
- 프로그램 전체에서 공유되는 불변 값

## 3. 패키지 구조

```
src/Java_Basic/_final/
├── constructor/           # 생성자에서 final 필드 초기화
│   └── ConstructInit.java
├── reference/            # 참조 변수의 final 사용
│   ├── Data.java
│   └── FinalRefMain.java
├── local/               # 지역 변수의 final 사용
│   └── FinalLocalMain.java
├── field/              # 클래스 필드의 final 사용
│   ├── FieldInit.java
│   └── FinalFieldMain.java
├── constant/           # 상수 정의와 사용
│   ├── Constant.java
│   ├── ConstantMain1.java
│   └── ConstantMain2.java
└── ex/                # 기본 예제
    ├── Member.java
    └── MemberMain.java
```

## 4. 주요 예제 설명

### 4.1 생성자에서 final 필드 초기화 (constructor)
- `ConstructInit.java`: 생성자를 통한 final 필드 초기화 예제
- 생성자에서 한 번 초기화된 후 변경 불가

### 4.2 참조 변수의 final 사용 (reference)
- `Data.java`: 기본 데이터 클래스
- `FinalRefMain.java`: final 참조 변수의 특징 설명
- 참조는 변경 불가, 객체 내부 상태는 변경 가능

### 4.3 지역 변수의 final 사용 (local)
- `FinalLocalMain.java`: final 지역 변수와 파라미터 사용 예제
- 초기화 후 값 변경 불가
- 메서드 파라미터에도 적용 가능

### 4.4 클래스 필드의 final 사용 (field)
- `FieldInit.java`: final 필드 초기화 예제
- `FinalFieldMain.java`: final 필드 사용 예제
- static final과 인스턴스 final 필드 구분

### 4.5 상수 정의와 사용 (constant)
- `Constant.java`: 상수 정의 클래스
- `ConstantMain1.java`: 매직 넘버 사용의 문제점
- `ConstantMain2.java`: 상수 사용의 장점

## 5. final 사용 시 주의사항

1. 초기화 시점
   - 필드: 선언 시 또는 생성자에서 초기화
   - 지역 변수: 사용 전 초기화
   - 참조 변수: 참조하는 객체 변경 불가

2. 상수 정의
   - static final 조합 사용
   - 대문자와 언더스코어로 명명
   - 의미 있는 이름 사용

3. 참조 변수
   - 참조 변경 불가
   - 객체 내부 상태 변경 가능
   - 불변 객체 설계 시 고려

## 6. 실습 예제

### 6.1 기본 예제 (ex)
- `Member.java`: final 필드 사용 예제
- `MemberMain.java`: final 필드 사용 실습

## 7. 연습문제

1. 상수 클래스 만들기
   - 수학 관련 상수 정의
   - 시간 관련 상수 정의
   - 애플리케이션 설정 상수 정의

2. final 필드 클래스 만들기
   - 생성자에서 초기화하는 final 필드
   - 선언 시 초기화하는 final 필드
   - static final 필드

3. 불변 객체 만들기
   - 모든 필드를 final로 선언
   - 생성자에서 초기화
   - getter 메서드만 제공
