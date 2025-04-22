package Java_Basic.poly.exercise.payment.advanced;

/**
 * 결제 서비스 클래스
 */
public class PayService {
    public void processPay(Payment payment, int amount) {
        System.out.println("결제를 시작합니다: 금액=" + amount);
        payment.pay(amount);
        System.out.println("결제가 종료되었습니다.\n");
    }
} 