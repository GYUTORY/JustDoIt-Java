package Java_Basic.oop.inherit;

/**
 * 상속(Inheritance) 예제 - 메인 클래스
 */
public class InheritanceExample {
    public static void main(String[] args) {
        // 상속 관계 확인
        Animal animal = new Animal("동물", 1);
        Dog dog = new Dog("멍멍이", 3, "진돗개");

        System.out.println("=== 동물 정보 ===");
        animal.showInfo();
        animal.makeSound();

        System.out.println("\n=== 강아지 정보 ===");
        dog.showInfo();
        dog.makeSound();
        dog.fetch();

        // 다형성 예제
        System.out.println("\n=== 다형성 예제 ===");
        Animal polymorphicDog = new Dog("바둑이", 2, "말티즈");
        polymorphicDog.showInfo();
        polymorphicDog.makeSound();
        // polymorphicDog.fetch(); // 에러: Animal 타입으로는 Dog의 고유 메서드 호출 불가

        // instanceof 연산자 사용
        if (polymorphicDog instanceof Dog) {
            Dog castedDog = (Dog) polymorphicDog;
            castedDog.fetch();
        }
    }
} 