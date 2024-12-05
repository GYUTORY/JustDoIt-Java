package Java_Mid.string.String_Method;

public class StringChangeMain2 {

    public static void main(String[] args) {
        String stwWithSpaces = "     Java Promgramming ";

        System.out.println("소문자로 변환: " + stwWithSpaces.toLowerCase());
        System.out.println("대문자로 변환: " + stwWithSpaces.toUpperCase());

        System.out.println("공백 제거(trim) : '" + stwWithSpaces.trim() + "'");
        System.out.println("공백 제거(strip) : '" + stwWithSpaces.strip() + "'");
        System.out.println("앞공백 제거(strip) : '" + stwWithSpaces.stripLeading() + "'");
        System.out.println("뒷공백 제거(strip) : '" + stwWithSpaces.stripTrailing() + "'");
    }
}
