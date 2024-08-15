// TIL - 패키지 시작

package pack.a;

public class User {

    // 생성자에 public을 사용했다.
    // 다른 패키지에서 이 클래스의 생성자를 호출하려면 public을 사용해야 한다.
    public User() {
        System.out.println("패키지 pack.a 회원 생성");
    }
}
