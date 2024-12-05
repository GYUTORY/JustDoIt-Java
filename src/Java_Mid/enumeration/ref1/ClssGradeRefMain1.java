package Java_Mid.enumeration.ref1;


public class ClssGradeRefMain1 {

    public static void main(String[] args) {
        DiscountService discountService = new DiscountService();

        int gold = discountService.discount(ClassGrade.GOLD, 1000);
        int basic = discountService.discount(ClassGrade.BASIC, 2000);
        int diamond = discountService.discount(ClassGrade.DIAMOND, 3000);

        System.out.println("BASIC 등급의 할인 금액: " + basic);
        System.out.println("GOLD 등급의 할인 금액: " + gold);
        System.out.println("DIAMOND 등급의 할인 금액: " + diamond);
    }
}
