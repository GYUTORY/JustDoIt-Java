// TIL - 접근 제어자 사용 - 클래스 레벨

package Java_Basic.access.same_package;

public class PublicClass {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();
    }
}

// 아무것도 없으면 default class임
class DefaultClass1 {

}

// 아무것도 없으면 default class임
class DefaultClass2 {

}
