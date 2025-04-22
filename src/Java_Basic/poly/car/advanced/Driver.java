package Java_Basic.poly.car.advanced;

/**
 * 운전자 클래스
 * 다형성을 활용하여 여러 종류의 자동차를 운전할 수 있음
 */
public class Driver {

    private Car car;

    public void setCar(Car car) {
        System.out.println("자동차를 설정합니다: " + car);
        this.car = car;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다.");
        car.startEngine();
        car.pressAccelerator();
        car.endEngine();
    }
}
