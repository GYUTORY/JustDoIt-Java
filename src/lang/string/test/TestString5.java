package lang.string.test;

public class TestString5 {

    public static void main(String[] args) {
        String str = "hello.txt";

        String fileName = str.substring(0, str.indexOf("."));
        String extName = str.substring(str.indexOf("."));

        System.out.println("filename = " + fileName);
        System.out.println("extName = " + extName);
    }
}
