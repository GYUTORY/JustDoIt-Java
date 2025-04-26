package Java_Mid.immutable.date;

/**
 * 불변 날짜 클래스
 * - 날짜 정보를 불변으로 관리하는 클래스
 * - 날짜 변경이 필요한 경우 새로운 객체를 생성
 */
public class ImmutableMyDate {
    private final int year;
    private final int month;
    private final int day;
    
    public ImmutableMyDate(int year, int month, int day) {
        validateDate(year, month, day);
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    private void validateDate(int year, int month, int day) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("월은 1-12 사이여야 합니다.");
        }
        if (day < 1 || day > 31) {
            throw new IllegalArgumentException("일은 1-31 사이여야 합니다.");
        }
        if (year < 0) {
            throw new IllegalArgumentException("연도는 0보다 커야 합니다.");
        }
    }
    
    public int getYear() {
        return year;
    }
    
    public int getMonth() {
        return month;
    }
    
    public int getDay() {
        return day;
    }
    
    /**
     * 연도를 변경한 새로운 날짜 객체를 생성
     */
    public ImmutableMyDate withYear(int newYear) {
        return new ImmutableMyDate(newYear, this.month, this.day);
    }
    
    /**
     * 월을 변경한 새로운 날짜 객체를 생성
     */
    public ImmutableMyDate withMonth(int newMonth) {
        return new ImmutableMyDate(this.year, newMonth, this.day);
    }
    
    /**
     * 일을 변경한 새로운 날짜 객체를 생성
     */
    public ImmutableMyDate withDay(int newDay) {
        return new ImmutableMyDate(this.year, this.month, newDay);
    }
    
    @Override
    public String toString() {
        return String.format("%d년 %d월 %d일", year, month, day);
    }
} 