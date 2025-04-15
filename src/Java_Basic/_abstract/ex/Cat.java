package Java_Basic._abstract.ex;

/**
 * Cat 클래스
 * - Animal 추상 클래스를 상속받는 구체 클래스
 * - 추상 메서드 makeSound()를 반드시 구현해야 함
 */
public class Cat extends Animal {
    private boolean isIndoor; // 실내/실외 고양이 여부

    public Cat(String name, int age, boolean isIndoor) {
        super(name, age);
        this.isIndoor = isIndoor;
    }

    // 추상 메서드 구현
    @Override
    public void makeSound() {
        System.out.println(name + "이(가) 야옹!");
    }

    // 부모 클래스의 메서드 오버라이드
    @Override
    public void move() {
        System.out.println(name + "이(가) 조용히 걸어다닙니다.");
    }

    // Cat 클래스만의 고유한 메서드
    public void climb() {
        System.out.println(name + "이(가) 높은 곳으로 올라갑니다.");
    }

    // getter와 setter
    public boolean isIndoor() {
        return isIndoor;
    }

    public void setIndoor(boolean indoor) {
        isIndoor = indoor;
    }
} 