// TIL - final 변수와 상수 2

package final1;

public class ConstantMain1 {

    public static void main(String[] args) {
        // 1000 --> 나를 놀라게 하는 숫자를 매직 넘버라고 한다.
        System.out.println("프로그램 최대 참여자 수 " + 1000);
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }


    private static void process(int currentUserCount) {
        System.out.println("참여자 수:" + currentUserCount);
        // 이 코드에는 다음과 같은 문제가 있다.
        // ==> 만약 프로그램 최대 참여자 수를 현재 1000명에서 2000명으로 변경해야 하면 2곳의 변경 포인트가 발생한다.
        // ---> 만약 애플리케이션의 100곳에서 이 숫자를 사용했다면 100곳을 모두 변경해야 한다.
        // 매직 넘버 문제가 발생했다. 숫자 `1000` 이라는 것이 무슨 뜻일까? 이 값만 보고 이해하기 어렵다.
        if (currentUserCount > 1000) {
            System.out.println("대기자로 등록합니다.");
        } else {
            System.out.println("게임에 참가합니다.");
        }
    }

}
