package Java_Basic.oop.inherit;

/**
 * 상속(Inheritance) 예제 - 기본 클래스
 */
public class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("동물이 소리를 냅니다.");
    }

    public void showInfo() {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
    }
} 