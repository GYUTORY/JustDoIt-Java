package class1;


public class ClassStart2 {
    public static void main(String[] args) {
        // 자바에서 배열을 선언하고 초기화할 때 중괄호 {}를 사용한다.
        // 사유 : 배열의 요소들을 한 번에 지정하기 위해서입니다. 이를 "배열 초기화"라고 합니다.
        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] studentGrades = {90, 80};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름:" + studentNames[i] + " 나이:" + studentAges[i] + " 성적:" + studentGrades[i]);
        }
    }
}

/**
 배열 사용의 한계
 1. 배열을 사용해서 코드 변경을 최소화하는데는 성공했지만, 한 학생의 데이터가 `studentNames[]` , `studentAges[]` , `studentGrades[]` 라는 3개의 배열에 나누어져 있다.
 > 따라서 데이터를 변경할 때 매우 조심해서 작업해야 한다.
 2. 예를 들어서 학생 2의 데이터를 제거하려면 각각의 배열마다 학생2의 요소를 정확하게 찾아서 제거 해주어야 한다.

 해결을 위한 방법
 1. 클래스 도입
 - 클래스를 사용해서 학생이라는 개념을 만들고, 각각의 학생 별로 본인의 이름, 나이, 성적을 관리하는 것이다. 우선 코드를 작성하고 실행해보자.
 * */