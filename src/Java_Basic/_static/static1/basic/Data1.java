// TIL- Static 변수 1

package Java_Basic._static.static1.basic;

/**
 * 인스턴스 변수를 사용한 카운터 예제 클래스
 * 각 인스턴스마다 독립적인 count 값을 가지므로,
 * 전체 인스턴스의 개수를 정확히 파악할 수 없음
 */
public class Data1 {
    public String name;    // 인스턴스의 이름
    public int count;      // 인스턴스별 독립적인 카운터

    /**
     * 새로운 Data1 인스턴스를 생성하고 카운터를 증가시킴
     * @param name 인스턴스의 이름
     */
    public Data1(String name) {
        this.name = name;
        count++;          // 해당 인스턴스의 카운터만 증가
    }
}
