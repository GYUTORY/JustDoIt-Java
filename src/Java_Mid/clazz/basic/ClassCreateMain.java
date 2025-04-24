package Java_Mid.clazz.basic;

import Java_Mid.clazz.example.Hello;

/**
 * Class 객체를 사용하여 동적으로 인스턴스를 생성하는 예제
 */
public class ClassCreateMain {
    public static void main(String[] args) throws Exception {
        // 1. Class 객체 획득 방법
        Class<?> helloClass = Hello.class;
        // Class<?> helloClass = Class.forName("Java_Mid.clazz.example.Hello");

        // 2. Class 객체로부터 새로운 인스턴스 생성
        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
        
        // 3. 생성된 인스턴스의 메서드 호출
        String result = hello.hello();
        System.out.println("result = " + result);
    }
}
