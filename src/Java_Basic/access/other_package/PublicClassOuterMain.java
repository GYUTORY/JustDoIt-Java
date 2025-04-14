// TIL - 접근 제어자 사용 - 클래스 레벨

package Java_Basic.access.b;


import Java_Basic.access.a.PublicClass;

// 다른 패키지 접근불가
//import Java_Basic.access.a.DefaultClass1;
//import Java_Basic.access.a.DefaultClass2;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        // 다른 패키지 접근불가
        // DefaultClass1 class1 = new DefaultClass1();
        // 다른 패키지 접근불가
        // DefaultClass2 class2 = new DefaultClass2();
    }

}
