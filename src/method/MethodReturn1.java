package method;

/***
 * 반환타입
 * - 반환 타입이 있으면 반드시 값을 반환해야 한다.
 * - 반환 타입이 있는 메서드는 반드시 return을 사용해서 값을 반환해야 한다.
 */
public class MethodReturn1 {
    public static void main(String[] args) {
        boolean result = odd(2);
        System.out.println(result);
    }


    public static boolean odd(int i) {
        if (i % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
