// TIl - statics 변수 2

package Java_Basic._static.static1.counter;

/**
 * static 변수를 사용한 카운터 예제 클래스
 * 모든 인스턴스가 공유하는 static count 변수를 통해
 * 전체 인스턴스의 개수를 정확히 추적할 수 있음
 */
public class Data3 {
    public String name;        // 인스턴스의 이름
    
    /**
     * 모든 Data3 인스턴스가 공유하는 카운터
     * - static 변수는 메서드 영역에서 관리됨
     * - 인스턴스 영역이 아닌 클래스 자체에 속함
     * - 모든 인스턴스가 같은 값을 공유
     */
    public static int count;   // 전체 인스턴스 개수를 추적하는 static 카운터

    /**
     * 새로운 Data3 인스턴스를 생성하고 공유 카운터를 증가시킴
     * @param name 인스턴스의 이름
     */
    public Data3(String name) {
        this.name = name;
        count++;              // static 카운터를 증가시켜 전체 인스턴스 개수 추적
    }
}
