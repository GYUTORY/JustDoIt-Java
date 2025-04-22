package Java_Basic.poly.car.basic;

/**
 * K3 자동차 구현체
 */
public class K3Car implements Car {
    @Override
    public void startEngine() {
        System.out.println("K3Car.startEngine");
    }

    @Override
    public void endEngine() {
        System.out.println("K3Car.endEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("K3Car.pressAccelerator");
    }
}
