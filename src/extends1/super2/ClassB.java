package extends1.super2;

public class ClassB extends ClassA {

    public ClassB(int a) {
        // 상속을 받으면 생성자의 첫줄에 super()를 사용해서 부모 클래스의 생성자를 호출해야 한다.
        // -> 단, 기본생성자(파라미터가 없는 생성자)라면 생략이 가능하다.
        super(); // 기본 생성자 생략 가능 (부모 생성자 생략)
        System.out.println("ClassB 생성자 a=" + a);
    }

    public ClassB(int a, int b) {
        super(); // 기본 생성자 생략 가능 (부모 생성자 생략)
        System.out.println("ClassB 생성자 a= " + a + ", b= " + b);
    }
}
