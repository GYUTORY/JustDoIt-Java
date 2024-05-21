package method;


/***
 * 메서드 호출과 값 전달1
 * 지금부터 자바에서 아주 중요한 대원칙 하나를 이야기하겠다. 밑줄 100번 긋자!
 * **자바는 항상 변수의 값을 복사해서 대입한다.**
 * 이 대원칙은 반드시 이해해야 한다. 그러면 아무리 복잡한 상황에도 코드를 단순하게 이해할 수 있다.
 */
public class MethodValue0 {
    public static void main(String[] args) {
        int num1 = 5;
        /***
         * 이 부분은 생각해보면 `num1`에 있는 값 `5`를 복사해서 `num2` 에 넣는 것이다.
         * 복사한다고 표현한 이유는 `num1`의 값을 읽어도 `num1` 에 있는 기존 값이 유지되고, 새로운 값이 `num2` 에 들어가기 때문이다.
         * 마치 `num1` 의 값이 `num2` 에 복사가 된 것 같다.
         * `num1` 이라는 변수 자체가 `num2`에 들어가는 것이 아니다. `num1` 에 들어있는 값을 읽고 복사해서 `num2` 에 넣는 것이다.
         * 간단하게 `num1` 에 있는 값을 `num2` 에 대입한다고 표현한다. 하지만 실제로는 그 값을 복사해서 대입하는 것이다.
         */
        int num2 = num1;
        num2 = 10;
        System.out.println("num1=" + num1);
        System.out.println("num2=" + num2);
    }
}
