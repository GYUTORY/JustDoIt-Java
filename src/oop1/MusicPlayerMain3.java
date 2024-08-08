package oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        // 음악 플레이어 켜기
        on(data);
        //볼륨증가
        volumeUp(data);
        //볼륨증가
        volumeUp(data);
        //볼륨감소
        volumeDown(data);
        // 음악 플레이어 상태
        showStatus(data);
        // 음악 플레이어 끄기
        off(data);
    }

    /***
     * static 키워드는 클래스의 멤버(변수나 메서드)가 인스턴스가 아닌 클래스 자체에 속함을 나타냅니다. 즉, static으로 선언된 메서드는 클래스의 인스턴스를 생성하지 않고도 호출할 수 있습니다.
     *
     static을 사용하는 이유
     1. 메서드 호출의 용이성: MusicPlayerMain3 클래스의 main 메서드에서 on, off, volumeUp, volumeDown, showStatus 메서드를 호출할 때, 별도의 인스턴스를 생성할 필요 없이 클래스 이름을 통해 직접 호출할 수 있습니다. 이는 프로그램의 진입점인 main 메서드에서 다른 메서드를 쉽게 사용할 수 있게 해줍니다.
     2. 상태 공유: MusicPlayerData 객체를 메서드의 매개변수로 전달하여, 모든 static 메서드가 동일한 객체의 상태를 수정하고 확인할 수 있습니다. 이렇게 하면 각 메서드가 MusicPlayerData의 상태를 일관되게 관리할 수 있습니다.
     3. 유틸리티 메서드: static 메서드는 일반적으로 유틸리티 메서드로 사용되며, 특정 객체의 상태에 의존하지 않고 독립적으로 동작할 수 있습니다. 이 경우, MusicPlayerMain3 클래스의 메서드는 MusicPlayerData 객체의 상태를 변경하지만, 그 자체로는 객체의 상태를 가지지 않습니다.

     정리 : 결론적으로, static 키워드를 사용함으로써 코드의 구조를 단순화하고, 메서드 호출을 더 직관적으로 만들 수 있습니다.
     */
    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨:" + data.volume);
    }

    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨:" + data.volume);
    }

    static void showStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태 확인");
        if(data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨:" + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }

}
