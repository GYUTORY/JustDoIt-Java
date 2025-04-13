package Java_Basic._package.access;

import Java_Basic._package.basic.Data;
import Java_Basic._package.access.test.AccessTest;

/**
 * 패키지 접근 제어 예제
 * 
 * 학습 내용:
 * 1. public 멤버 접근
 * 2. package-private 멤버 접근 제한
 * 3. 다른 패키지의 클래스 사용
 */
public class AccessExample {
    public static void main(String[] args) {
        // 1. 다른 패키지의 클래스 사용
        System.out.println("=== 1. 다른 패키지의 클래스 사용 ===");
        Data data = new Data("접근 테스트", 100);
        data.publicMethod();  // public 메서드는 접근 가능
        
        // package-private 멤버 접근 시도
        // data.packagePrivateMethod();  // 컴파일 에러: 다른 패키지의 package-private 메서드
        // System.out.println(data.value);  // 컴파일 에러: 다른 패키지의 package-private 필드
        
        // 2. 같은 패키지의 테스트 클래스 사용
        System.out.println("\n=== 2. 같은 패키지의 테스트 클래스 사용 ===");
        AccessTest test = new AccessTest();
        test.testAccess();
    }
} 