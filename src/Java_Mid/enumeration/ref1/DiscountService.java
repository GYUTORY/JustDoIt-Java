// #열거형이 만들어진 이유
package Java_Mid.enumeration.ref1;

public class DiscountService {

    public int discount(ClassGrade classGrade, int price) {
        return price * classGrade.getDiscountPercent() / 100;

    }
}
