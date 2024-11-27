//  #중첩클래스 #내부클래스


/*
중첩 클래스 - 내부 클래스 정리
- 정적 중첩 클래스와 다르게 내부 클래스는 바깥 인스턴스에 소속된다.
- 중첩이라는 단어와 내부라는 단어의 차이를 다시 한번 정리해보자.
 - 중첩(Nested) : 어떤 다른 것이 내부에 위치하거나 포함되는 구조적인 관계
 - 내부(Inner) : 나의 내부에 있는 나를 구성하는 요소


 중첩
 - 나의 안에 있지만 내것이 아닌 것을 말한다.
 - 단순히 위치만 안에 잇는 것이다. 반면에 여기서 의미하는 내부(Inner)는 나의 내부에서 나를 구성하는 요소를 말한다.

 정적 중첩 클래스
 - 다른 클래스를 그냥 중첩해 둔 것일 뿐이다. 쉽개 이야기해서 둘은 아무런 관계가 없다. 반면에 내부 클래스는 바깥 클래스의 인스턴스 내부에서 구성 요소로 사용된다.
* */


package nested.inner;

public class InnerOuterMain {

    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();

        // 내부 클래스는 바깥 클래스의 인스턴스에 소속된다. 따라서 바같 클래스의 인스턴스 정보를 알아야 생성할 수 있다.
        // 내부 클래스는 new 바깥 클래스의 인스턴스 참조.내부클래스()로 생성할 수 있다.
        // - 내부 클래스는 바깥 클래스의 인스턴스에 소속되어야 한다. 따라서 내부 클래스를 생성할 때 바깥 클래스의 인스턴스 참조가 필요하다.
        // ->  outer.new Inner()에서 outer는 바깥 클래스의 인스턴스를 참조를 가진다.
        InnerOuter.Inner inner = outer.new Inner(); // 단독으로 생성이 불가능.
        inner.print();

        System.out.println("innerClass = " + inner.getClass());

    }
}
