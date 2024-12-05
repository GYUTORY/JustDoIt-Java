package Java_Basic.poly.basic;

public class PolyMain {

    public static void main(String[] args) {
        //부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parnet");
        Parent parent = new Parent();
        parent.parentMethod();

        //자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        System.out.println("Parent -> Child");
        // 부모는 자식을 참조할 수 있다.  === 다형적 참조
        // Parent poly에 참조값을 담아, Child라는 인스턴스를 생성
        // -> 생성된 참조값을 Parent타입의 변수인 poly에 담아둔다.
        // --> 자식 메서드 호출 불가능.
        Parent poly = new Child();


        // 자식타입은 부모 타입을 담을 수 없다.
        // Child child1 = new Parent(); --> 컴파일 오류 발생
        poly.parentMethod();
    }
}
