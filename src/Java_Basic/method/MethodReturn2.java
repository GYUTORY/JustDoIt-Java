package Java_Basic.method;

/***
 * 반환타입
 * - 반환 타입이 있으면 반드시 값을 반환해야 한다.
 * - 반환 타입이 있는 메서드는 반드시 return을 사용해서 값을 반환해야 한다.
 */
public class MethodReturn2 {
    public static void main(String[] args) {
        checkAge(10);
        checkAge(20);
    }


    /***
     * 18세 미만의 경우 "미성년자는 출입이 불가능합니다"를 출력하고 바로 `return` 문이 수행된다. 따라서 다음 로직 을 수행하지 않고, 해당 메서드를 빠져나온다.
     * 18세 이상의 경우 "입장하세요"를 출력하고, 메서드가 종료된다. 참고로 반환 타입이 없는 `void` 형이기 때문에 마지막 줄의 `return` 은 생략할 수 있다.
     * @param age
     */
    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println(age + "살, 미성년자는 출입이 불가능합니다.");
            return;
        }
        System.out.println(age + "살, 입장하세요.");
    }

}
