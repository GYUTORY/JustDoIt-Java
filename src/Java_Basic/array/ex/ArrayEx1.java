package Java_Basic.array.ex;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] student = {90, 80, 70, 60, 50};


        int count = 0;

        for(int i = 0; i < student.length ; i++) {
            count += student[i];
        }

        System.out.println("점수 총합: " + count);
        System.out.println("점수 평균: " + (double) count/ student.length);
    }
}
