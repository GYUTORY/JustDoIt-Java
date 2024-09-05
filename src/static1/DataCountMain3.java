// TIl - statics 변수 2

package static1;

public class DataCountMain3 {
    public static void main(String[] args) {

        // 코드를 보면 count 정적 변수에 접근하는 방법이 조급 특이한데 Data3.count와 같이 클래스명에 .dot을 사용한다.
        // -> 마치 클래스를 사용하는거처럼 느껴진다.
        Data3 data1 = new Data3("A");
        System.out.println("A count=" + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("C count=" + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count=" + Data3.count);


    }
}
