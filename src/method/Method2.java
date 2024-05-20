package method;

/** 메서드 정의 **/

/*
알고 넘어가는 용어 정리

**제어자(Modifier)**
- `public` , `static` 과 같은 부분이다. 제어자는 뒤에서 설명한다. 지금은 항상 `public static` 키워드를 입력하자.

**반환 타입(Return Type)**
- 메서드가 실행 된 후 반환하는 데이터의 타입을 지정한다. 메서드가 값을 반환하지 않는 경우, 없다는 뜻의 `void` 를 사용해야 한다.
- 예) `void print(String str)`

**메서드 이름(Method Name)**
- 메서드의 이름이다. 이 이름은 메서드를 호출하는 데 사용된다.

**매개변수(Parameter)**
- 입력 값으로, 메서드 내부에서 사용할 수 있는 변수이다. 매개변수는 옵션이다.
- 입력값이 필요 없는 메서드는 매개변수를 지정하지 않아도 된다. 예) `add()`

**메서드 본문(Method Body)**
- 실제 메서드의 코드가 위치한다. 중괄호 `{}` 사이에 코드를 작성한다.
*/
public class Method2 {
    public static void main(String[] args) {

        // printHeader()` , `printFooter()` 메서드는 매개변수가 없고, 반환 타입도 없다.

        /*
        void와 return 생략**
        - 모든 메서드는 항상 `return` 을 호출해야 한다.
        - 그런데 반환 타입 `void` 의 경우에는 예외로 `printFooter()` 와 같이 생략해도 된다.
        - 자바가 반환 타입이 없는 경우에는 `return` 을 마지막줄에 넣어준다.
        -> 참고로 `return` 을 만나면 해당 메서드는 종료된다.
        */
        printHeader();
        System.out.println("프로그램이 동작합니다.");
        printFooter();
    }

    public static void printHeader() {
        System.out.println("= 프로그램을 시작합니다 =");
        return; //void의 경우 생략 가능
    }

    public static void printFooter() {
        System.out.println("= 프로그램을 종료합니다 =");
    }
}
