// TIL - 패키지 - import

package pack;
import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        // 같은 클래스가 2개일 경우는, 하나는 전체 경로를 적어주어야 한다.
        // -> 즉, import는 둘 중 하나만 선택 할 수 있다.
        User userA = new User();
        pack.b.User userB = new pack.b.User();
    }
}
