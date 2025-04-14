package Java_Basic.access.example.speaker;

public class SpeakerMain {
    public static void main(String[] args) {
        // 스피커 생성
        Speaker speaker = new Speaker(50);  // 초기 볼륨 50으로 설정
        
        // 볼륨 조절 테스트
        speaker.volumeUp();  // 51
        speaker.volumeUp();  // 52
        
        // 볼륨 직접 설정
        speaker.setVolume(80);  // 정상 케이스
        speaker.setVolume(150); // 범위 초과 케이스
        
        // 음소거 테스트
        System.out.println("현재 볼륨: " + speaker.getVolume());
        speaker.mute();
        System.out.println("음소거 시 볼륨: " + speaker.getVolume());
        speaker.mute();
        System.out.println("음소거 해제 후 볼륨: " + speaker.getVolume());
        
        // private 필드 직접 접근 시도 (컴파일 에러)
        // speaker.volume = 200;  // ❌ private 필드 접근 불가
        // speaker.isMuted = true;  // ❌ private 필드 접근 불가
    }
}
