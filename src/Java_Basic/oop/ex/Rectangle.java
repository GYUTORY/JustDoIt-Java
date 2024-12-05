// TIL : 객체지향 프로그래밍 - 문제와 풀이

package Java_Basic.oop.ex;

public class Rectangle {
    int width = 5;
    int height = 8;



    int calcuateArea() {
        return width * height;
    }

    int calculatePerimeter() {
        return 2 * (width + height);
    }

    boolean isSquare() {
        return width == height;
    }
}
