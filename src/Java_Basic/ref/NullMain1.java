// TIL - null

package Java_Basic.ref;

public class NullMain1 {
    public static void main(String[] args) {
        // data 변수에는 아직 가리키는 객체가 없다.
        Data data = null;
        System.out.println("1. data = " + data);

        // 참조값을 할당 --> value는 0으로 할당
        data = new Data();
        System.out.println("2. data = " + data);

        // 다시 null을 할당
        data = null;
        System.out.println("3. data = " + data);
    }
}
