package Java_Mid.string.String_Builder;

public class LoopStringMain {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String result = "";

        // 반복문 루프 내부에서는 최적화가 되는 거 처럼 보이지만, 반복 횟수만큼 객체를 생성해야 한다.
        // 반복문 내에서의 문자열 연결은, 런타임에 연결할 문자열의 개수와 내용이 결정된다.
        // -> 따라서, 이런 상황에서는 최적화가 어렵다.
        for (int i = 0; i < 100000; i++) {
            result += "Hello Java ";
        }
        long endTime = System.currentTimeMillis();

        System.out.println("result = " + result);
        System.out.println("Java_Basic.time = " + (endTime - startTime) + "ms");
    }
}
