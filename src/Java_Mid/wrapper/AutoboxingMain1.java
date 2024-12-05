// #오토박싱 #autoboxing
package Java_Mid.wrapper;

public class AutoboxingMain1 {

    public static void main(String[] args) {
        //Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = Integer.valueOf(value); // 오토 박싱(Auto-Boxing)

        // Wrapper -> Primitive
        int unboxedValue = boxedValue.intValue(); // 오토 언박싱(Auto-Unboxing)

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
