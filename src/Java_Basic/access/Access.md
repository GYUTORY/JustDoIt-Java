
### 접근 제어자 이해
- 자바는 public, private 같은 접근 제어자(Java_Basic.access modifier)를 제공한다.
- 접근 제어자를 사용하면 해당 클래스 외부에서 특정 필드나 메서드에 접근하는 것을 허용하거나 제한할 수 있다. 

### 접근제어자의 종류
1. private : 모든 외부 호출을 막는다.
2. default(package-private) : 같은 패키지안에서 호출은 허용한다.
3. protected : 같은 패키지안에서 허용한다. 패키지가 달라도 상속 관계의 호출은 허용한다.
4. public : 모든 외부 호출을 허용한다.

> private > default > protected > public 


--- 

### 접근 제어자 사용 위치
- 접근 제어자는 필드와 메서드, 생성자에 사용된다.
- 클래스 레벨에도 일부 접근 제어자를 사용할 수 있다.


---

# 클래스 레벨의 접근 제어자 규칙
- 클래스 레벨의 접근 제어자는 public, default만 사용할 수 있다. 
  - private, protected는 사용할 수 없다. 
- public 클래스는 반드시 파일명과 이름이 같아야 한다.
  - 하나의 자바 파일에 public 클래스는 하나만 등장할 수 있다.
  - 하나의 자바 파일에 default 접그 제어자를 사용하는 클래스는 무한정 막을 수 있다.

```java
package Java_Basic.access.a;

public class PublicClass {
  public static void main(String[] args) {
    PublicClass publicClass = new PublicClass();
    DefaultClass1 Java_Basic.class_basic = new DefaultClass1();
    DefaultClass2 class2 = new DefaultClass2();
  }
}

class DefaultClass1 {

}

class DefaultClass2 {

}
```

- PublicClass는 public 접근 제어자다. 따라서, 파일명과 이 클래스의 이름이 반드시 같아야 한다. public이기 때문에, 외부에서 접근할 수 있다.
- DefaultClass1, DefaultClass2는 default 접근 제어자다. 이 클래스는 default이기 때문에 같은 패키지 내부에서만 접근할 수 있다.
- PublicClass의 main()을 보면 각각의 클래스를 사용하는 예를 보여준다. 
  - PublicClass는 pubic 접근 제어다. 따라서, 어디서든 사용할 수 있다. DefaultClass1, DefaultClass2와는 같은 패키지에 있으므로 사용할 수 있다.

