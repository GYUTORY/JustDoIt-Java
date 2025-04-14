// TIl - statics 변수 2

package Java_Basic._static.static1.counter;

/**
 * static 변수를 사용한 개선된 카운터 예제
 * static 변수를 통해 모든 인스턴스가 카운터를 공유
 */
public class DataCountMain3 {
    public static void main(String[] args) {
        // static 변수는 클래스를 통해 직접 접근 가능
        Data3 data1 = new Data3("A");
        System.out.println("A count=" + Data3.count);  // count = 1

        Data3 data2 = new Data3("B");
        System.out.println("B count=" + Data3.count);  // count = 2

        Data3 data3 = new Data3("C");
        System.out.println("C count=" + Data3.count);  // count = 3

        // static 변수는 인스턴스를 통해서도 접근 가능하지만 권장되지 않음
        Data3 data4 = new Data3("D");
        System.out.println("D count=" + data4.count);  // count = 4 (인스턴스 접근, 비권장)
        
        // static 변수는 항상 클래스를 통해 접근하는 것이 좋음
        System.out.println("전체 count=" + Data3.count);  // count = 4 (클래스 접근, 권장)
    }
}
