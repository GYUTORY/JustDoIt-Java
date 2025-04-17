package Java_Basic.array.dimension;

/**
 * 다차원 배열 예제
 */
public class MultiDimensionalArray {
    public static void main(String[] args) {
        // 2차원 배열 선언과 초기화
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // 2차원 배열 출력
        System.out.println("2차원 배열 출력:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        // 3차원 배열 선언과 초기화
        int[][][] cube = {
            {
                {1, 2},
                {3, 4}
            },
            {
                {5, 6},
                {7, 8}
            }
        };
        
        // 3차원 배열 출력
        System.out.println("\n3차원 배열 출력:");
        for (int i = 0; i < cube.length; i++) {
            System.out.println("층 " + i + ":");
            for (int j = 0; j < cube[i].length; j++) {
                for (int k = 0; k < cube[i][j].length; k++) {
                    System.out.print(cube[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        
        // 가변 길이 배열
        int[][] irregular = {
            {1},
            {2, 3},
            {4, 5, 6}
        };
        
        System.out.println("가변 길이 배열 출력:");
        for (int i = 0; i < irregular.length; i++) {
            for (int j = 0; j < irregular[i].length; j++) {
                System.out.print(irregular[i][j] + " ");
            }
            System.out.println();
        }
    }
} 