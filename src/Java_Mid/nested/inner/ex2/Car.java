// #내부클래스 #ex1 리팩토링

package Java_Mid.nested.inner.ex2;

// 엔진에 필요한 메서드들을 제공해야 한다.
// getModel(), getChargeLevel()은 엔진에서만 사용하고, 다른 곳에서는 사용하지 않는다.
public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.chargeLevel = chargeLevel;
        this.model = model;
        this.engine = new Engine();
    }


    public void start() {
        engine.start();
        System.out.println(model + " 시작 완료");
    }

    private class Engine {
        public void start() {
            // 내부 클래스는 바깥 클래스에 접근이 가능하다.
            System.out.println("충전 레벨 확인: " + chargeLevel);
            System.out.println(model + "의 엔진을 구동합니다.");
        }
    }

}
