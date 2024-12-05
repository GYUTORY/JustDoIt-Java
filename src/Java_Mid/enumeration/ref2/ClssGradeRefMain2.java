package Java_Mid.enumeration.ref2;


public class ClssGradeRefMain2 {

    public static void main(String[] args) {
        DiscountService discountService = new DiscountService();

        int basic = discountService.discount(Grade.BASIC, 2000);
        int gold = discountService.discount(Grade.GOLD, 1000);
        int diamond = discountService.discount(Grade.DIAMOND, 3000);

        System.out.println("BASIC 등급의 할인 금액: " + basic);
        System.out.println("GOLD 등급의 할인 금액: " + gold);
        System.out.println("DIAMOND 등급의 할인 금액: " + diamond);
    }
}
