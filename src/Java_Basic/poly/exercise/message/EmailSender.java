package Java_Basic.poly.exercise.message;

/**
 * 이메일을 통해 메시지를 전송하는 구현체
 */
public class EmailSender implements Sender {
    private String email;

    public EmailSender(String email) {
        this.email = email;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("이메일 발송: " + email);
        System.out.println("메시지: " + message);
    }
} 