package extends1.ex2;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();




        // `electricCar.move()` 를 호출하면 먼저 `x001` 참조로 이동한다.
        // 내부에는 `Car` , `ElectricCar` 두가지 타입이 있다. 이때 호출하는 변수인 `electricCar` 의 타입이 `ElectricCar` 이므로 이 타입을 선택한다.
        // 그런데 `ElectricCar` 에는 `move()` 메서드가 없다.
        // 상속 관계에서는 자식 타입에 해당 기능이 없으면 부모 타입으로 올라가서 찾는다.
        // 이 경우 `ElectricCar` 의 부모인 `Car` 로 올라가서 `move()` 를 찾는다. 부모인 `Car` 에 `move()` 가 있으므로 부모에 있는 `move()` 메서드를 호출한다.
        electricCar.move();



        // `electricCar.charge()` 를 호출하면 참조값을 확인해서 `x001.charge()` 를 호출한다.
        // 따라서 `x001` 을 찾아서 `charge()` 를 호출하면 되는 것이다.

        // 그런데 상속 관계의 경우에는 내부에 부모와 자식이 모두 존재한다. 이때 부모인 `Car` 를 통해서 `charge()` 를 찾을지 아니면 `ElectricCar` 를 통해서 `charge()` 를 찾을지 선택해야 한다.
        //이때는 **호출하는 변수의 타입(클래스)을 기준으로 선택**한다. `electricCar` 변수의 타입이 `ElectricCar` 이므로 인스턴스 내부에 같은 타입인 `ElectricCar` 를 통해서 `charge()` 를 호출한다.
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();

    }

}
