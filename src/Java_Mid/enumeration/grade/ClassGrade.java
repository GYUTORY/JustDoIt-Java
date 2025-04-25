package Java_Mid.enumeration.grade;

/**
 * 열거형을 사용한 성적 처리 클래스
 */
public class ClassGrade {
    private final String studentName;
    private final Grade grade;

    public ClassGrade(String studentName, int score) {
        this.studentName = studentName;
        this.grade = Grade.fromScore(score);
    }

    public String getStudentName() {
        return studentName;
    }

    public Grade getGrade() {
        return grade;
    }

    public void printGradeInfo() {
        System.out.printf("학생: %s, 등급: %s (%s)%n", 
            studentName, 
            grade, 
            grade.getDescription());
    }
}
