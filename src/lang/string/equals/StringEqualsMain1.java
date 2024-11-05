package lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("new Strijng() == 비교: " + (str1 == str2));
        System.out.println("new Strijng() equals 비교: " + (str1.equals(str2)));

        // 리터럴의 경우, 동일 문자는 문자열 풀에서 찾아서 참조해서 사용한다.
        String str3 = "hello";
        String str4 = "hello"; // 프로그램 로딩 시점에, 문자열 풀에서 찾아서 굳이 넣지는 않는다.

        // 문자열 리터럴을 사용하는 경우, 같은 참조값을 가지므로 == 비교에 성공한다.
        System.out.println("리터럴 == 비교: " + (str3 == str4));
        System.out.println("리터럴 equals 비교: " + (str3.equals(str4)));

    }


}
