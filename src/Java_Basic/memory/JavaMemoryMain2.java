// TIL - 스택 영역과 힙 영역

package Java_Basic.memory;

public class JavaMemoryMain2 {
    public static void main(String[] args) {
        System.out.println("main start");
        method1();
        // main으로 돌아오면서, 힙 영역에 있는 참조값은 GC에 의해 제거된다.
        System.out.println("main end");
    }

    static void method1() {
        System.out.println("method1 start");
        // 힙 영역에 Data 인스턴스를 생성한다. 그리고 참조값을 data1에 보관한다.
        Data data1 = new Data(10);
        // Data data2 매개변수에 참조값을 넘긴다. --> 같은 인스턴스를 참조
        method2(data1);
        System.out.println("method1 end");
    }

    static void method2(Data data2) {
        System.out.println("method2 start");
        System.out.println("data.value=" + data2.getValue());
        System.out.println("method2 end");
    }
}
