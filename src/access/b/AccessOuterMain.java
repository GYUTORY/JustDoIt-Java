// TIL - 접근 제어자 사용 - 필드, 메서드

package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        // public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        // 다른 패키지 default 호출 불가
        // data.defaultField = 1;
        //data.defaultMethod();

        // private 호출 불가
        // data.privatField = 1;
        // data.privateMethod();

        // 메서드 내부 호출은 가능하다.
        data.innerAccess();
    }
}
