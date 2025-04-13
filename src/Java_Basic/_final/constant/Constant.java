// TIL - final 변수와 상수 2

package Java_Basic._final.constant;

/**
 * Java에서 상수(Constant)를 정의하는 클래스
 * 
 * 상수의 특징:
 * 1. static final 키워드를 사용하여 정의
 * 2. 대문자와 언더스코어(_)를 사용하여 명명 (Java 네이밍 컨벤션)
 * 3. 한 번 초기화되면 값을 변경할 수 없음
 * 4. 프로그램 전체에서 공유되는 불변 값
 * 
 * 상수를 사용하는 이유:
 * 1. 매직 넘버(의미가 불명확한 숫자) 제거
 * 2. 코드의 가독성과 유지보수성 향상
 * 3. 값의 중앙 집중화 관리
 * 4. 실수로 인한 값 변경 방지
 */
public class Constant {
    /**
     * 수학 관련 상수
     * PI: 원주율 (3.14)
     */
    public static final double PI = 3.14;

    /**
     * 시간 관련 상수
     * HOURS_IN_DAY: 하루의 시간 수
     * MINUTES_IN_HOUR: 한 시간의 분 수
     * SECONDS_IN_MINUTE: 1분의 초 수
     */
    public static final int HOURS_IN_DAY = 24;
    public static final int MINUTES_IN_HOUR = 60;
    public static final int SECONDS_IN_MINUTE = 60;

    /**
     * 애플리케이션 설정 관련 상수
     * MAX_USERS: 최대 사용자 수 제한
     */
    public static final int MAX_USERS = 1000;
}
