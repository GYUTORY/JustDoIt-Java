package Java_Basic.oop.inherit;

/**
 * 상속(Inheritance) 예제 - 상속 클래스
 */
public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("멍멍!");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("품종: " + breed);
    }

    public void fetch() {
        System.out.println(name + "이(가) 공을 가져옵니다.");
    }
} 