package Java_Basic.poly.exercise.payment.basic;

/**
 * 결제 시스템 기본 예제
 */
public class PayMain0 {
    public static void main(String[] args) {
        PayService payService = new PayService();

        // 카드 결제
        String payMethod1 = "CARD";
        int amount1 = 10000;
        payService.processPay(payMethod1, amount1);

        // 현금 결제
        String payMethod2 = "CASH";
        int amount2 = 5000;
        payService.processPay(payMethod2, amount2);

        // 잘못된 결제 수단
        String payMethod3 = "INVALID";
        int amount3 = 15000;
        payService.processPay(payMethod3, amount3);
    }
} 