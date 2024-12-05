// TIL - 인터페이스

package Java_Basic.poly.ex5;


public class Caw implements InterfaceAnimal {
    @Override
    public void sound() {
        System.out.println("음매");
    }

    @Override
    public void move() {
        System.out.println("소 이동");
    }
}
