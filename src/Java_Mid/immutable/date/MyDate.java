package Java_Mid.immutable.date;

/**
 * 가변 날짜 클래스
 * - 날짜 정보를 저장하고 변경할 수 있는 클래스
 */
public class MyDate {
    private int year;
    private int month;
    private int day;
    
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    public int getYear() {
        return year;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public int getMonth() {
        return month;
    }
    
    public void setMonth(int month) {
        this.month = month;
    }
    
    public int getDay() {
        return day;
    }
    
    public void setDay(int day) {
        this.day = day;
    }
    
    @Override
    public String toString() {
        return String.format("%d년 %d월 %d일", year, month, day);
    }
} 