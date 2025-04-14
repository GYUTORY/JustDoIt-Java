// TIL - 접근 제어자 사용 - 필드, 메서드

package Java_Basic.access.other_package;

import Java_Basic.access.same_package.PublicClass;    // ⭕ public 클래스는 임포트 가능
// import Java_Basic.access.same_package.DefaultClass1;  // ❌ default 클래스는 다른 패키지에서 접근 불가

public class AccessOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();  // ⭕ public 클래스 접근 가능
        // DefaultClass1 class1 = new DefaultClass1();  // ❌ default 클래스 접근 불가
    }
}
