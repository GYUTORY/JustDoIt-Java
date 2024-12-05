// #Java #wrapper #wrapper class #wrapper 클래스 #박싱 #Boxing #언박싱 #Unboxing

package Java_Mid.wrapper;

public class WrapperClassMain {


    /*
    @deprecated  -> 앞으로 사라질 예정이니, 사용하지 말라는 어노테이션임.
    **/
    public static void main(String[] args) {
        Integer newInteger = new Integer(10); // 미래에 삭제 예정, 대신에 valueOf() 사용
        // Integer newInteger = Integer.valueOf(10); // 이거랑 아래꺼랑 비교하면 미리 생성해둔거여서 == 비교해도 true 나옴.

        Integer integerObj = Integer.valueOf(10); // -128 ~ 127 자주 사용하는 숫자 값 재사용, 불변 --> 위에꺼보다 훨씬 효율적임
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(100);

        System.out.println("newIntger = " +newInteger);
        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        // 내부 값 읽기
        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue();
        System.out.println("intValue = " + intValue);
        long longValue = longObj.longValue();
        System.out.println("longValue = " + longValue);

        System.out.println("비교");
        System.out.println("==: " + (newInteger == integerObj));
        System.out.println("Java_Basic.equals: " + (newInteger.equals(integerObj)));

    }
}
