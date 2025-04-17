// TIL - 접근 제어자 사용 - 필드, 메서드

/***
- 순서대로 public, default, private 을 필드와 메서드에 사용했다.
- 마지막에 innerAccess() 가 있는데, 이 메서드는 내부 호출을 보여준다. 내부 호출은 자기 자신에게 접근하는 것이다.
- 따라서, private을 포함한 모든 곳에 접근할 수 있다.

 -> 참고로, 생성자도 접근 제어자 관점에서 메서드와 같다.

 */


package Java_Basic.access.same_package;

public class AccessData {

    public int publicField;
    int defaultField;
    private int privateField;

    public void publicMethod() {
        System.out.println("publicMethod 호출 " + publicField);
    }

    void defaultMethod() {
        System.out.println("defaultMethod 호출 " + defaultField);
    }

    private void privateMethod() {
        System.out.println("privateMethod 호출 " + privateField);
    }

    public void innerAccess() {
        System.out.println("내부 호출");
        publicField = 100;
        defaultField = 200;
        privateField = 300;
        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
