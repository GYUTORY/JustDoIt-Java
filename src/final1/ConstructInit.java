// TIL - final 변수와 상수 1

package final1;

public class ConstructInit {

    final int value;

    // 생성자 이후에, 값 수정 불가능
    public ConstructInit(int value) {
        this.value = value;
    }
}
