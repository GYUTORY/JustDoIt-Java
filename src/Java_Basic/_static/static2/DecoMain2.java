// TIL - static 메서드 1

package Java_Basic._static.static2;

public class DecoMain2 {

    //
    public static void main(String[] args) {
        String s = "hello Java";

        System.out.println("before: " + s);
        System.out.println("after: " + DecoUtil2.desc(s));

    }
}
