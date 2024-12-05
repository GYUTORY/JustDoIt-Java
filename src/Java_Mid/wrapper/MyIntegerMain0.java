// #기본형과 null #기본형에 null

package Java_Mid.wrapper;

public class MyIntegerMain0 {

    public static void main(String[] args) {
        int[] intArr = {-1, 0, 1, 2, 3};
        System.out.println(findValue(intArr, -1));
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100));
    }

    private static int findValue(int[] intArr, int target) {
        for (int value : intArr) {
            if(value == target) {
                return value;
            }
        }
        return -1;
    }
}
