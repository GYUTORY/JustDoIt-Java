// TIL : 생성자 - this

package Java_Basic.construct;

public class MemberThis {
    String nameField;

    // 아래의 경우, this의 생략이 가능하다.
    // nameField는 먼저 지역변수(매개변수)에서 같은 이름이 있는지 찾는다.
    // --> 이 경우 없으므로 멤버 변수에서 찾는다.

    // nameParameter는 먼저 지역변수(매개변수)에서 같은 이름이 있는지 찾는다.
    // --> 이 경우 매개변수가 있으므로 매개변수를 사용한다.
    // --> IDE에서 색깔로 잘 구분해주기 때문에, 요즘 추세는 이름을 꼭 같을 경우만 this를 활용한다.
    void initMember(String nameParameter) {
        nameField = nameParameter;
    }
}