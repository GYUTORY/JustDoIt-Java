package Java_Basic.poly.car.basic;

/**
 * 운전자 클래스
 * 다형성을 활용하여 여러 종류의 자동차를 운전할 수 있음
 */
public class Driver {
    private Car car;
    
    public void drive(Car car) {
        System.out.println("자동차 운전을 시작합니다.");
        car.startEngine();
        car.pressAccelerator();
        car.endEngine();
        System.out.println("자동차 운전을 종료합니다.\n");
    }
}
