package Java_Basic.oop.access;

/**
 * 접근 제어자(Access Modifier) 예제
 */
public class AccessExample {
    public String publicField = "누구나 접근 가능";
    protected String protectedField = "같은 패키지 또는 자식 클래스에서 접근 가능";
    String defaultField = "같은 패키지에서만 접근 가능";
    private String privateField = "같은 클래스에서만 접근 가능";

    public void showFields() {
        System.out.println("Public: " + publicField);
        System.out.println("Protected: " + protectedField);
        System.out.println("Default: " + defaultField);
        System.out.println("Private: " + privateField);
    }

    public static void main(String[] args) {
        AccessExample example = new AccessExample();
        example.showFields();
    }
} 