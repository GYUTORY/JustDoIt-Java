// TIL : 클래스와 메서드

package oop1;

public class ValueData {
    int value;

    // 데이터인 value와 해당 데이터를 사용하는 기능인 add() 메서드를 함께 정의
    void add() {
        value++;
        System.out.println("숫자 증가=" + value);
    }
}
