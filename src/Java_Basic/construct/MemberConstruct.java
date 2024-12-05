package Java_Basic.construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 생성자 - 오버로딩과 this()
    MemberConstruct(String name, int age) {
        // this() 라는 기능을 사용하면 생성자 내부에서 자신의 생성자를 호출할 수 있다.
        // this는 인스턴스 자신의 참조값을 가리키기 때문에, 자신의 생성자를 호출한다고 생각하면 된다.
        // -> this()는 생성자 코드의 첫줄에만 작성할 수 있다.
        this(name, age, 50);
    }

    // 생성자는 메서드와 비슷하지만 다음과 같은 차이가 있다.
    // 1. 생성자의 이름은 클래스 이름과 같아야 한다. 따라서 첫 글자도 대문자로 시작한다.
    // 2. 생성자는 반환 타입이 없다. 비워두어야 한다.
    // 3. 나머지는 메서드와 같다.
    MemberConstruct(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        System.out.println("생성자 호출 name=" + name + ", age=" + age + ",grade=" + grade);
    }
}
