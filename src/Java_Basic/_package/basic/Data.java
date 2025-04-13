package Java_Basic._package.basic;

/**
 * 패키지 예제를 위한 기본 데이터 클래스
 * 
 * 주요 특징:
 * 1. 패키지 선언: 이 클래스는 Java_Basic._package.basic 패키지에 속함
 * 2. 접근 제어: public, private, package-private 멤버를 포함
 * 3. 캡슐화: private 필드와 public 메서드를 통한 접근
 */
public class Data {
    private String name;        // private 필드
    int value;                 // package-private 필드

    // public 생성자
    public Data(String name, int value) {
        this.name = name;
        this.value = value;
    }

    // public 메서드
    public void publicMethod() {
        System.out.println("[public method] 이름: " + name + ", 값: " + value);
    }

    // package-private 메서드
    void packagePrivateMethod() {
        System.out.println("[package-private method] 같은 패키지에서만 접근 가능");
    }

    // private 메서드
    private void privateMethod() {
        System.out.println("[private method] 같은 클래스에서만 접근 가능");
    }

    // getter/setter
    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
} 