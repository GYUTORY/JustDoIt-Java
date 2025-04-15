package Java_Basic._abstract.ex;

/**
 * 추상 클래스 Animal
 * - 추상 메서드를 포함하는 클래스
 * - 인스턴스화할 수 없음
 * - 하위 클래스에서 구현해야 하는 메서드를 정의
 */
public abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 추상 메서드: 하위 클래스에서 반드시 구현해야 함
    public abstract void makeSound();

    // 일반 메서드: 하위 클래스에서 오버라이드 가능
    public void move() {
        System.out.println(name + "이(가) 움직입니다.");
    }

    // 일반 메서드: 하위 클래스에서 오버라이드 가능
    public void eat() {
        System.out.println(name + "이(가) 먹이를 먹습니다.");
    }

    // getter와 setter
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
        this.age = age;
    }
} 