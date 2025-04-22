package Java_Basic.poly.exercise.payment.advanced;

/**
 * 모바일 결제 구현체
 */
public class MobilePayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("모바일 결제 처리중...");
        System.out.println(amount + "원 모바일 결제가 완료되었습니다.");
    }
} 