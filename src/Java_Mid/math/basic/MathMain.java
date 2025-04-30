package Java_Mid.math.basic;

/**
 * Math 클래스의 주요 메서드 사용 예제
 */
public class MathMain {
    
    public static void main(String[] args) {
        // 절대값
        System.out.println("=== 절대값 ===");
        System.out.println("Math.abs(-5) = " + Math.abs(-5));
        System.out.println("Math.abs(-3.14) = " + Math.abs(-3.14));
        
        // 올림, 내림, 반올림
        System.out.println("\n=== 올림, 내림, 반올림 ===");
        System.out.println("Math.ceil(3.7) = " + Math.ceil(3.7));   // 올림
        System.out.println("Math.floor(3.7) = " + Math.floor(3.7)); // 내림
        System.out.println("Math.round(3.7) = " + Math.round(3.7)); // 반올림
        
        // 최대값, 최소값
        System.out.println("\n=== 최대값, 최소값 ===");
        System.out.println("Math.max(10, 20) = " + Math.max(10, 20));
        System.out.println("Math.min(10, 20) = " + Math.min(10, 20));
        
        // 거듭제곱과 제곱근
        System.out.println("\n=== 거듭제곱과 제곱근 ===");
        System.out.println("Math.pow(2, 3) = " + Math.pow(2, 3));   // 2의 3제곱
        System.out.println("Math.sqrt(9) = " + Math.sqrt(9));       // 제곱근
        
        // 삼각함수
        System.out.println("\n=== 삼각함수 ===");
        double angle = Math.PI / 6; // 30도
        System.out.println("Math.sin(30도) = " + Math.sin(angle));
        System.out.println("Math.cos(30도) = " + Math.cos(angle));
        System.out.println("Math.tan(30도) = " + Math.tan(angle));
    }
} 