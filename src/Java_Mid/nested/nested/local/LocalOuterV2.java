// #지역클래스

/**
지역 클래스의 접근 범위
 1.자신의 인스턴스 변수인 value에 접근할 수 있다.
 2. 자신이 속한 코드 블럭의 지역 변수인 localVar에 접근할 수 있다.
 3. 자신이 속한 코드 블럭의 매개변수인 paramVer에 접근할 수 있다. 참고로 매개변수도 지역 변수의 한 종류이다.
 4. 바깥 클래스의 인스턴스 멤버인 outInstanceVar에 접근할 수 있따. (지역 클래스도 내부 클래스의 한 종류이다.)

 -> 지역 클래스는 지역 변수 처럼 접근 제어자를 사용할 수 없다.(멤버변수만 가능)
 */

package Java_Mid.nested.nested.local;

public class LocalOuterV2 {

    private int outInstanceVar = 3;

    public void process(int paramVar) {
        int localVar = 1;

        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar=" + paramVar);
                System.out.println("outInstanceVar=" + outInstanceVar);
            }

        }

        LocalPrinter printer = new LocalPrinter();
        printer.print();
    }

    public static void main(String[] args) {
        LocalOuterV2 localOuter = new LocalOuterV2();
        localOuter.process(2);
    }
}
