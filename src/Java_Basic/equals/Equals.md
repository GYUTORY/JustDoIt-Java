# Java equals() 메서드 학습하기 🔍

## 📚 학습 내용

### 1. equals() 메서드의 기본 개념
- 객체의 동등성(equality) 비교
- Object 클래스의 equals() 메서드
- == 연산자와의 차이점

### 2. equals() 메서드 오버라이딩
- 객체의 내용 비교
- hashCode()와의 관계
- 올바른 구현 방법

## 📁 패키지 구조

### 1. basic (기본 개념)
- equals() 메서드의 기본 동작
- == 연산자와 equals() 비교
- String 객체의 equals()

### 2. user (사용자 정의 클래스)
- equals() 메서드 오버라이딩
- hashCode() 메서드 구현
- 객체 비교 예제

## 🎯 주요 포인트

### 1. == vs equals()
```java
String str1 = new String("hello");
String str2 = new String("hello");

System.out.println(str1 == str2);        // false (참조 비교)
System.out.println(str1.equals(str2));   // true (내용 비교)
```

### 2. equals() 메서드 구현
```java
public class User {
    private String id;
    private String name;
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        User user = (User) obj;
        return Objects.equals(id, user.id) &&
               Objects.equals(name, user.name);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
```

## 💡 실습 예제

### 1. String 객체 비교
```java
String str1 = "hello";
String str2 = "hello";
String str3 = new String("hello");

System.out.println(str1 == str2);      // true (문자열 리터럴)
System.out.println(str1 == str3);      // false (새로운 객체)
System.out.println(str1.equals(str3)); // true (내용 비교)
```

### 2. 사용자 정의 클래스 비교
```java
class Book {
    private String isbn;
    private String title;
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return Objects.equals(isbn, book.isbn);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }
}
```

## ⚠️ 주의사항
1. equals()를 오버라이딩할 때는 반드시 hashCode()도 함께 오버라이딩
2. null 체크 필수
3. 타입 체크 필수
4. 대칭성, 추이성, 일관성 준수 