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

import java.lang.reflect.Field;

public class LocalOuterV4 {

    private int outInstanceVar = 3;

    public Printer process(int paramVar) {
        int localVar = 1; // 지역 변수는 스택 프레임이 종료되는 순간 함꼐 제거된다.

        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);

                // 인스턴스는 지역 변수보다 더 오래 살아 남는다.
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar=" + paramVar);
                System.out.println("outInstanceVar=" + outInstanceVar);
            }

        }

        LocalPrinter printer = new LocalPrinter();
        // printer.print();를 여기서 실행하지 않고 Printer 인스턴스만 반환한다.
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV4 localOuter = new LocalOuterV4();
        Printer printer = localOuter.process(2);
        //printer.print()를 나중에 실행한다. process()의 스택 프레임이 사라진 이후에 실행
        printer.print();

        //추가
        System.out.println("필드 확인");
        Field fields[] = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }
    }
}
