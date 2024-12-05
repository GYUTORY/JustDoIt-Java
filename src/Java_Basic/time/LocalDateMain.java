// #시간

//주의! - 불변
// 모든 날짜 클래스는 불변이다. 따라서 변경이 발생하는 경우 새로운 객체를 생성해서 반환하므로 반환값을 꼭 받아야 한다.
package Java_Basic.time;

import java.time.LocalDate;

public class LocalDateMain {

    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now(); // 현재 시간을 기준
        LocalDate ofDate = LocalDate.of(2013, 11, 21); // 특정 날짜를 기준
        System.out.println("오늘 날짜 = " + nowDate);
        System.out.println("지정 날짜 = " + ofDate);

        // 게산(불변)
        ofDate = ofDate.plusDays(10);
        System.out.println("지정 날짜+10d = " + ofDate);
    }
}
