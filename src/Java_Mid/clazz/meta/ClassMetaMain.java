package Java_Mid.clazz.meta;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 클래스의 메타데이터를 조회하는 예제
 */
public class ClassMetaMain {
    public static void main(String[] args) throws Exception {
        // 1. Class 객체 획득 방법
        Class<?> clazz = String.class;                           // 방법 1: 클래스에서 직접 조회
        // Class<?> clazz = new String().getClass();            // 방법 2: 인스턴스에서 조회
        // Class<?> clazz = Class.forName("java.lang.String"); // 방법 3: 문자열로 조회

        System.out.println("=== 필드 정보 ===");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(String.format("필드: %s %s",
                field.getType().getSimpleName(),
                field.getName()));
        }

        System.out.println("\n=== 메서드 정보 ===");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(String.format("메서드: %s %s",
                method.getReturnType().getSimpleName(),
                method.getName()));
        }

        System.out.println("\n=== 상속 정보 ===");
        System.out.println("상위 클래스: " + clazz.getSuperclass().getSimpleName());

        System.out.println("\n=== 인터페이스 정보 ===");
        Class<?>[] interfaces = clazz.getInterfaces();
        for (Class<?> i : interfaces) {
            System.out.println("인터페이스: " + i.getSimpleName());
        }
    }
}
