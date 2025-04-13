// TIL - final 변수와 상수 2

package Java_Basic._final.constant;

/**
 * 상수를 사용하여 매직 넘버 문제를 해결하는 예제
 * 
 * 상수 사용의 장점:
 * 1. 의미가 명확함 - 상수 이름으로 값의 의미를 이해할 수 있음
 * 2. 유지보수가 용이함 - 값 변경 시 한 곳만 수정하면 됨
 * 3. 실수 방지 - 컴파일러가 값의 변경을 막아줌
 * 4. 코드의 가독성 향상 - 상수 이름으로 의도를 명확히 전달
 */
public class ConstantMain2 {

    // 이 코드에는 다음과 같은 문제가 있다.
    // ==> 만약 프로그램 최대 참여자 수를 현재 1000명에서 2000명으로 변경해야 하면 2곳의 변경 포인트가 발생한다.
    // ---> 만약 애플리케이션의 100곳에서 이 숫자를 사용했다면 100곳을 모두 변경해야 한다.
    // 매직 넘버 문제가 발생했다. 숫자 `1000` 이라는 것이 무슨 뜻일까? 이 값만 보고 이해하기 어렵다.
    public static void main(String[] args) {
        // Constant 클래스의 상수를 사용
        // 장점: 값의 의미가 명확하고, 변경이 필요할 때 한 곳만 수정하면 됨
        System.out.println("프로그램 최대 참여자 수 " + Constant.MAX_USERS);
        
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }

    /**
     * 사용자 수를 처리하는 메서드
     * 
     * @param currentUserCount 현재 사용자 수
     * 
     * 상수 사용의 장점:
     * 1. MAX_USERS라는 이름으로 값의 의미를 명확히 전달
     * 2. 값 변경 시 Constant 클래스만 수정하면 됨
     * 3. final 키워드로 인해 실수로 값이 변경되는 것을 방지
     * 4. 코드의 의도를 쉽게 이해할 수 있음
     */
    private static void process(int currentUserCount) {
        System.out.println("참여자 수:" + currentUserCount);
        if (currentUserCount > Constant.MAX_USERS) {  // 상수 사용
            System.out.println("대기자로 등록합니다.");
        } else {
            System.out.println("게임에 참가합니다.");
        }
    }

}
