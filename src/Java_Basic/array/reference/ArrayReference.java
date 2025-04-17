package Java_Basic.array.reference;

/**
 * 배열의 참조와 복사 예제
 */
public class ArrayReference {
    public static void main(String[] args) {
        // 1. 배열 참조
        int[] original = {1, 2, 3};
        int[] reference = original;  // 참조 복사
        
        System.out.println("1. 배열 참조");
        System.out.print("원본 배열: ");
        printArray(original);
        System.out.print("참조 배열: ");
        printArray(reference);
        
        // 참조된 배열의 값 변경
        reference[0] = 10;
        System.out.println("\n참조 배열의 값 변경 후");
        System.out.print("원본 배열: ");
        printArray(original);
        System.out.print("참조 배열: ");
        printArray(reference);
        
        // 2. 배열 복사
        int[] copy = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }
        
        System.out.println("\n2. 배열 복사");
        System.out.print("원본 배열: ");
        printArray(original);
        System.out.print("복사 배열: ");
        printArray(copy);
        
        // 복사된 배열의 값 변경
        copy[0] = 20;
        System.out.println("\n복사 배열의 값 변경 후");
        System.out.print("원본 배열: ");
        printArray(original);
        System.out.print("복사 배열: ");
        printArray(copy);
    }
    
    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) System.out.print(", ");
            System.out.print(arr[i]);
        }
        System.out.println();
    }
} 