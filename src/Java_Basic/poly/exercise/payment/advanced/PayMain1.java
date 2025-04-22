package Java_Basic.poly.exercise.payment.advanced;

/**
 * 다형성을 활용한 결제 시스템 예제
 */
public class PayMain1 {
    public static void main(String[] args) {
        PayService payService = new PayService();

        // 카드 결제
        Payment cardPayment = new CardPayment();
        payService.processPay(cardPayment, 10000);

        // 현금 결제
        Payment cashPayment = new CashPayment();
        payService.processPay(cashPayment, 5000);

        // 모바일 결제
        Payment mobilePayment = new MobilePayment();
        payService.processPay(mobilePayment, 15000);
    }
} 