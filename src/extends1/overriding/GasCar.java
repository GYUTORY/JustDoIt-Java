// TIL - 상속과 메서드 오버라이딩

package extends1.overriding;

// 자식클래스(GasCar)와 부모클래스(Car)까지 모두 인스터런스를 생성한다.
// -> 참조값은 하나지이지만, 실제로 그 안에서는 Car, GasCar라는 두가지 클래스 정보가 공존하는 것이다.
public class GasCar extends Car {

    public void fillUp() {
        System.out.println("기름을 주유합니다.");
    }

}
