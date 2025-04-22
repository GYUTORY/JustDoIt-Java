package Java_Basic.poly.exercise.message;

/**
 * 다형성을 활용한 메시지 전송 시스템 예제
 */
public class SendMain {
    public static void main(String[] args) {
        // 이메일 발송
        Sender emailSender = new EmailSender("user@example.com");
        emailSender.sendMessage("이메일 테스트 메시지");
        
        // SMS 발송
        Sender smsSender = new SmsSender("010-1234-5678");
        smsSender.sendMessage("SMS 테스트 메시지");
        
        // 페이스북 메시지 발송
        Sender facebookSender = new FaceBookSender("사용자ID");
        facebookSender.sendMessage("페이스북 테스트 메시지");
    }
} 