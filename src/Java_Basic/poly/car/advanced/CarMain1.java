package Java_Basic.poly.car.advanced;

/**
 * 고급 자동차 운전 예제
 * 다형성과 추상화를 활용하여 새로운 자동차 추가가 용이한 구조
 */
public class CarMain1 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        
        // K3 자동차 운전
        Car k3Car = new K3Car();
        driver.setCar(k3Car);
        driver.drive();
        
        // Model3 자동차 운전
        Car model3Car = new Model3Car();
        driver.setCar(model3Car);
        driver.drive();
        
        // 새로운 자동차 운전
        Car newCar = new NewCar();
        driver.setCar(newCar);
        driver.drive();
    }
}
