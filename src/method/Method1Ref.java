package method;

public class Method1Ref {
    public static void main(String[] args) {
        // 계산1
        int sum1 = add(5, 10);
        System.out.println("결과1 출력:" + sum1);

        // 계산2
        int sum2 = add(15, 20);
        System.out.println("결과2 출력:" + sum2);
    }

    //add 메서드
    //메서드의 선언 부분으로, 메서드 이름, 반환 타입, 매개변수(파라미터) 목록을 포함한다.
    //이름 그대로 이런 메서드가 있다고 선언하는 것이다. 메서드 선언 정보를 통해 다른 곳에서 해당 메서드를 호출할 수 있다.

    //public static
    //`public` : 다른 클래스에서 호출할 수 있는 메서드라는 뜻이다. 접근 제어에서 학습한다.
    //`static` : 객체를 생성하지 않고 호출할 수 있는 정적 메서드라는 뜻이다. 자세한 내용은 뒤에서 다룬다.
    // 두 키워드의 자세한 내용은 뒤에서 다룬다. 지금은 단순하게 메서드를 만들 때 둘을 사용해야 한다고 생각하자.

    // 메서드 선언(Method Declaration)**
    public static int add(int a, int b)

    // **메서드 본문(Method Body)**
    // - 메서드가 수행해야 하는 코드 블록이다.
    // -메서드를 호출하면 메서드 본문이 순서대로 실행된다.
    // - 메서드 본문은 블랙박스이다. **메서드를 호출하는 곳에서는 메서드 선언은 알지만 메서드 본문은 모른다.** 메서드의 실행 결과를 반환하려면 `return` 문을 사용해야 한다.
    // `return` 문 다음에 반환할 결과를 적어주면 된다. > `return sum` : `sum` 변수에 들어있는 값을 반환한다.

    // 메서드 호출이 끝나면 더 이상 해당 메서드가 사용한 메모리를 낭비할 이유가 없다.
    // 메서드 호출이 끝나면 메서드 정의 에사용한파라미터변수인 `int a` , `int b` 는 물론이고,그 안에서 정의한 `int sum`도 모두 제거된다.
    {
        System.out.println(a + "+" + b + " 연산 수행");
        int sum = a + b;
        return sum;
    }
}
