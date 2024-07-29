
# 대원칙
- 자바는 항상 변수의 값을 복사해서 대입한다. 
- 기본형, 참조형 모두 항상 변수에 값을 복사해서 대입한다.
- 기본형이면 변수에 들어 있는 실제 사용하는 값을 복사해서 대입하고,
- 참조형이면 변수에 들어 있는 참조값을 복사해서 대입한다. 
- 메서드를 호출 할 때, 사용하는 매개변수(파라미터)도 결국 변수일 뿐이다. 따라서 메서드를 호출할 때 매개변수에 값을 전달하는 것도 앞서 설명한 내용과 같이 값을 복사해서 전달한다. 


## 기본형과 메서드 호출
```java
package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전: a = " + a); // 10
        changPrimitive(a);
        System.out.println("메서드 호출 전: a = " + a); // 10
    }
    
    public static void changPrimitive(int x) {
        x = 20;
    }
}
```

## 참조형과 메서드 호출
```java
package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;

        System.out.println("메서드 호출 전: dataA.value = " + dataA.value); // 10
        changeReference(dataA);
        System.out.println("메서드 호출 전: dataA.value = " + dataA.value); // 20
    }
    
    public static void changeReference(Data dataX) {
        dataX.value = 20;
    }
}
```
---
### 정리
- 자바에서 메서드의 매개변수(파라미터)는 항상 값에 의해 전달된다. 그러나 이 값이 실제 값이냐, 참조(메모리 주소)값이냐에 따라 동작이 달라진다. 
  - 기본형 : 메서드로 기본형 데이터를 전달하면, 해당 값이 복사되어 전달된다. 이 경우, 메서드 내부에서 파라미터의 값을 변겨해도, 호출자의 변수 값에는 영향이 없다.
  - 참조형 : 메서드로 참조형 데이터를 전달하면, 참조값이 복사되어 전달된다. 이 경우, 메서드 내부에서 파라미터로 전달된 객체의 멤버 변수를 변경하면ㄴ, 호출자의 객체도 변경된다. 


본