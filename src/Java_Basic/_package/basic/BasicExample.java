package Java_Basic._package.basic;

/**
 * 패키지 기본 사용 예제
 * 
 * 학습 내용:
 * 1. 같은 패키지 내 클래스 사용
 * 2. 접근 제어자 동작 확인
 * 3. 패키지 정보 확인
 */
public class BasicExample {
    public static void main(String[] args) {
        // 같은 패키지의 Data 클래스 사용 (import 불필요)
        Data data = new Data("기본 예제", 100);
        
        System.out.println("=== 1. public 멤버 접근 ===");
        data.publicMethod();
        System.out.println("name (getter): " + data.getName());
        System.out.println("value (getter): " + data.getValue());
        
        System.out.println("\n=== 2. package-private 멤버 접근 ===");
        // 같은 패키지이므로 package-private 멤버 접근 가능
        data.packagePrivateMethod();
        System.out.println("value (직접 접근): " + data.value);  // package-private 필드 직접 접근
        
        // private 멤버는 접근 불가
        // data.privateMethod();  // 컴파일 에러
        // System.out.println(data.name);  // 컴파일 에러
        
        System.out.println("\n=== 3. 패키지 정보 ===");
        System.out.println("현재 클래스의 패키지: " + BasicExample.class.getPackage().getName());
        System.out.println("Data 클래스의 패키지: " + Data.class.getPackage().getName());
    }
} 