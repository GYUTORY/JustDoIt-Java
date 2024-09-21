package extends1.super2;

public class ClassC extends ClassB {

    public ClassC() {
        // ClassB를 상속 받았다. ClassB는 다음 두 생성자가 있다.
        // ClassB(int a)
        // ClassB(int a, int b)
        // -> ClassB에는 기본생성자가 없기 때문에, 부모의 기본 생성자를 호출하는 super()를 사용하거나 생략할 수 없다.
        super(10, 20);
        System.out.println("ClassC 생성자");
    }
}
