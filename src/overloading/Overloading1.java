package overloading;

/***
 * 메서드 오버로딩
 * 다음과 같은 메서드를 만들고 싶다.
 * 1. 두 수를 더하는 메서드
 * 2. 세 수를 더하는 메서드
 * 이 경우 둘다 더하는 메서드이기 때문에 가급적 같은 이름인 `add` 를 사용하고 싶다.
 * -> 자바는 메서드의 이름 뿐만 아니라 매개변수 정보를 함께 사용해서 메서드를 구분한다. 따라서 다음과 같이 이름이 같고, 매개변수가 다른 메서드를 정의할 수 있다.
***/

/***
 **오버로딩 성공**
 add(int a, int b)
 add(int a, int b, int c)
 add(double a, double b)

 이렇게 이름이 같고 매개변수가 다른 메서드를 여러개 정의하는 것을 메서드 오버로딩(Overloading)이라 한다.
 -> 오버로딩은 번역하면 과적인데, 과하게 물건을 담았다는 뜻이다. 따라서 같은 이름의 메서드를 여러개 정의했다고 이해 하면 된다.

 **오버로딩 규칙**
 메서드의 이름이 같아도 매개변수의 타입 및 순서가 다르면 오버로딩을 할 수 있다. 참고로 반환 타입은 인정하지 않는 다.

 다음 케이스는 메서드 이름과 매개변수의 타입이 같으므로 컴파일 오류가 발생한다. 반환 타입은 인정하지 않는다.

 **오버로딩 실패**
 int add(int a, int b)
 double add(int a, int b)

 ***/

public class Overloading1 {
    public static void main(String[] args) {
        System.out.println("1: " + add(1, 2));
        System.out.println("2: " + add(1, 2, 3));
    }
// 첫 번째 add 메서드: 두 정수를 받아서 합을 반환한다.

    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }

    // 두 번째 add 메서드: 세 정수를 받아서 합을 반환한다. // 첫 번째 메서드와 이름은 같지만, 매개변수 목록이 다르다.
    public static int add(int a, int b, int c) {
        System.out.println("2번 호출");
        return a + b + c;
    }
}
