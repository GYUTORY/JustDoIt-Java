// TIL - 불변객체 값 변경
// -> 어느정도 백엔드 개발을 해본 사람이라면, 당연한 result라고 생각한다.

package lang.immutable.change;

public class ImmutableMain {
    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        ImmutableObj obj2 = obj1.add(20);

        // 계산 이후의 기존 값은 사라짐
        System.out.println("obj = " +obj1.getValue());
        System.out.println("obj = " +obj2.getValue());
    }
}
