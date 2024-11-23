package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {

    public static void main(String[] args) {
        // 포멧팅 : 날짜와 시간을 문자로
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = now.format(formatter);
        System.out.println("날짜와 시간 포멧팅: " + formattedDate);

        // 파싱: 문자를 날짜로
        String input = "2024-12-31 23:59:59";
        LocalDateTime parsedDateTime = LocalDateTime.parse(input, formatter);
        System.out.println("parsedDateTime = " + parsedDateTime);
    }
}
