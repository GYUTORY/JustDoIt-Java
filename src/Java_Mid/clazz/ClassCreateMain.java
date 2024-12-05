package Java_Mid.clazz;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception {
        Class helloClass = Hello.class;
        // Class helloClass = helloClass.forName("Java_Mid.clazz.Hello");

        // getDeclaredConstructor() -> 생성자를 선택
        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
        String result = hello.hello();
        System.out.println("result = " + result);


    }
}
