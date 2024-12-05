// #정적 중첩 클래스

package Java_Mid.nested.nested;

public class NestedOuterMain {

    public static void main(String[] args) {
        // 정적 중첩 클래스는 new 바깥클래스.중첩클래스()로 생성할 수 있다.
        NestedOuter.Nested nested = new NestedOuter.Nested();
        nested.print();

        System.out.println("nestedClass = " + nested.getClass());
    }
}
