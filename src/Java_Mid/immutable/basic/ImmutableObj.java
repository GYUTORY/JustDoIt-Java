// TIL - 불변객체 값 변경

package Java_Mid.immutable.basic;

/**
 * 불변 객체 예제
 * - 한번 생성되면 상태를 변경할 수 없는 클래스
 * - 모든 필드가 final이며 setter가 없음
 */
public class ImmutableObj {
    private final String value;
    
    public ImmutableObj(String value) {
        this.value = value;
    }
    
    public String getValue() {
        return value;
    }
    
    /**
     * 값을 변경할 필요가 있을 때는 새로운 객체를 생성하여 반환
     */
    public ImmutableObj withValue(String newValue) {
        return new ImmutableObj(newValue);
    }
    
    @Override
    public String toString() {
        return "ImmutableObj{value='" + value + "'}";
    }
}

