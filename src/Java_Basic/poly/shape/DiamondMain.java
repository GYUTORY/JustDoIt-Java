package Java_Basic.poly.shape;

/**
 * 다이아몬드 문제 예제
 * 인터페이스 다중 상속 시 발생할 수 있는 문제와 해결 방법을 보여줌
 */
public class DiamondMain {
    public static void main(String[] args) {
        Child child = new Child();
        
        // InterfaceA의 메서드 호출
        child.methodA();
        
        // InterfaceB의 메서드 호출
        child.methodB();
        
        // 공통 메서드 호출
        child.methodCommon();
    }
}
