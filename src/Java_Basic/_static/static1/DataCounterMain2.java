// TIL - static 변수 1
package Java_Basic._static.static1;

public class DataCounterMain2 {


    /*
    Data2 인스턴스를 생성하면 생성자를 통해 Counter 인스턴스에 있는 count 값을 하나 증가시킨다.
    count값은 1, 2, 3 점차 증가된다.

    결과적으로, Data2의 인스턴스가 3개 생성되고, count 값도 인스턴스 숫자와 같은 3으로 정확하게 측저된다.

    그런데 여기에는 약간 불편한 점들이 있다.
    - Data2 클래스와 관련된 일인데, Counter라는 별도의 클래스를 추가로 사용해야 한다.
    - 생성자의 매개변수도 추가되고, 생성자가 복잡해진다. 생성자를 호출하는 부분도 복잡해진다.
    * */
    public static void main(String[] args) {
        Counter counter = new Counter();
        Data2 data1 = new Data2("A", counter);
        System.out.println("A count=" + counter.count);

        Data2 data2 = new Data2("B", counter);
        System.out.println("B count=" + counter.count);

        Data2 data3 = new Data2("C", counter);
        System.out.println("C count=" + counter.count);
    }
}
