package Java_Basic.poly.exercise.payment.basic;

/**
 * 결제 서비스 클래스
 */
public class PayService {
    public void processPay(String payMethod, int amount) {
        System.out.println("결제를 시작합니다: 결제 수단=" + payMethod + ", 금액=" + amount);
        
        switch (payMethod) {
            case "CARD":
                System.out.println("카드 결제 처리중...");
                System.out.println(amount + "원 카드 결제가 완료되었습니다.");
                break;
            case "CASH":
                System.out.println("현금 결제 처리중...");
                System.out.println(amount + "원 현금 결제가 완료되었습니다.");
                break;
            default:
                System.out.println("지원하지 않는 결제 수단입니다.");
        }
        
        System.out.println("결제가 종료되었습니다.\n");
    }
} 