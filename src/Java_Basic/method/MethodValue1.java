package Java_Basic.method;


/***
 * 너무 단순하지만, 정리하고 넘어감
 * 해당 Method는 Call By Value를 의미함
 *
 추가 정리
 기본 타입(Primitive Types)
 - 값이 복사되어 전달됩니다. 이를 "Call by Value"라고 합니다.
 참조형 타입(Reference Types)
 - 객체의 참조가 복사되어 전달됩니다. 메서드 내에서 참조된 객체의 상태를 변경할 수 있습니다.
 - 이는 마치 "Call by Reference"처럼 동작하지만, 실제로는 객체의 참조가 값으로 전달되기 때문에 "Call by Value"입니다.
 */
public class MethodValue1 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1. changeNumber 호출 전, num1: " + num1); // 5
        changeNumber(num1);
        System.out.println("4. changeNumber 호출 후, num1: " + num1); // 5
    }

    public static void changeNumber(int num2) {
        System.out.println("2. changeNumber 변경 전, num2: " + num2); // 5
        num2 = num2 * 2;
        System.out.println("3. changeNumber 변경 후, num2: " + num2); // 10
    }
}
