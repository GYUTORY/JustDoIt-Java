package Java_Basic.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {

    public static void main(String[] args) {
        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2016, 8, 16, 8, 10, 1);

        System.out.println("현재 날짜시간 = " + nowDt);
        System.out.println("지정 날짜시간 = " + ofDt);

        // 날짜와 시간 분리
        LocalDate localDate = ofDt.toLocalDate();
        LocalTime localTime = ofDt.toLocalTime();
        System.out.println("localDate = " + localDate);
        System.out.println("localTime = " + localTime);

        // 계산(불변)
        LocalDateTime ofDtPlus = ofDt.plusDays(1000);
        System.out.println("지정 날짜시간+1000d = " + ofDtPlus);
        LocalDateTime ofDtPlus1Year = ofDt.plusYears(1);
        System.out.println("지정 날짜시간+1년 = " + ofDtPlus1Year);


        // 비교
        System.out.println("현재 날짜시간이 지정 날짜 시간보다 이전인가? " + nowDt.isBefore(ofDt));
        System.out.println("현재 날짜시간이 지정 날짜 시간보다 이후인가? " + nowDt.isAfter(ofDt));

        // 다른 날짜시간과 시간적으로 동일한지 비교한다. 시간이 같으면 true를 반환한다.
        // -> 예) 서울의 9시와 UTC의 0시는 시간적으로 같다. 이 둘을 비교하면 true를 반환한다.
        System.out.println("현재 날짜시간과 지정 날짜 시간이 같은가? " + nowDt.isEqual(ofDt));
    }
}
