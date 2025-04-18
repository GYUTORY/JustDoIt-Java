package Java_Basic.casting.primitive;

/**
 * 기본형 타입의 형변환 예제
 */
public class PrimitiveCasting {
    public static void main(String[] args) {
        // 1. 자동 형변환 (묵시적 형변환)
        System.out.println("1. 자동 형변환");
        byte byteValue = 10;
        int intValue = byteValue;  // byte → int
        System.out.println("byte value: " + byteValue);
        System.out.println("int value: " + intValue);
        
        // 2. 자동 형변환 - 정수와 실수
        System.out.println("\n2. 정수와 실수의 자동 형변환");
        int num = 100;
        double doubleNum = num;    // int → double
        System.out.println("int num: " + num);
        System.out.println("double num: " + doubleNum);
        
        // 3. 강제 형변환 (명시적 형변환)
        System.out.println("\n3. 강제 형변환");
        double pi = 3.14;
        int intPi = (int) pi;      // double → int
        System.out.println("double pi: " + pi);
        System.out.println("int pi: " + intPi + " (소수점 손실)");
        
        // 4. 강제 형변환 - 데이터 손실
        System.out.println("\n4. 강제 형변환 - 데이터 손실");
        int bigNum = 1000;
        byte byteNum = (byte) bigNum;  // int → byte (데이터 손실)
        System.out.println("int value: " + bigNum);
        System.out.println("byte value: " + byteNum + " (데이터 손실 발생)");
        
        // 5. char와 int의 형변환
        System.out.println("\n5. char와 int의 형변환");
        char charA = 'A';
        int intA = charA;          // char → int (아스키 코드)
        System.out.println("char A: " + charA);
        System.out.println("int A: " + intA);
        
        int intB = 66;
        char charB = (char) intB;  // int → char
        System.out.println("int 66: " + intB);
        System.out.println("char 66: " + charB + " (ASCII 'B')");
    }
} 