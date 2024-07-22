package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        // Student 변수 선언
        Student student1; // Student 타입을 받을 수 있는 변수를 선언한다.

        // Student 인스턴스 생성
        // new Student() : new는 새로 생성한다는 뜻이다. new Student()는 Studenet 클래스 정보를 기반으로 새로운 객체를 생성하라는 뜻이다.
        // 이렇게 하면 메모리에 실제 Student 객체(인스턴스)를 생성한다. > 메모리 공간도 미리 확보를 한다.
        student1 = new Student(); // > x001; 이렇게 참조값으로 변환된다.

        // Student student1 변수는 이제 메모리에 존재하는 실제 Student 객체(인스턴스_의 참조값을 가지고 있다.
        // 즉, student1 변수를 통해 메모리에 있는 실제 객체를 접근하고 사용할 수 있다.
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;


        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성적:" + student1.grade);
        System.out.println("이름:" + student2.name + " 나이:" + student2.age + " 성적:" + student2.grade);
    }
}

/***
 * **클래스와 사용자 정의 타입**
 * 타입은 데이터의 종류나 형태를 나타낸다.
 * `int` 라고 하면 정수 타입, `String` 이라고 하면 문자 타입이다. 학생( `Student` )이라는 타입을 만들면 되지 않을까?
 * 클래스를 사용하면 `int` , `String` 과 같은 타입을 직접 만들 수 있다.
 * 사용자가 직접 정의하는 사용자 정의 타입을 만들려면 설계도가 필요하다. 이 **설계도가 바로 클래스**이다. 설계도인 클래스를 사용해서 **실제 메모리에 만들어진 실체를 객체 또는 인스턴스**라 한다.
 * 클래스를 통해서 사용자가 원하는 종류의 데이터 타입을 마음껏 정의할 수 있다.
 *
 즉, 붕어빵 틀은 클래스이며,
 붕어빵 틀로 만들어지는 팥붕, 슈붕은 객체(인스턴스)이다.
 */