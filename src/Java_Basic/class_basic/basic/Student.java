package Java_Basic.class_basic.basic;

/**
 * 학생 정보를 관리하는 기본 클래스
 * 캡슐화와 접근 제어를 보여주는 예제
 */
public class Student {
    // 필드 (private으로 정보 은닉)
    private String name;
    private int age;
    private int score;
    
    // 생성자
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // 점수 설정 메서드 (유효성 검사 포함)
    public void setScore(int score) {
        if (score >= 0 && score <= 100) {
            this.score = score;
        } else {
            System.out.println("유효하지 않은 점수입니다. (0-100)");
        }
    }
    
    // getter 메서드들
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public int getScore() {
        return score;
    }
    
    // 학점 계산 메서드
    public String getGrade() {
        if (score >= 90) return "A";
        if (score >= 80) return "B";
        if (score >= 70) return "C";
        return "D";
    }
    
    // 학생 정보 출력 메서드
    public void printInfo() {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("점수: " + score);
        System.out.println("학점: " + getGrade());
    }
}
