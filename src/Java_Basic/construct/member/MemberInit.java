// TIL : 생성자

package Java_Basic.construct.member;

public class MemberInit {
    private String name;
    private int age;
    private int grade;

    /**
     * 멤버 변수 초기화를 위한 메서드
     * @param name 이름
     * @param age 나이
     * @param grade 성적
     */
    public void initMember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Getter 메서드
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGrade() {
        return grade;
    }
}
