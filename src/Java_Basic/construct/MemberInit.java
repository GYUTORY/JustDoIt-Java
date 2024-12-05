// TIL : 생성자

package Java_Basic.construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    /**
     *  String name;
     *  int age;
     *  int grade;
     *
     *  this는 위의 멤버변수를 가리킨다.
     *  --> Member에 초기값 설정 기능을 제공하는 메서드이다.
     *
     *  --> 아래와 같이 메서드를 호출하면 객체의 멤버 변수에 인자로 넘어온 값을 채운다.
     *  member1.initMember("user1", 15,90)
     */
    void initMember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
