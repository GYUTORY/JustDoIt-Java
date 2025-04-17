// TIL - 접근 제어자 사용 - 필드, 메서드

/***
- private은 AccessData 내부에서만 접근할 수 있다. 따라서 호출 불가다.
- AccessData.innerAccess() 메서드는 public이다. 따라서 외부에서 호출할 수 있다.
- innerAccess() 메서드는 외부에서 호출되었지만 innerAccess() 메서드는 AccessData에 포함되어 있다.
- --> 이 메서드는 자신의 private 필드와 메서드에 모두 접근하 수 있다.
 */

package Java_Basic.access.same_package;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        // public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        // 같은 패키지 default 호출 가능
        data.defaultField = 1;
        data.defaultMethod();

        // private 호출 불가
        // data.privatField = 1;
        // data.privateMethod();

        // 메서드 내부 호출은 가능하다.
        data.innerAccess();
    }
}
