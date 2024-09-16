// TIL - 상속과 메서드 오버라이딩

package extends1.overriding;

// 특징 : 부모클래스는, 자식클래스가 누구 있는지 모른다.
public class Car {

    public void move() {
        System.out.println("차를 이동합니다.");
    }

    public void openDoor() {
        System.out.println("문을 엽니다.");
    }
}
