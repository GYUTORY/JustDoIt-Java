// TIL- Static 변수 1

package Java_Basic._static.static1.counter;

import Java_Basic._static.static1.basic.Data1;

/**
 * 인스턴스 변수를 사용한 카운터의 문제점을 보여주는 예제
 * 각 인스턴스가 독립적인 count 값을 가지므로 전체 개수를 추적할 수 없음
 */
public class DataCountMain1 {


    // 인스턴스에 사용되는 멤버 변수 count 값은 인턴스끼리 서로 공유되지 않는다.
    // 따라서 원하는 답을 구할 수 없다. 이 문제를 해결하기 위해서는 데이터를 서로 공유해야 한다.
    public static void main(String[] args) {
        // 각 인스턴스는 독립적인 count 값을 가짐
        Data1 data1 = new Data1("A");
        System.out.println("A count = " + data1.count);  // count = 1

        Data1 data2 = new Data1("B");
        System.out.println("B count = " + data2.count);  // count = 1

        Data1 data3 = new Data1("C");
        System.out.println("C count = " + data3.count);  // count = 1

        // 각 인스턴스의 count가 독립적이므로 전체 인스턴스 개수를 알 수 없음
        System.out.println("전체 인스턴스 수를 알 수 없음");
    }
}
