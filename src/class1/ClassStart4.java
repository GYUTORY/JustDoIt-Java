package class1;

/**
 * 배열 도입 - 시작
 * 클래스와 객체 덕분에 학생 데이터를 구조적으로 이해하기 쉽게 변경할 수 있었다.
 * 마치 실제 학생이 있고, 그 안에 각 학생의 정보가 있는 것 같다. 따라서 사람이 이해하기도 편리하다. 이제 각각의 학생 별로 객체를 생성하고, 해당 객체에 학생의 데이터를 관리하면 된다.
 * */
public class ClassStart4 {
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

        Student[] students = new Student[2];
        // 자바에서 대입은 항상 변수에 들어 있는 값을 복사한다.
        // student1, student2에는 참조값이 보관되어 있다. 따라서 이 참조값이 배열에 저장된다.
        // 또는 student1, student2에 보관된 참조값을 읽어서 배열게 대입한다고 표현한다.

        // -> `student1` , `student2` 에는 참조값이 들어있다. 그래서 이 값을 복사해서 왼쪽에 있는 배열에 전달한다. 따라서 기존 `student1` , `student2` 에 들어있던 참조값은 당연히 그대로 유지된다.
        // --> 뭔말이냐면, students[0].name의 값을 변경하면 참조값인 student1.name도 같이 변경된다는 얘기임
        students[0] = student1;
        students[1] = student2;

        for(int i = 0;i<students.length;i++) {
            System.out.println("이름:" + students[i].name + " 나이:" + students[i].age + " 성적:" + students[i].grade);
            students[i].name =  i + 1 + "번째" + "값 바꿀게용 " ;
        }

        for(int i = 0;i<students.length;i++) {
            System.out.println("이름:" + students[i].name + " 나이:" + students[i].age + " 성적:" + students[i].grade);
        }
    }

}
