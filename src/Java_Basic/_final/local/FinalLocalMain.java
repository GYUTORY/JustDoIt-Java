// TIL - final 변수와 상수 1

package Java_Basic._final.local;

public class FinalLocalMain {
    public static void main(String[] args) {
        // final 지역 변수1
        final int data1;
        data1 = 10; // 최초 한번만 할당 가능
        // data1 = 20; // 컴파일 오류

        // final 지역 변수2
        final int data2 = 10;
        // data2 = 20; // 컴파일 오류

    }

    // 메서드 내부에서 값을 변경할 수 없다.
    // 메서드 호출 시점에 사용된 값이 끝까지 사용된다.
    static void method(final int parameter) {
        // parameter = 20; // 컴파일 오류
    }
}
