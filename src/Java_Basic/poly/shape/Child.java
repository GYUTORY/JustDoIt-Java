package Java_Basic.poly.shape;

/**
 * InterfaceA와 InterfaceB를 모두 구현하는 클래스
 * 다이아몬드 문제 해결을 보여주는 예제
 */
public class Child implements InterfaceA, InterfaceB {
    @Override
    public void methodA() {
        System.out.println("Child.methodA() 실행");
    }

    @Override
    public void methodB() {
        System.out.println("Child.methodB() 실행");
    }

    @Override
    public void methodCommon() {
        System.out.println("Child.methodCommon() 실행");
    }
}
