// #열거형 #열거형클래스 #제약이 추가된 클래스

package Java_Mid.enumeration.ex3;

public class EnumRefMain {
    public static void main(String[] args) {
        System.out.println("class BASIC = " + Grade.BASIC.getClass());
        System.out.println("class GOLD = " + Grade.GOLD.getClass());
        System.out.println("class DIAMOND = " + Grade.DIAMOND.getClass());

        System.out.println("ref BASIC = " + refValue(Grade.BASIC));
        System.out.println("ref GOLD = " + refValue(Grade.GOLD));
        System.out.println("ref DIAMOND = " + refValue(Grade.DIAMOND));

    }

    // 열거형은 toString()을 재정의 하기 때문에 참조값을 직접 확인할 수 없다. 참조값을 구하기 위해 refValue()를 만들었댜.
    // - System.identityHashCode(grade) : 자바가 관리하는 객체의 참조값을 숫자로 반환한다.
    // - Integer.toHexString() : 숫자를 16진수로 변환, 우리가 일반적으로 확인하는 참조값은 16진수
    private static String refValue(Object grade) {
        // 참조값을 알기 위한 방법
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
