# Java의 접근 제어자 이해하기 🔒

## 📁 패키지 구성
### 1. 기본 예제
- `BankAccount`: 캡슐화가 필요한 은행 계좌 시스템
- `Speaker`: 볼륨 조절이 있는 스피커 시스템

### 2. 접근 제어 테스트
- `same_package`: 같은 패키지 내에서의 접근 테스트
  - 같은 패키지 내에서 default, protected 접근
  - 여러 클래스 정의와 접근 방법
- `other_package`: 다른 패키지에서의 접근 테스트
  - public만 접근 가능
  - protected는 상속 관계에서만 접근 가능

### 3. 실전 예제 (`ex` 패키지)
- `Counter`: 접근 제어로 안전한 카운터 만들기
- `Item`: 상품 정보 클래스
- `ShoppingCart`: 장바구니 시스템

## 🎯 주요 학습 포인트

### 1. 접근 제어자의 종류와 범위
| 접근 제어자 | 같은 클래스 | 같은 패키지 | 자식 클래스 | 전체 |
|------------|------------|------------|------------|------|
| private    | ⭕         | ❌         | ❌         | ❌   |
| default    | ⭕         | ⭕         | ❌         | ❌   |
| protected  | ⭕         | ⭕         | ⭕         | ❌   |
| public     | ⭕         | ⭕         | ⭕         | ⭕   |

### 2. 패키지 별 테스트 예제
1. `same_package` 테스트
```java
// same_package/PublicClass.java
public class PublicClass {
    public static void main(String[] args) {
        DefaultClass1 class1 = new DefaultClass1();    // ⭕ 같은 패키지라서 가능
        DefaultClass2 class2 = new DefaultClass2();    // ⭕ 같은 패키지라서 가능
    }
}

// 같은 파일에 default 클래스 정의 가능
class DefaultClass1 { }
class DefaultClass2 { }
```

2. `other_package` 테스트
```java
// other_package/AccessTest.java
import same_package.PublicClass;    // ⭕ public 클래스는 임포트 가능
import same_package.DefaultClass1;  // ❌ default 클래스는 다른 패키지에서 접근 불가
```

### 3. 실제 활용 예시
1. `private` - 데이터 보호
   - 계좌 잔액 (BankAccount의 balance)
   - 스피커 볼륨 상태 (Speaker의 volume)

2. `default` - 같은 패키지 내 기능
   - 내부 구현 클래스
   - 헬퍼 메서드

3. `protected` - 상속 관계 활용
   - 자식 클래스에서 접근 필요한 메서드
   - 확장 가능한 기능들

4. `public` - 외부 공개 기능
   - 계좌 입출금 메서드
   - 스피커 볼륨 조절 메서드

### 4. 주의사항
- `public` 클래스는 반드시 파일명과 같아야 함
- 한 파일에 `public` 클래스는 하나만 가능
- 클래스 레벨에서는 `public`과 `default`만 사용 가능

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

