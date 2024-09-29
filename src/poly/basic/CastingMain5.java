package poly.basic;

public class CastingMain5 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    // 매개변수로 넘어온 parent가 참조하는 타입에 따라서 다른 명령을 수행한다.
    // 지금처럼 다운캐스팅을 수행하기 전에는 먼저 instanceof를 사용해서 원하는 타입으로 변경이 가능한지 확이난 다음에 다운캐스팅을 수행하는 것이 안전하다.
    private static void call(Parent parent) {
        parent.parentMethod();

        if(parent instanceof Child) {
            System.out.println("Child 인스턴스 맞음");
            Child child = (Child) parent;
            child.childMethod();
        }
    }
}
