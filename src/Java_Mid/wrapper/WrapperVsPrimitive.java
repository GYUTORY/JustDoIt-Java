// #기본형과 래퍼클래스의 성능비교

/*
유지보수 vs 최적화
- 유지보수 vs 최적화를 고려해야 하는 상황이라며느 유지보수하기 좋은 코드를 먼저 고민해야 한다.
- 특히 최신 컴퓨터는 매우 빠르기 때문에 메모리 사엥서 발생하는 연산을 몇 번 줄인다고 해도 실질적인 도움이 되지 않는 경우가 많다.

즉, 자바 메모리 내부에서 발생하는 연산을 수천번에서 한 번으로 줄이는 것 보다, 네트워크 호출 한 번을 더 줄익는 것이 더 효과적인 경우가 많다.
-> 권장하는 방법은, 개발 이후에 성능 테스트를 해보고 정말 문제가 되는 부분을 찾아서 최적화 하는 것이다.
*/

package Java_Mid.wrapper;

public class WrapperVsPrimitive {

    public static void main(String[] args) {
        int iterations = 1_000_000_000; // 반복 횟수 설정, 10억
        long startTime, endTime;

        // 기본형 long 사용
        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumPrimitive += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumPrimitive = " + sumPrimitive);
        System.out.println("기본 자료형 long 실행 시간: " + (endTime - startTime) + "ms");

        // 래퍼 클래스 Long 사용
        // 기본형 long 사용
        Long sumWrapper = 0L;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumWrapper += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumPrimitive = " + sumWrapper);
        System.out.println("래퍼 클래스 Long 실행 시간: " + (endTime - startTime) + "ms");

        // int는 보통 4바이트의 메모리를 사용
        // 래퍼 클래스 인스턴스는 필요한 객체 메타데이터를 포함하므로 더 많은 메모리를 사용한다.
        // 자바 버전과 시스템마다 다르지만 대략 8~16바이트의 메모리를 추가로 사용한다.
    }
}
