package Java_Basic.poly.exercise.payment.advanced;

/**
 * 카드 결제 구현체
 */
public class CardPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("카드 결제 처리중...");
        System.out.println(amount + "원 카드 결제가 완료되었습니다.");
    }
} 