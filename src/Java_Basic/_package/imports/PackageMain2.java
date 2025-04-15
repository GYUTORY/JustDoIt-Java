package Java_Basic._package.imports;

import Java_Basic._package.basic.Data;  // 단일 클래스 import
import Java_Basic._package.sub.a.*;     // a 패키지의 모든 클래스 import
import static java.lang.Math.PI;        // static import 예제
import static java.lang.Math.max;       // static 메서드 import

/**
 * 패키지 import 예제
 * 다양한 import 방식 실습
 * 
 * 주요 학습 내용:
 * 1. 단일 클래스 import
 * 2. 패키지 전체 import (와일드카드 사용)
 * 3. static import
 * 4. import 사용 시 주의사항
 */
public class PackageMain2 {
    public static void main(String[] args) {
        // 다른 패키지의 클래스 사용 (import 필요)
        Data data = new Data("임포트 테스트", 200);
        
        System.out.println("=== 기본 import 테스트 ===");
        data.publicMethod();
        // data.packagePrivateMethod(); // 컴파일 에러: 다른 패키지의 package-private 메서드 접근 불가
        
        // static import 사용
        System.out.println("\n=== static import 테스트 ===");
        System.out.println("PI 값: " + PI);  // Math.PI 대신 직접 PI 사용 가능
        System.out.println("max(10, 20): " + max(10, 20));  // Math.max 대신 직접 max 사용 가능
        
        // import 정보 출력
        System.out.println("\n=== 클래스 정보 ===");
        System.out.println("현재 클래스: " + PackageMain2.class.getName());
        System.out.println("사용 중인 Data 클래스: " + data.getClass().getName());
    }
} 