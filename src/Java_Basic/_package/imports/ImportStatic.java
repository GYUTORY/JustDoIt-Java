package Java_Basic._package.imports;

import static java.lang.Math.PI;
import static java.lang.Math.max;
import static java.lang.System.out;

/**
 * static import 예제
 * 
 * 학습 내용:
 * 1. static 멤버 import
 * 2. 여러 static 멤버 import
 * 3. static import의 활용
 */
public class ImportStatic {
    public static void main(String[] args) {
        // 1. static 상수 사용
        System.out.println("=== 1. static 상수 사용 ===");
        out.println("PI = " + PI);  // System.out.println 대신 out.println 사용
        
        // 2. static 메서드 사용
        System.out.println("\n=== 2. static 메서드 사용 ===");
        out.println("max(10, 20) = " + max(10, 20));  // Math.max 대신 max 직접 사용
        
        // 3. static import 활용
        System.out.println("\n=== 3. static import 활용 ===");
        double radius = 5.0;
        double area = PI * radius * radius;  // Math.PI 대신 PI 직접 사용
        out.println("원의 넓이 (반지름 = " + radius + "): " + area);
        
        // static import를 사용하지 않은 경우와 비교
        System.out.println("\n=== 4. static import 미사용 비교 ===");
        System.out.println("Math.PI = " + Math.PI);
        System.out.println("Math.max(30, 40) = " + Math.max(30, 40));
    }
} 