package Java_Basic._package.sub.b;

/**
 * 하위 패키지 B의 데이터 클래스
 */
public class BData {
    private String name;

    public BData(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("=== B 패키지 데이터 ===");
        System.out.println("이름: " + name);
        System.out.println("패키지: " + this.getClass().getPackage().getName());
    }
} 