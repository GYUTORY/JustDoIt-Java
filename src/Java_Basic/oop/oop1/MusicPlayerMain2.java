package Java_Basic.oop.oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();



        // 음악 플레이어 켜기
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");

        //볼륨증가
        data.volume++;
        System.out.println("음악 플레이어 볼륨:" + data.volume);
        //볼륨증가
        data.volume++;
        System.out.println("음악 플레이어 볼륨:" + data.volume);
        //볼륨감소
        data.volume--;
        System.out.println("음악 플레이어 볼륨:" + data.volume);

        // 음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인");
        if(data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨:" + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }

        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
}
