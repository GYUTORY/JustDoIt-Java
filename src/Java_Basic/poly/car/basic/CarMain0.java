package Java_Basic.poly.car.basic;

/**
 * 기본적인 자동차 운전 예제
 */
public class CarMain0 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        
        // K3 자동차 운전
        K3Car k3Car = new K3Car();
        driver.drive(k3Car);
        
        // Model3 자동차 운전
        Model3Car model3Car = new Model3Car();
        driver.drive(model3Car);
    }
}
