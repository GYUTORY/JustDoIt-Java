package Java_Basic._abstract.ex;

/**
 * Dog 클래스
 * - Animal 추상 클래스를 상속받는 구체 클래스
 * - 추상 메서드 makeSound()를 반드시 구현해야 함
 */
public class Dog extends Animal {
    private String breed; // 품종

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    // 추상 메서드 구현
    @Override
    public void makeSound() {
        System.out.println(name + "이(가) 멍멍!");
    }

    // 부모 클래스의 메서드 오버라이드
    @Override
    public void move() {
        System.out.println(name + "이(가) 뛰어다닙니다.");
    }

    // Dog 클래스만의 고유한 메서드
    public void fetch() {
        System.out.println(name + "이(가) 공을 가져옵니다.");
    }

    // getter와 setter
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
} 