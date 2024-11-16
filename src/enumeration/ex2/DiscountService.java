// #열거형이 만들어진 이유
package enumeration.ex2;

import static enumeration.ex2.ClassGrade.*;

public class DiscountService {

    // 매개변수로 ClassGrade 클래스를 사용
    public int discount(ClassGrade classGrade, int price) {
        int discountPercent = 0;

        if(classGrade == BASIC) {
            discountPercent = 10;
        } else if (classGrade == GOLD) {
            discountPercent = 20;
        }  else if (classGrade == DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println("할인X");
        }

        //10000 * (20 / 100) -> 2000원
        return price * discountPercent / 100;

    }
}
