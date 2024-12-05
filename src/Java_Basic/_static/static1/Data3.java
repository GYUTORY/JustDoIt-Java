// TIl - statics 변수 2

package Java_Basic._static.static1;

public class Data3 {
    public String name;
    // static이 붙은 멤버 변수는 메서드 영역에서 관리한다.
    // -> static이 붙은 멤버 변수 count는 인스턴스 영역에 생성되지 않는다. 대신에 메서드 영역에서 이 변수를 관리한다.
    // --> 즉, 공용으로 사용한다의 느낌
    public static int count;

    public Data3(String name) {
        this.name = name;
        count++;
    }
}
