// TIL - static 메서드 1

package Java_Basic._static.static2;

public class DecoUtil2 {


    /**
     **정적 메서드 사용법**
     `static` 메서드는 `static` 만 사용할 수 있다.
       - 클래스 내부의 기능을 사용할 때, 정적 메서드는 `static` 이 붙은 **정적 메서드나 정적 변수만 사용할 수 있 다.**
       - 클래스 내부의 기능을 사용할 때, 정적 메서드는 인스턴스 변수나, 인스턴스 메서드를 사용할 수 없다.
     반대로 모든 곳에서 `static` 을 호출할 수 있다.
       - 정적 메서드는 공용 기능이다. 따라서 접근 제어자만 허락한다면 클래스를 통해 모든 곳에서 `static` 을 호 출할 수 있다.
     */
    public static String desc(String str) {
        return "*" + str + "*";
    }
}
