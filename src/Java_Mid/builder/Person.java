package Java_Mid.builder;

/*
빌더 패턴(Builder Pattern)
- 복잡한 객체의 생성 과정과 표현 방법을 분리하여 다양한 구성의 인스턴스를 만드는 생성 패턴
- 생성자의 매개변수가 많을 때 유용하게 사용
- 객체 생성을 깔끔하고 유연하게 하기 위한 패턴

장점:
1. 필요한 데이터만 설정할 수 있음
2. 가독성이 좋음
3. 변경 가능성을 최소화
4. 불변성 확보

단점:
1. 코드가 길어짐
2. 빌더 클래스를 생성해야 함
*/

public class Person {
    // 필수 매개변수
    private final String name;
    private final int age;

    // 선택 매개변수
    private final String address;
    private final String phone;
    private final String email;

    private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
        this.phone = builder.phone;
        this.email = builder.email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class Builder {
        // 필수 매개변수
        private String name;
        private int age;

        // 선택 매개변수
        private String address;
        private String phone;
        private String email;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Person build() {
            // 필수 값 검증
            if (name == null || name.isEmpty()) {
                throw new IllegalStateException("이름은 필수 입력값입니다.");
            }
            if (age <= 0) {
                throw new IllegalStateException("나이는 0보다 커야 합니다.");
            }
            return new Person(this);
        }
    }
} 