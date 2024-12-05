package Java_Basic.method;


/***
 * 메서드 호출과 값 반환받기3
 * 그렇다면 메서드를 사용해서 값을 변경하려면 어떻게 해야할까? 메서드의 호출 결과를 반환 받아서 사용하면 된다.
 */
public class MethodValue3 {

    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("changeNumber 호출 전, num1: " + num1); // 출력: 5
        num1 = changeNumber(num1);
        System.out.println("changeNumber 호출 후, num1: " + num1); // 출력: 10
    }


    public static int changeNumber(int num2) {
        num2 = num2 * 2;
        return num2;
    }
}
