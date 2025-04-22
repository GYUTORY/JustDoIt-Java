package Java_Basic.poly.exercise.message;

/**
 * SMS를 통해 메시지를 전송하는 구현체
 */
public class SmsSender implements Sender {
    private String phoneNumber;

    public SmsSender(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("SMS 발송: " + phoneNumber);
        System.out.println("메시지: " + message);
    }
} 