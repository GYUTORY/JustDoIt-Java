package Java_Basic.oop.construct;

/**
 * 생성자(Constructor) 예제
 */
public class ConstructorExample {
    private String name;
    private int age;
    private String address;

    // 기본 생성자
    public ConstructorExample() {
        System.out.println("기본 생성자 호출");
    }

    // 매개변수가 있는 생성자
    public ConstructorExample(String name) {
        this.name = name;
        System.out.println("이름만 받는 생성자 호출");
    }

    // 매개변수가 2개인 생성자
    public ConstructorExample(String name, int age) {
        this(name);    // 다른 생성자 호출
        this.age = age;
        System.out.println("이름과 나이를 받는 생성자 호출");
    }

    // 매개변수가 3개인 생성자
    public ConstructorExample(String name, int age, String address) {
        this(name, age);    // 다른 생성자 호출
        this.address = address;
        System.out.println("모든 필드를 받는 생성자 호출");
    }

    public void showInfo() {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("주소: " + address);
    }

    public static void main(String[] args) {
        System.out.println("1. 기본 생성자");
        ConstructorExample ex1 = new ConstructorExample();
        System.out.println();

        System.out.println("2. 이름만 받는 생성자");
        ConstructorExample ex2 = new ConstructorExample("홍길동");
        System.out.println();

        System.out.println("3. 이름과 나이를 받는 생성자");
        ConstructorExample ex3 = new ConstructorExample("김철수", 25);
        System.out.println();

        System.out.println("4. 모든 필드를 받는 생성자");
        ConstructorExample ex4 = new ConstructorExample("이영희", 30, "서울시");
        ex4.showInfo();
    }
} 