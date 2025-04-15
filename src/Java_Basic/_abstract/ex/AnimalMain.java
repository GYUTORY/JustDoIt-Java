package Java_Basic._abstract.ex;

/**
 * AnimalMain 클래스
 * - Animal 추상 클래스의 구현 클래스들을 테스트
 */
public class AnimalMain {
    public static void main(String[] args) {
        // Dog 객체 생성 및 테스트
        Dog dog = new Dog("멍멍이", 3, "골든 리트리버");
        System.out.println("=== 강아지 테스트 ===");
        dog.makeSound();  // 추상 메서드 호출
        dog.move();       // 오버라이드된 메서드 호출
        dog.fetch();      // Dog 클래스만의 메서드 호출
        System.out.println();

        // Cat 객체 생성 및 테스트
        Cat cat = new Cat("냐옹이", 2, true);
        System.out.println("=== 고양이 테스트 ===");
        cat.makeSound();  // 추상 메서드 호출
        cat.move();       // 오버라이드된 메서드 호출
        cat.climb();      // Cat 클래스만의 메서드 호출
    }
} 