package access;

/*
Speak 객체를 사용하는 사용자는 Speaker의 volume 필드와 메서드에 모두 접근할 수 있다.
volumeUp()과 같은 메서드를 만들어서 음량이 100을 넘지 못하도록 기능을 개발했지만 소용이 없다.
-> Speaker를 사용하는 입장에서는 volume 필드에 직접 접근해서 원하는 값을 설정할 수 있기 때문이다.
* */
public class Speaker {  // 클래스 레벨

    // private설정으로 위 문제를 해결한다.
    // -> private의 경우 해당 클래스 내부에서만 호출할 수 있다.
    private int volume; // 필드

    public Speaker(int volume) { // 생성자
        this.volume = volume;
    }

    public void volumeUp() { // 메서드
        if(volume >= 100) {
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
            return;
        }
            volume += 10;
        System.out.println("음량을 10 증가합니다.");
    }

    public void volumeDown() { // 메서드
        volume -= 10;
        System.out.println("volumeDown 호출");
    }

    public void showVolume() { // 메서드
        System.out.println("현재 음량: " + volume);
    }
}
