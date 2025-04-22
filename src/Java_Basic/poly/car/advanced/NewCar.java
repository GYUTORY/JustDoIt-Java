package Java_Basic.poly.car.advanced;

/**
 * 새로운 자동차 구현체
 */
public class NewCar implements Car {
    @Override
    public void startEngine() {
        System.out.println("NewCar.startEngine");
    }

    @Override
    public void endEngine() {
        System.out.println("NewCar.endEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("NewCar.pressAccelerator");
    }
}
