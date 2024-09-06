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

        // 인스턴스를 통한 접근
        // -> 가져다 쓰는 입장에서, 추천되지 않음. 개발자에게 혼동의 여지를 발생시킨다.
        Data3 data4 = new Data3("D");
        System.out.println("D count=" + data4.count);

        // 클래스를 통한 접근
        System.out.println("D count=" + Data3.count);

    }
}
