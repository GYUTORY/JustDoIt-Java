package class1;

/**
 * 배열 도입 - 시작
 * 클래스와 객체 덕분에 학생 데이터를 구조적으로 이해하기 쉽게 변경할 수 있었다.
 * 마치 실제 학생이 있고, 그 안에 각 학생의 정보가 있는 것 같다. 따라서 사람이 이해하기도 편리하다. 이제 각각의 학생 별로 객체를 생성하고, 해당 객체에 학생의 데이터를 관리하면 된다.
 * */
public class ClassStart5 {
    public static void main(String[] args) {
        Student student1;

        student1 = new Student(); // > x001; 이렇게 참조값으로 변환된다.
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;


        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;


        // 배열을 초기화하면서 동시에 그 요소들에 값을 할당합니다.
        // Java 컴파일러는 자동으로 new 키워드를 추가하여 메모리를 할당합니다. 이는 아래와 동일합니다:
        // Student[] students = new Student[] {student1, student2}; > 안해도 된다는 뜻.
         Student[] students = {student1, student2};

       /* for(int i = 0;i<students.length;i++) {
            Student s = students[i];
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }*/

        // 향상된 For문 버전
        /**
         1. Student: Student는 클래스입니다. 이는 학생의 구조를 정의하는 청사진 또는 템플릿입니다. 클래스는 객체가 가져야 할 속성(필드)와 메서드(동작)를 정의합니다.
         2. s: s는 Student 클래스의 인스턴스를 참조하는 변수입니다. 즉, students 배열의 각 요소를 반복하면서 해당 요소를 s에 할당하고 있습니다. 여기서 s는 Student 객체를 가리키고 있습니다.
         3. students: students는 Student 객체의 배열입니다. 이 배열은 여러 Student 객체를 참조할 수 있습니다.
         */
        for(Student s : students) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }

    }

}
