package Java_Mid.enumeration.ex3;

public class ClassGradeEx3_1 {

    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();

        discountService.discount(Grade.GOLD, 1000);
        discountService.discount(Grade.BASIC, 2000);
        discountService.discount(Grade.DIAMOND, 3000);

    }
}
