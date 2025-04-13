// TIL - final 변수와 상수 2

package Java_Basic._final.constant;

/**
 * 매직 넘버(Magic Number) 사용의 문제점을 보여주는 예제
 * 
 * 매직 넘버의 문제점:
 * 1. 의미가 불명확함 - 숫자만으로는 그 값이 무엇을 의미하는지 알기 어려움
 * 2. 유지보수의 어려움 - 값을 변경할 때 모든 사용 위치를 찾아 수정해야 함
 * 3. 실수로 인한 버그 발생 가능성 - 잘못된 값을 입력할 가능성이 높음
 * 4. 코드의 가독성 저하 - 숫자의 의미를 파악하기 위해 주석이 필요함
 */
public class ConstantMain1 {

    public static void main(String[] args) {
        // 매직 넘버 1000을 직접 사용
        // 문제점: 이 숫자가 무엇을 의미하는지 코드만 보고는 알 수 없음
        System.out.println("프로그램 최대 참여자 수 " + 1000);
        
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
     * 매직 넘버 사용의 문제점:
     * 1. 값의 의미가 불명확함 (1000이 무엇을 의미하는지?)
     * 2. 값 변경 시 모든 사용 위치를 수정해야 함
     * 3. 실수로 잘못된 값을 입력할 가능성이 있음
     * 4. 코드의 의도를 이해하기 어려움
     */
    private static void process(int currentUserCount) {
        System.out.println("참여자 수:" + currentUserCount);
        if (currentUserCount > 1000) {  // 매직 넘버 사용
            System.out.println("대기자로 등록합니다.");
        } else {
            System.out.println("게임에 참가합니다.");
        }
    }

}
