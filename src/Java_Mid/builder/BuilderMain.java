package Java_Mid.builder;

public class BuilderMain {
    public static void main(String[] args) {
        // 일반적인 객체 생성 방식
        Person person1 = new Person.Builder()
                .name("John")
                .age(30)
                .address("Seoul")
                .phone("010-1234-5678")
                .build();
        System.out.println("Person1: " + person1);

        // 필수 필드만 설정
        Person person2 = new Person.Builder()
                .name("Jane")
                .age(25)
                .build();
        System.out.println("Person2: " + person2);

        // 모든 필드 설정
        Person person3 = new Person.Builder()
                .name("Mike")
                .age(35)
                .address("Busan")
                .phone("010-9876-5432")
                .email("mike@example.com")
                .build();
        System.out.println("Person3: " + person3);
    }
} 