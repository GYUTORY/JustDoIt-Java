// TIL : 클래스와 메서드

/***
 정리
 1. 클래스는 속성(데이터, 멤버 변수)과 기능(메서드)을 정의할 수 있다.
 2. 객체는 자신의 메서드를 통해 자신의 멤버 변수에 접근할 수 있다.
  - 객체의 메서드 내부에서 접근하는 멤버 변수는 객체 자신의 멤버 변수이다.

 멤버 변수 : 이 변수들은 특정 클래스에 소속된 멤버이기 때문에 이렇게 부르낟.
 필드 : 데이터 항목을 가르키는 전통적인 용어이다. 데이터베이스, 엑셀 등에서 각각의 항목을 필드라 한다.
 --> 자바에서 멤버 변수, 필드는 같은 뜻이다. 클래스에 소속된 변수를 뜻한다.

 */
package oop1;

public class ValueObjectMain {
    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        valueData.add();
        valueData.add();
        valueData.add();
        System.out.println("최종 숫자=" + valueData.value);
    }
}
