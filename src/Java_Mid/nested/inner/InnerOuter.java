// #중첩 클래스 #내부 클래스

package Java_Mid.nested.inner;

public class InnerOuter {

    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    // 내부 클래스는 앞에 static이 붙지 않는다. 쉽게 이야기해서 인스턴스 멤버가 된다.
    class Inner {
        private int innerInstanceValue = 1;

        public void print() {
            // 자기 자신에 접근
            System.out.println(innerInstanceValue);

            // 외부 클래스의 인스턴스 멤버에 접근 가능, private도 접근 가능
            // -> static 중첩 클래스의 경우, 바깥 클래스의 인스턴스 멤버에는 접근할 수 없다.
            System.out.println(outInstanceValue);

            // 외부 클래스의 클래스 멤버에 접근 가능, private도 접근 가능
            System.out.println(outClassValue);
        }
    }
}
