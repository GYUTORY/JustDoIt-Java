package Java_Basic.access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        //필드에 직접 접근
        System.out.println("volume 필드 직접 접근 수정");
        // -> volume의 값이 private이기에 접근이 불가능
        // speaker.volume = 200;
        speaker.showVolume();
    }
}
