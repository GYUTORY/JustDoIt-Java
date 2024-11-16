package enumeration.ex2;

public class ClassGradeEx2_1 {

    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();

        discountService.discount(ClassGrade.GOLD, 1000);
        discountService.discount(ClassGrade.BASIC, 2000);
        discountService.discount(ClassGrade.DIAMOND, 3000);
    }
}
