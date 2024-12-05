package Java_Mid.string.test;

public class TestString9 {

    public static void main(String[] args) {
        String email = "hello@example.com";

        String[] splitStr = email.split("@");

        String idData = splitStr[0];
        String domainData = splitStr[1];
        System.out.println("ID : " + idData);
        System.out.println("Domain : " + domainData);

    }
}
