// TIL - 인터페이스

package Java_Basic.poly.ex5;

// implements : 구현
// extends : 상속
public class Cat implements InterfaceAnimal {
    @Override
    public void sound() {
        System.out.println("야옹");
    }

    @Override
    public void move() {
        System.out.println("고양이 이동");
    }
}
