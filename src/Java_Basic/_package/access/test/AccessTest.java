package Java_Basic._package.access.test;

import Java_Basic._package.basic.Data;

/**
 * 패키지 접근 제어 테스트 클래스
 */
public class AccessTest {
    public void testAccess() {
        Data data = new Data("접근 테스트", 100);
        
        System.out.println("=== public 멤버 접근 ===");
        data.publicMethod();
        System.out.println("name (getter): " + data.getName());
        System.out.println("value (getter): " + data.getValue());
        
        // 다른 패키지의 package-private 멤버 접근 시도
        System.out.println("\n=== package-private 멤버 접근 시도 ===");
        System.out.println("다음 라인들은 컴파일 에러가 발생합니다:");
        // data.packagePrivateMethod();  // 컴파일 에러
        // System.out.println(data.value);  // 컴파일 에러
    }
} 