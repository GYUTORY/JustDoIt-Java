package Java_Basic.casting.reference;

/**
 * 참조형 타입의 형변환 예제
 */
class Animal {
    void sound() {
        System.out.println("동물이 소리를 냅니다.");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("멍멍!");
    }
    
    void fetch() {
        System.out.println("공을 가져옵니다.");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("야옹~");
    }
    
    void scratch() {
        System.out.println("긁적긁적");
    }
}

public class ReferenceCasting {
    public static void main(String[] args) {
        // 1. 업캐스팅 (자동 형변환)
        System.out.println("1. 업캐스팅");
        Animal animal1 = new Dog();  // Dog → Animal
        Animal animal2 = new Cat();  // Cat → Animal
        
        animal1.sound();  // "멍멍!" (다형성)
        animal2.sound();  // "야옹~" (다형성)
        
        // 업캐스팅된 객체는 자식의 고유 메서드 호출 불가
        // animal1.fetch();  // 컴파일 에러
        // animal2.scratch();  // 컴파일 에러
        
        // 2. 다운캐스팅 (명시적 형변환)
        System.out.println("\n2. 다운캐스팅");
        
        // instanceof로 안전한 다운캐스팅
        if (animal1 instanceof Dog) {
            Dog dog = (Dog) animal1;  // Animal → Dog
            dog.fetch();  // 이제 Dog의 고유 메서드 호출 가능
        }
        
        if (animal2 instanceof Cat) {
            Cat cat = (Cat) animal2;  // Animal → Cat
            cat.scratch();  // 이제 Cat의 고유 메서드 호출 가능
        }
        
        // 3. 잘못된 다운캐스팅
        System.out.println("\n3. 잘못된 다운캐스팅 방지");
        
        // instanceof로 타입 체크하지 않으면 런타임 에러 발생 가능
        try {
            Dog wrongDog = (Dog) animal2;  // Cat을 Dog로 캐스팅 시도
        } catch (ClassCastException e) {
            System.out.println("잘못된 형변환입니다: " + e.getMessage());
        }
    }
} 