package Java_Basic.poly.car.advanced;

/**
 * Model3 자동차 구현체
 */
public class Model3Car implements Car {

    @Override
    public void startEngine() {
        System.out.println("Model3Car.startEngine");
    }

    @Override
    public void endEngine() {
        System.out.println("Model3Car.endEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("Model3Car.pressAccelerator");
    }


}
