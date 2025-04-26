// TIL - 불변객체 값 변경

package Java_Mid.immutable.basic;

/**
 * 가변 객체 예제
 * - 객체의 상태를 변경할 수 있는 일반적인 클래스
 */
public class MutableObj {
    private String value;
    
    public MutableObj(String value) {
        this.value = value;
    }
    
    public String getValue() {
        return value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }
    
    @Override
    public String toString() {
        return "MutableObj{value='" + value + "'}";
    }
}
