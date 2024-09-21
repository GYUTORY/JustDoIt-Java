package extends1.super2;

public class Super2Main {
    public static void main(String[] args) {
        // ClassA -> ClassB -> ClassC의 순서로 실행된다.
        // 초기화는 최상위 부모부터 이루어진다.
        // -> 자식 생성자의 첫줄에서 부모 생성자를 호출해야 하기 때문이다.
        ClassC classC = new ClassC();
    }
}
