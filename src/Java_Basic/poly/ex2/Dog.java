// TIL - 다형성 활용2

package Java_Basic.poly.ex2;

public class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}