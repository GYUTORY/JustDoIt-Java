// TIL - final 변수와 상수 1

package Java_Basic._final.field;

public class FieldInit {


    // 변하지 않는, 공용 변수
    static final int CONST_VALUE = 10;
    final int value = 10;

    // 이미 할당 된 경우, 생성자로도 불가능하다.
    /*public FieldInit(int value) {
        this.value = value;
    }*/
}
