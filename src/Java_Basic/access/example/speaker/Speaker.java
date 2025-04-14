package Java_Basic.access;

/**
 * Speaker 클래스는 접근 제어자를 활용한 캡슐화의 또 다른 예시입니다.
 * - private: 볼륨 상태는 외부에서 직접 접근할 수 없음
 * - public: 볼륨 조절 기능은 외부에서 접근 가능
 */
public class Speaker {
    public static final int MAX_VOLUME = 100;
    public static final int MIN_VOLUME = 0;
    
    private int volume;  // 현재 볼륨 (private으로 보호)
    private boolean isMuted;  // 음소거 상태 (private으로 보호)
    
    public Speaker(int initialVolume) {
        // 초기 볼륨 설정 시 validVolume 메서드로 검증
        setVolume(initialVolume);
        this.isMuted = false;
    }
    
    // public 메서드로 볼륨 증가 기능 제공
    public void volumeUp() {
        if (volume < MAX_VOLUME) {
            volume++;
            System.out.println("현재 볼륨: " + volume);
        } else {
            System.out.println("최대 볼륨입니다.");
        }
    }
    
    // public 메서드로 볼륨 감소 기능 제공
    public void volumeDown() {
        if (volume > MIN_VOLUME) {
            volume--;
            System.out.println("현재 볼륨: " + volume);
        } else {
            System.out.println("최소 볼륨입니다.");
        }
    }
    
    // public 메서드로 볼륨 설정 기능 제공
    public void setVolume(int volume) {
        if (validVolume(volume)) {
            this.volume = volume;
            System.out.println("볼륨이 " + volume + "로 설정되었습니다.");
        } else {
            System.out.println("유효하지 않은 볼륨입니다. (" + MIN_VOLUME + "~" + MAX_VOLUME + ")");
        }
    }
    
    // public 메서드로 음소거 기능 제공
    public void mute() {
        isMuted = !isMuted;
        System.out.println(isMuted ? "음소거 되었습니다." : "음소거가 해제되었습니다.");
    }
    
    // public 메서드로 현재 볼륨 확인 기능 제공
    public int getVolume() {
        return isMuted ? 0 : volume;
    }
    
    // private 메서드로 볼륨 유효성 검사
    private boolean validVolume(int volume) {
        return volume >= MIN_VOLUME && volume <= MAX_VOLUME;
    }
}
