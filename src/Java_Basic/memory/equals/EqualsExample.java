package Java_Basic.memory.equals;

/**
 * equals()와 hashCode() 메서드 예제
 */
public class EqualsExample {
    private String name;
    private int age;

    public EqualsExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // equals() 메서드 오버라이드
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        EqualsExample that = (EqualsExample) obj;
        return age == that.age && 
               (name == null ? that.name == null : name.equals(that.name));
    }

    // hashCode() 메서드 오버라이드
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    public static void main(String[] args) {
        EqualsExample person1 = new EqualsExample("홍길동", 25);
        EqualsExample person2 = new EqualsExample("홍길동", 25);
        EqualsExample person3 = new EqualsExample("김철수", 25);

        // equals() 비교
        System.out.println("person1.equals(person2) = " + person1.equals(person2));  // true
        System.out.println("person1.equals(person3) = " + person1.equals(person3));  // false

        // hashCode() 비교
        System.out.println("person1 hashCode = " + person1.hashCode());
        System.out.println("person2 hashCode = " + person2.hashCode());
        System.out.println("person3 hashCode = " + person3.hashCode());

        // == 연산자 비교
        System.out.println("person1 == person2 = " + (person1 == person2));  // false
    }
} 