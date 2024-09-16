// TIL - 상속과 메서드 오버라이딩

package extends1.overriding;

public class ElectricCar extends Car {

    // @Override 어노테이션은 옵션이지만, 실수를 방지해주는 역할을 한다.
    // -> 정확하게 오버라이딩 하였는지 검사하는 역할이다.
    @Override
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge() {
        System.out.println("충전합니다.");
    }

}
