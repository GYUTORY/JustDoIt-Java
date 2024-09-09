// TIL - final 변수와 참조

package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        // 참조형 변수 data에 final이 붙었다.
        // 변수 선업 시점에 참조값을 당했으므로 더는 참조값을 변경할 수 없다.
        final Data data = new Data(); // 참조형

        // 참조 대상의 값은 변경 가능
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}
