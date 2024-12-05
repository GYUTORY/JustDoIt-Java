// #ENUM #ENUM메서드

/*
values() : 모든 ENUM 상수를 포함하는 배열을 반환한다.
valueOf(String name) : 주어진 이름과 일치하는 ENUM 상수를 반환한다.
name() : ENUM상수의 이름을 문자열로 반환한다.

ordinal() : ENUM 상수의 선언 순서(0부터 시작)를 반환한다.
-> 가급적 사용하지 않는 것이 좋다.
-> 이 값을 사용하다가 중간에 상수를 선언하는 위치가 변경되면 전체 상수의 위치가 변경될 수 있기 때문이다.

toString() : ENUM 상수의 이름을 문자열로 반환한다. name() 메서드와 유사하지만, toString()은 직접 오버라이드 할 수 있다.


열거형 정리
- 열거형은 java.lang.Enum를 자동(강제)으로 상속 받는다.
- 열거형은 이미 java.lang.Enum을 상속받았기 때문에 추가로 다른 클래스를 상속을 받을 수 없다.
- 열거형은 인터페이스를 구현할 수 있다.
- 열거형에 추상 메서드를 선언하고 구현할 수 있다.
    -> 이 경우 익명 클래스와 같은 방식을 사용한다.
* */
package Java_Mid.enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {

    public static void main(String[] args) {

        // 모든 ENUM 반환
        Grade[] values = Grade.values();
        System.out.println("values = " + Arrays.toString(values));
        for (Grade value : values) {
            System.out.println("name = " + value.name() + ", ordinal=" + value.ordinal());
        }

        // String -> ENUM 변환, 잘못된 문자 -> IllegalArgumentException 발생
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold);

    }
}
