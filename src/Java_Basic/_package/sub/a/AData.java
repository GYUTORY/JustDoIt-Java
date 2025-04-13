package Java_Basic._package.sub.a;

/**
 * 하위 패키지 A의 데이터 클래스
 */
public class AData {
    private String name;

    public AData(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("=== A 패키지 데이터 ===");
        System.out.println("이름: " + name);
        System.out.println("패키지: " + this.getClass().getPackage().getName());
    }
} 