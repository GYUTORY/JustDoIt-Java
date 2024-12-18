// #ENUM이 필요한 이유 #열거형 #일관성 #타입 안정성

package Java_Mid.enumeration.ex1;

public class StringGradeEx1_2 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        // 존재하지 않는 등급
        int vip = discountService.discount("VIP", price);
        System.out.println("VIP 등급의 할인 금액: " + vip);

        // 오타
        int diamondd = discountService.discount("DIAMONDD", price);
        System.out.println("DIAMONDD 등급의 할인 금액: " + diamondd);

        // 소문자 입력
        int gold2 = discountService.discount("gold", price);
        System.out.println("gold 등급의 할인 금액: " + gold2);
    }
}