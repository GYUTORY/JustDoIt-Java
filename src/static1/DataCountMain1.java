// TIL- Static 변수 1

package static1;

public class DataCountMain1 {


    // 인스턴스에 사용되는 멤버 변수 count 값은 인턴스끼리 서로 공유되지 않는다.
    // 따라서 원하는 답을 구할 수 없다. 이 문제를 해결하기 위해서는 데이터를 서로 공유해야 한다.
    public static void main(String[] args) {
        Data1 data1 = new Data1("A");
        System.out.println("A count = " + data1.count);

        Data1 data2 = new Data1("B");
        System.out.println("B count = " + data2.count);

        Data1 data3 = new Data1("C");
        System.out.println("B count = " + data3.count);

    }
}
