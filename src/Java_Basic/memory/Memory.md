# Java 메모리 관리 학습하기 💾

## 📚 학습 내용

### 1. Java 메모리 구조
- Stack 메모리
  - 지역 변수
  - 메서드 호출 정보
  - 원시 타입 데이터
- Heap 메모리
  - 객체
  - 배열
  - 인스턴스 변수

### 2. 참조(Reference)와 객체
- 참조 변수의 개념
- 객체 생성과 할당
- 가비지 컬렉션

## 📁 패키지 구조

### 1. basic (기본 개념)
- 메모리 기본 구조
- Stack과 Heap 영역
- 변수와 참조 관계

### 2. data (데이터 관리)
- 객체의 메모리 할당
- 참조 변수의 활용
- 가비지 컬렉션 동작

## 🎯 주요 포인트

### 1. 기본형과 참조형
```java
// 기본형 - Stack 영역에 직접 저장
int age = 20;
double price = 100.5;

// 참조형 - Stack에는 참조값, Heap에 실제 객체
String name = new String("Kim");
Data data = new Data();
```

### 2. 참조 관계
```java
Data data1 = new Data();
data1.value = 100;

// 참조 복사
Data data2 = data1;  // 같은 객체를 참조

// data1과 data2는 같은 객체를 참조
System.out.println(data1.value);  // 100
System.out.println(data2.value);  // 100

// data2를 통한 변경은 data1에도 영향을 미침
data2.value = 200;
System.out.println(data1.value);  // 200
```

## 💡 메모리 관리 특징

### 1. Stack 메모리
```java
void method() {
    int x = 10;          // Stack에 저장
    String y = "hello";  // Stack에 참조값 저장
}  // 메서드 종료시 Stack 영역에서 제거
```

### 2. Heap 메모리
```java
class Member {
    String name;    // 인스턴스 변수
    int age;        // 인스턴스 변수
    
    void print() {
        int temp = 0;  // Stack에 저장되는 지역 변수
        // ...
    }
}
```

## ⚠️ 주의사항
1. 참조하는 객체가 없으면 가비지 컬렉션 대상이 됨
2. Stack 메모리는 자동으로 관리됨
3. 명시적인 메모리 해제는 불필요 (GC가 처리)
4. 순환 참조 주의 