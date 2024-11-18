// #열거형이 만들어진 이유
package enumeration.ref2;


public class DiscountService {
    public int discount(Grade grade, int price) {
        return price * grade.getDiscountPercent() / 100;
    }
}
