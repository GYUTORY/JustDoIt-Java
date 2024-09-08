// TIL - static method 2

package static2;

import static static2.DecoData.staticCall;

public class DecoDataMain {

    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DecoData.staticCall();

        staticCall(); // class 명을 쓸 때는, 위에처럼 매번 불편할 수 있기에 import 하여서ㅅ ㅅ느는게 좋지
        staticCall();
        staticCall();
        staticCall();

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출1");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        //추가
        //인스턴스를 통한 접근
        // 정적 메서드의 경우 인스턴스를 통한 접근은 추천하지 않는다.
        // --> 왜냐하면 코드를 읽을 때 마치 인스턴스 메서드에 접근하는 것 처럼 오해할 수 있기 때문이다.
        // ----> Static member 'static2.DecoData.staticCall()' accessed via instance reference
        DecoData data3 = new DecoData();
        staticCall();

        //클래스를 통한 접근
        // 정적 메서드는 클래스에서 공용으로 관리하기 때문에 클래스를 통해서 접근하는 것이 더 명확하다.
        // --> 따라서 정적 메서드에 접근할 때는 클래스를 통해서 접근하자.
        staticCall();
    }
}
