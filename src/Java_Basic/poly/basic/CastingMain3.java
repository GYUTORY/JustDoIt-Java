package Java_Basic.poly.basic;

// upcasting vs downcasting
public class CastingMain3 {

    // 자바에서 부모는 자식을 담을 수 있다. 그 반대는 안된다.(꼭 필요하다면 다운캐스팅을 해야 한다.)
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = (Parent) child; // 업캐스팅은 생략 가능, 생략 권장
        Parent parent2 = child; // 업캐스팅은 생략

        parent1.parentMethod();
    }

}
