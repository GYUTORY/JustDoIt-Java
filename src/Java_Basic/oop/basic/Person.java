package Java_Basic.oop.basic;

/**
 * 기본 클래스 예제
 */
public class Person {
    // 필드 (멤버 변수)
    private String name;
    private int age;

    // 생성자
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 메서드
    public void introduce() {
        System.out.println("안녕하세요! 저는 " + name + "이고, " + age + "살입니다.");
    }

    // Getter와 Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Person person = new Person("홍길동", 25);
        person.introduce();
        
        person.setAge(26);
        System.out.println(person.getName() + "의 나이가 " + person.getAge() + "살로 변경되었습니다.");
    }
} 