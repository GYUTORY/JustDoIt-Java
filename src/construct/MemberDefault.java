// TIL : 생성자

package construct;

public class MemberDefault {
    String name;

    // Java에서 기본으로 생성된다.
    // 아래처럼 하나라도 있다면, 자바에서 자동으로 만들지 않음.
    MemberDefault() {
        System.out.println("생성자 호출");
    }
}
