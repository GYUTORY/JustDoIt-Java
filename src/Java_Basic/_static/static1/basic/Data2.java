// TIl - static 변수 1

package Java_Basic._static.static1.basic;

/**
 * 외부 Counter 객체를 사용한 카운터 예제 클래스
 * 공유 Counter 객체를 통해 여러 인스턴스의 생성을 추적할 수 있음
 */
public class Data2 {
    public String name;    // 인스턴스의 이름

    /**
     * 새로운 Data2 인스턴스를 생성하고 공유 카운터를 증가시킴
     * @param name 인스턴스의 이름
     * @param counter 공유되는 Counter 객체
     */
    public Data2(String name, Counter counter) {
        this.name = name;
        counter.count++;   // 공유 Counter 객체의 카운트를 증가
    }
}
