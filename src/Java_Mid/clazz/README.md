# Java 리플렉션과 클래스 메타데이터 학습 📚

## 1. 패키지 구조 📁

```
src/Java_Mid/clazz/
├── README.md                # 패키지 설명
├── basic/                   # 기본 예제
│   └── ClassCreateMain.java # 동적 객체 생성 예제
├── meta/                    # 메타데이터 관련
│   └── ClassMetaMain.java  # 클래스 정보 조회 예제
└── example/                 # 예제 클래스
    └── Hello.java          # 테스트용 간단한 클래스
```

## 2. 주요 개념 🎯

### 2.1 리플렉션(Reflection)
- 실행 중인 자바 프로그램이 자신의 구조를 조사하고 수정할 수 있는 기능
- 클래스 로더가 클래스를 로딩하면 JVM은 해당 클래스의 정보를 담은 Class 객체를 생성

### 2.2 Class 객체 획득 방법
```java
// 1. 클래스에서 직접 획득
Class<?> clazz = String.class;

// 2. 인스턴스에서 획득
Class<?> clazz = new String().getClass();

// 3. 문자열로 획득
Class<?> clazz = Class.forName("java.lang.String");
```

## 3. 예제 설명 💡

### 3.1 기본 예제 (basic/)
- `ClassCreateMain.java`: Class 객체를 사용하여 동적으로 인스턴스를 생성하는 방법을 보여줌
  ```java
  Class<?> helloClass = Hello.class;
  Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
  ```

### 3.2 메타데이터 예제 (meta/)
- `ClassMetaMain.java`: 클래스의 구조(필드, 메서드, 상속 관계 등)를 조회하는 방법을 보여줌
  ```java
  Field[] fields = clazz.getDeclaredFields();
  Method[] methods = clazz.getDeclaredMethods();
  Class<?> superClass = clazz.getSuperclass();
  ```

### 3.3 테스트 클래스 (example/)
- `Hello.java`: 리플렉션 예제에서 사용할 간단한 테스트 클래스

## 4. 실행 방법 🚀

1. 메타데이터 조회 예제 실행:
```bash
java Java_Mid.clazz.meta.ClassMetaMain
```

2. 동적 객체 생성 예제 실행:
```bash
java Java_Mid.clazz.basic.ClassCreateMain
```

## 5. 주의사항 ⚠️

1. **성능 고려**
   - 리플렉션은 일반 코드보다 실행 속도가 느림
   - 성능이 중요한 경우 사용을 자제

2. **보안 위험**
   - private 멤버에도 접근 가능
   - 적절한 보안 관리 필요

3. **타입 안전성**
   - 컴파일 시점의 타입 체크를 우회
   - 런타임 오류 가능성 증가 