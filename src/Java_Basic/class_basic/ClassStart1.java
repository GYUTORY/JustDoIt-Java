package Java_Basic.class_basic;

/**
 * 클래스의 기본 구조를 설명하는 예제
 * 이 예제는 클래스를 사용하지 않고 변수만으로 데이터를 관리하는 방식으로,
 * 이는 객체지향 프로그래밍의 장점을 활용하지 못하는 예시입니다.
 */
public class ClassStart1 {
    /**
     * Java 프로그램의 시작점이 되는 main 메서드
     * public: 어디서든 접근 가능
     * static: 객체 생성 없이 실행 가능
     * void: 반환값이 없음
     * String[] args: 커맨드 라인 인자를 받는 매개변수
     */
    public static void main(String[] args) {
        // 학생1의 정보를 저장하는 변수들
        String student1Name = "학생1";    // 문자열 타입의 변수 선언 및 초기화
        int student1Age = 15;            // 정수형 변수 선언 및 초기화
        int student1Grade = 90;          // 정수형 변수 선언 및 초기화

        // 학생2의 정보를 저장하는 변수들
        String student2Name = "학생2";    // 문자열 타입의 변수 선언 및 초기화
        int student2Age = 16;            // 정수형 변수 선언 및 초기화
        int student2Grade = 80;          // 정수형 변수 선언 및 초기화

        // 각 학생의 정보를 출력
        System.out.println("이름:" + student1Name + " 나이:" + student1Age + " 성적:" + student1Grade);
        System.out.println("이름:" + student2Name + " 나이:" + student2Age + " 성적:" + student2Grade);
    }
}