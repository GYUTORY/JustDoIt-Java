// TIL - static 변수 1
package Java_Basic._static.static1.counter;

import Java_Basic._static.static1.basic.Counter;
import Java_Basic._static.static1.basic.Data2;

/**
 * 공유 Counter 객체를 사용한 카운터 예제
 * 하나의 Counter 객체를 여러 Data2 인스턴스가 공유하여 전체 개수를 추적
 */
public class DataCounterMain2 {
    /**
     * Counter 객체를 통한 인스턴스 카운팅의 장단점
     * 
     * 장점:
     * - 정확한 인스턴스 개수 추적 가능
     * - Counter 객체를 통한 중앙 집중식 관리
     * 
     * 단점:
     * - 별도의 Counter 클래스 필요
     * - 생성자가 복잡해짐 (Counter 객체를 매개변수로 전달)
     * - Counter 객체를 항상 함께 관리해야 함
     */
    public static void main(String[] args) {
        Counter counter = new Counter();  // 공유할 Counter 객체 생성
        
        // 각 Data2 인스턴스 생성 시 같은 Counter 객체 전달
        Data2 data1 = new Data2("A", counter);
        System.out.println("A count=" + counter.count);  // count = 1

        Data2 data2 = new Data2("B", counter);
        System.out.println("B count=" + counter.count);  // count = 2

        Data2 data3 = new Data2("C", counter);
        System.out.println("C count=" + counter.count);  // count = 3
    }
}
