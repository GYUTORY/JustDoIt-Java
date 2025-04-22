package Java_Basic.poly.exercise.message;

/**
 * 페이스북을 통해 메시지를 전송하는 구현체
 */
public class FaceBookSender implements Sender {
    private String userId;

    public FaceBookSender(String userId) {
        this.userId = userId;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("페이스북 발송: " + userId);
        System.out.println("메시지: " + message);
    }
} 