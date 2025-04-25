package Java_Mid.enumeration.grade;

/**
 * Grade 열거형과 ClassGrade 클래스의 사용을 보여주는 메인 클래스
 */
public class GradeMain {
    public static void main(String[] args) {
        // 다양한 점수로 ClassGrade 인스턴스 생성
        ClassGrade student1 = new ClassGrade("김자바", 95);
        ClassGrade student2 = new ClassGrade("이파이", 85);
        ClassGrade student3 = new ClassGrade("박씨샵", 75);
        ClassGrade student4 = new ClassGrade("최루비", 65);
        ClassGrade student5 = new ClassGrade("정파톤", 55);

        // 각 학생의 성적 정보 출력
        student1.printGradeInfo();
        student2.printGradeInfo();
        student3.printGradeInfo();
        student4.printGradeInfo();
        student5.printGradeInfo();

        System.out.println("\n=== Grade 열거형 직접 사용 예시 ===");
        // Grade 열거형 직접 사용
        int score = 88;
        Grade grade = Grade.fromScore(score);
        System.out.printf("점수 %d점은 %s등급이며, 평가는 '%s'입니다.%n", 
            score, grade, grade.getDescription());
    }
} 