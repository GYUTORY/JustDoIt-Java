package Java_Basic.memory.reference;

/**
 * 참조(Reference) 예제
 */
public class ReferenceExample {
    public static void main(String[] args) {
        // 기본 타입 변수
        int primitive1 = 10;
        int primitive2 = primitive1;  // 값이 복사됨
        primitive2 = 20;  // primitive1은 영향 받지 않음

        System.out.println("=== 기본 타입 ===");
        System.out.println("primitive1 = " + primitive1);  // 10
        System.out.println("primitive2 = " + primitive2);  // 20

        // 참조 타입 변수
        StringBuilder ref1 = new StringBuilder("Hello");
        StringBuilder ref2 = ref1;  // 참조가 복사됨
        ref2.append(" World");  // ref1도 영향 받음

        System.out.println("\n=== 참조 타입 ===");
        System.out.println("ref1 = " + ref1);  // Hello World
        System.out.println("ref2 = " + ref2);  // Hello World
        System.out.println("ref1 == ref2: " + (ref1 == ref2));  // true

        // 새로운 객체 생성
        StringBuilder ref3 = new StringBuilder("Hello World");
        System.out.println("\n=== 새로운 객체 ===");
        System.out.println("ref2 == ref3: " + (ref2 == ref3));  // false
        System.out.println("ref2.toString().equals(ref3.toString()): " + 
                         ref2.toString().equals(ref3.toString()));  // true

        // null 참조
        StringBuilder ref4 = null;
        System.out.println("\n=== null 참조 ===");
        System.out.println("ref4 = " + ref4);
        
        try {
            ref4.append("Test");  // NullPointerException 발생
        } catch (NullPointerException e) {
            System.out.println("NullPointerException 발생: null 참조에 메서드 호출 불가");
        }
    }
} 