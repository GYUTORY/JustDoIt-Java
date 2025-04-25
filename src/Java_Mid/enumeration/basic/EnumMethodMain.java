package Java_Mid.enumeration.basic;

/**
 * 열거형의 기본 메서드 사용 예제
 */
public class EnumMethodMain {
    public static void main(String[] args) {
        // values() 메서드 사용 예제
        System.out.println("=== 모든 등급 출력 ===");
        Grade[] grades = Grade.values();
        for (Grade grade : grades) {
            System.out.printf("%s (점수: %d, 설명: %s)%n",
                grade.name(),
                grade.getScore(),
                grade.getDescription());
        }

        // valueOf() 메서드 사용 예제
        System.out.println("\n=== 문자열로 열거형 상수 찾기 ===");
        String gradeName = "A";
        Grade grade = Grade.valueOf(gradeName);
        System.out.printf("%s 등급 정보 - 점수: %d, 설명: %s%n",
            grade.name(),
            grade.getScore(),
            grade.getDescription());

        // ordinal() 메서드 사용 예제
        System.out.println("\n=== 열거형 상수의 순서 ===");
        for (Grade g : Grade.values()) {
            System.out.printf("%s의 순서: %d%n",
                g.name(),
                g.ordinal());
        }
    }
} 