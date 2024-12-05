// #오토박싱 #autoboxing
package Java_Mid.wrapper;

public class AutoboxingMain2 {

    public static void main(String[] args) {
        //Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = value; // valueOf()는 컴파일 단계에서 추가

        // Wrapper -> Primitive
        int unboxedValue = boxedValue; // intValue()는 컴파일 단계에서 추가

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
