package Java_Basic._package.basic;

/**
 * 기본 패키지 사용 예제
 * 같은 패키지 내의 클래스 사용하기
 * 
 * 주요 학습 내용:
 * 1. 같은 패키지의 클래스는 import 없이 사용 가능
 * 2. 패키지 레벨 접근 제어 확인
 * 3. public 멤버와 package-private 멤버의 차이
 */
public class PackageMain1 {
    public static void main(String[] args) {
        // 같은 패키지의 Data 클래스 사용 (import 불필요)
        Data data = new Data("테스트", 100);
        
        // public 메서드 호출
        System.out.println("=== public 메서드 호출 ===");
        data.publicMethod();
        
        // 패키지 레벨 메서드 호출 (같은 패키지이므로 가능)
        System.out.println("\n=== 패키지 레벨 메서드 호출 ===");
        data.packagePrivateMethod();
        
        // 패키지의 의미 설명
        System.out.println("\n=== 패키지 정보 ===");
        System.out.println("현재 패키지: " + PackageMain1.class.getPackage().getName());
        System.out.println("Data 클래스 패키지: " + Data.class.getPackage().getName());
    }
} 