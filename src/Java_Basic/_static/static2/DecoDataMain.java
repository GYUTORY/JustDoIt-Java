// TIL - static Java_Basic.method 2

package Java_Basic._static.static2;

import static Java_Basic._static.static2.decorator.DecoData.staticCall;
import Java_Basic._static.static2.decorator.DecoData;

public class DecoDataMain {

    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DecoData.staticCall();

        staticCall(); // 정적 임포트로 인해 클래스 이름 없이 직접 호출 가능
        staticCall();
        staticCall();
        staticCall();

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        // 인스턴스를 통한 접근
        // 정적 메서드의 경우 인스턴스를 통한 접근은 추천하지 않음
        // 코드를 읽을 때 마치 인스턴스 메서드에 접근하는 것처럼 오해할 수 있음
        DecoData data3 = new DecoData();
        staticCall();

        // 클래스를 통한 접근
        // 정적 메서드는 클래스에서 공용으로 관리하기 때문에 클래스를 통해서 접근하는 것이 더 명확함
        DecoData.staticCall();
    }
}
