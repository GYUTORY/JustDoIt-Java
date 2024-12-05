// TIL - 불변객체 값 변경

package Java_Mid.immutable.change;

public class MutablaMain {
    public static void main(String[] args) {
        MutableObj obj = new MutableObj(10);
        obj.add(20);

        // 계산 이후의 기존 값은 사라짐
        System.out.println("obj = " + obj.getValue());
    }
}
