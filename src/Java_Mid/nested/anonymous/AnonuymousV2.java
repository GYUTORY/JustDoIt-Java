// #익명클래스

/**
익명 클래스 특징
 1. 익명 클래스는 이름 없는 지역 클래스를 선언하면서 동시에 생성한다.
 2. 익명 클래스는 부모 클래스를 상속 받거나, 또는 인터페이스를 구현해야 한다. 익명 클래스를 사용할 때는 상위 클래스나 인터페이스가 필요하다.
 3. 익명 클래스는 말 그대로 이름이 없다. 이름을 가지지 않으므로, 생성자를 가질 수 없다. (기본 생성자만 사용됨)
 4. 익명 클래스는 AnnoymousOuter$1과 같이 자바 내부에서 바깥 클래스 이름 + $ + 숫자로 정의 된다. 익명 클래스가 여러개면 $1, $2, $3으로 숫자가 증가하면서 구분된다.

 익명 클래스의 장점
 - 익명 클래스를 사용하면 클래스를 별도로 정의하지 않고도 인터페이스나 추상 클래스를 즉석에서 구현할 수 있어 코드가 더 간결해진다.
 하지만, 복잡하거나 재사용이 필요한 경우에는 별도의 클래스를 정의하는 것이 좋다.
 */

package Java_Mid.nested.anonymous;

import Java_Mid.nested.nested.local.Printer;

public class AnonuymousV2 {

    private int outInstanceVar = 3;

    public void process(int paramVar) {
        int localVar = 1;

        // 인터페이스를 생성하는 것이 아니고, Printer라는 이름의 인터페이스를 구현한 익명 클래스를 생성하는 것이다.
        // {body} 부분에 Printer 인터페이스를 구현한 코드를 작성하면 된다. -> 이 부분이 바로 익명 클래스의 본문이 된다.
        // 쉽게 이야기해서, Printer를 상속(구현)하면서 바로 생성하는 것이다.
        Printer printer = new Printer() {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        };

        printer.print();
        System.out.println("printer.class=" + printer.getClass());
    }

    public static void main(String[] args) {
        AnonuymousV2 localOuter = new AnonuymousV2();
        localOuter.process(2);
    }
}
