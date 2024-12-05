// TIL - 불변객체 값 변경

package Java_Mid.immutable.change;

public class ImmutableObj {

    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    public ImmutableObj add(int addValue) {
        return new ImmutableObj(value + addValue);
    }

    public int getValue() {
        return value;
    }
}
