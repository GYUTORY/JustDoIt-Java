package Java_Basic.poly.exercise.payment.advanced;

/**
 * 현금 결제 구현체
 */
public class CashPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("현금 결제 처리중...");
        System.out.println(amount + "원 현금 결제가 완료되었습니다.");
    }
} 