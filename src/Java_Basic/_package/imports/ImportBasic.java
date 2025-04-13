package Java_Basic._package.imports;

import Java_Basic._package.basic.Data;               // 단일 클래스 import
import Java_Basic._package.sub.a.AData;              // 다른 패키지의 클래스 import
import Java_Basic._package.sub.b.BData;              // 다른 패키지의 클래스 import

/**
 * import 기본 사용 예제
 * 
 * 학습 내용:
 * 1. 단일 클래스 import
 * 2. 다른 패키지의 클래스 사용
 * 3. import 없이 전체 경로 사용
 */
public class ImportBasic {
    public static void main(String[] args) {
        // 1. import한 클래스 사용
        System.out.println("=== 1. import한 클래스 사용 ===");
        Data data = new Data("import 예제", 100);
        data.publicMethod();
        
        // 2. 여러 패키지의 클래스 사용
        System.out.println("\n=== 2. 여러 패키지의 클래스 사용 ===");
        AData aData = new AData("A 데이터");
        BData bData = new BData("B 데이터");
        
        aData.printInfo();
        bData.printInfo();
        
        // 3. import 없이 전체 경로 사용
        System.out.println("\n=== 3. 전체 경로 사용 ===");
        Java_Basic._package.basic.Data fullPathData = 
            new Java_Basic._package.basic.Data("전체 경로", 200);
        fullPathData.publicMethod();
        
        // package-private 멤버는 다른 패키지에서 접근 불가
        // data.packagePrivateMethod();  // 컴파일 에러
        // System.out.println(data.value);  // 컴파일 에러
    }
} 