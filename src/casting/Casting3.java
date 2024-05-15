package casting;

// Casting과 OverFlow

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; //int 최고값
        long maxIntOver = 2147483648L; //int 최고값 + 1(초과)
        int intValue = 0;

        intValue = (int) maxIntValue; //형변환
        System.out.println("maxIntValue casting=" + intValue); //출력:2147483647

        /**
         * 결과를 보면 `-2147483648` 이라는 전혀 다른 숫자가 보인다. `int` 형은 `2147483648L` 를 표현할 수 있는 방 법이 없다. 이렇게 기존 범위를 초과해서 표현하게 되면 전혀 다른 숫자가 표현되는데, 이런 현상을 오버플로우라 한다.
         * 보통 오버플로우가 발생하면 마치 시계가 한바퀴 돈 것 처럼 다시 처음부터 시작한다.
         * --> 참고로 `-2147483648` 숫자는 `int` 의 가장 작은 숫자이다.
         * 중요한 것은 오버플로우가 발생하는 것 자체가 문제라는 점이다! 오버플로우가 발생했을 때 결과가 어떻게 되는지 계산하는데 시간을 낭비하면 안된다! 오버플로우 자체가 발생하지 않도록 막아야 한다. 이 경우 단순히 대입하는 변수(`intValue` )의타입을 `int` `long` 으로변경해서사이즈를늘리면오버플로우문제가해결된다.
         */
        intValue = (int) maxIntOver; //형변환
        System.out.println("maxIntOver casting=" + intValue); //출력:-2147483648
    }
}
