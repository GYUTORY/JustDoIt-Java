# Java 리플렉션과 클래스 메타데이터 📚

## 1. 리플렉션(Reflection)이란? 🎯

리플렉션은 실행 중인 자바 프로그램이 자체적으로 검사하거나 수정할 수 있는 기능을 말합니다. 클래스의 메타데이터를 조사하고 조작할 수 있습니다.

### 1.1 Class 객체 얻기 📋

```java
// 1. 클래스에서 직접 얻기
Class clazz = String.class;

// 2. 인스턴스에서 얻기
Class clazz = new String().getClass();

// 3. 문자열로 얻기
Class clazz = Class.forName("java.lang.String");
```

## 2. 클래스 메타데이터 조회 💡

### 2.1 필드 정보 조회
```java
// 모든 필드 조회
Field[] fields = clazz.getDeclaredFields();
for (Field field : fields) {
    System.out.println("field = " + field.getType() + " " + field.getName());
}
```

### 2.2 메서드 정보 조회
```java
// 모든 메서드 조회
Method[] methods = clazz.getDeclaredMethods();
for (Method method : methods) {
    System.out.println("method = " + method);
}
```

### 2.3 상속 정보 조회
```java
// 상위 클래스 조회
Class superClass = clazz.getSuperclass();

// 인터페이스 조회
Class[] interfaces = clazz.getInterfaces();
```

## 3. 동적 객체 생성 🔨

```java
// 클래스 정보 얻기
Class helloClass = Hello.class;

// 생성자로 인스턴스 생성
Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
```

## 4. 리플렉션의 활용 사례 🌟

1. **프레임워크/라이브러리**
   - Spring Framework의 의존성 주입
   - JUnit의 테스트 메서드 실행
   - ORM 프레임워크의 객체-테이블 매핑

2. **IDE의 자동완성**
   - 클래스의 메서드와 필드 정보 분석
   - 코드 어시스트 기능 제공

3. **테스트 도구**
   - private 멤버에 접근
   - 단위 테스트 작성

## 5. 주의사항 ⚠️

1. **성능 고려**
   - 리플렉션은 일반 코드보다 느림
   - 성능이 중요한 경우 사용 자제

2. **보안 위험**
   - private 멤버 접근 가능
   - 적절한 보안 관리 필요

3. **캡슐화 위반**
   - 내부 구현에 직접 접근
   - 유지보수성 저하 가능

## 6. 예제 코드 💻

### 6.1 클래스 메타데이터 조회 (ClassMetaMain.java)
```java
Class clazz = String.class;
Field[] fields = clazz.getDeclaredFields();
Method[] methods = clazz.getDeclaredMethods();
Class superClass = clazz.getSuperclass();
Class[] interfaces = clazz.getInterfaces();
```

### 6.2 동적 객체 생성 (ClassCreateMain.java)
```java
Class helloClass = Hello.class;
Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
String result = hello.hello();
```

## 7. 실습 예제 📝

1. **클래스 정보 조회**
```java
// String 클래스의 모든 public 메서드 출력
Method[] methods = String.class.getMethods();
for (Method method : methods) {
    System.out.println(method.getName());
}
```

2. **동적 객체 생성과 메서드 호출**
```java
// 클래스 이름으로 객체 생성
Class<?> cls = Class.forName("your.package.ClassName");
Object obj = cls.getDeclaredConstructor().newInstance();
``` 