package lang.string.builder;

// 정리
/*
정리
- 문자열을 합칠 때 대부분의 경우 최적화가 되므로 + 연산을 사용하면 된다.

StringBuilder를 직접 사용하는 것이 더 좋은 경우
- 반복문에서 반복해서 문자를 연결할 때
- 조건문을 통해서 동적으로 문자열을 조합할 때
- 복잡한 문자열의 특정 부분을 변경해야 할 때
- 매우 긴 대용량 문자열을 다룰 때


참고: StringBuilder vs StringBuffer
- StringBuilder와 똑같은 기능을 수행하는 SringBuffer 클래스도 있다.
- StringBuffer는 내부에 동기화가 되어 있어서, 멀티스레드 상황에 안전하지만 동기화 오버헤드로 성능이 느리다.
- StringBuilder는 멀티 스레드 상황에 안전하지 않지만 동기화 오버헤드가 없으므로 속도가 빠르다.
* */

public class LoopStringBuilderMain {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 100000; i++) {
            sb.append("Hello Java ");
        }
        long endTime = System.currentTimeMillis();

        String result = sb.toString();
        System.out.println("result = " + result);
        System.out.println("time = " + (endTime - startTime) + "ms");
    }
}
