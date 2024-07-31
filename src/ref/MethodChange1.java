package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전: a = " + a); // 10
        // 1. 메서드 호출, 값 전달 : 10
        changPrimitive(a);
        System.out.println("메서드 호출 전: a = " + a); // 10
    }

    // 메서드 안에서 값을 변경
    // 결과적으로 x의 값만 20으로 변경되고, a의 값을 10으로 유지된다.
    public static void changPrimitive(int x) {
        x = 20;
    }
}
