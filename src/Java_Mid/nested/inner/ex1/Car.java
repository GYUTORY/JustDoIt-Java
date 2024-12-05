package Java_Mid.nested.inner.ex1;

// 엔진에 필요한 메서드들을 제공해야 한다.
// getModel(), getChargeLevel()은 엔진에서만 사용하고, 다른 곳에서는 사용하지 않는다.
public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.chargeLevel = chargeLevel;
        this.model = model;
        this.engine = new Engine(this);
    }

    //Engine에서만 사용하는 메서드
    public String getModel() {
        return model;
    }

    //Engine에서만 사용하는 메서드
    public int getChargeLevel() {
        return chargeLevel;
    }


    public void start() {
        engine.start();
        System.out.println(model + " 시작 완료");
    }




}
