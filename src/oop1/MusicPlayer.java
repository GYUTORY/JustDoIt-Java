// TIL : 객체지향 프로그래밍과 캡슐화

package oop1;


/**
 캡슐화
 - MusicPlayer를 보면 음악 플레이어를 구성하기 위한 속성과 기능이 마치 하나의 캡슐에 쌓여있는 것 같다.
 - 속성과 기능을 하나로 묶어서 필요한 기능을 메서드를 통해 외부에 제공하는 것을 캡슐화라고 한다.

 객체지향 프로그래밍 덕분에 음악 플레이어 객체를 사용하는 입장에서 진짜 음악 플레이어를 만들고 사용하는 것 처럼 친숙하게 느겨진다.
 그래서 코드가 더 읽기 쉬운 것은 물론이고, 속성과 기능이 한 곳에 있기 때문에 변경도 더 쉬어진다.
 예를 들어서, MusicPlayer 내부 코드가 변하는 경우에 다른 코드는 변경하지 않아도 된다.

 MusicPlayer의 volume이라는 필드 이름이 다른 이름으로 변한다고 할 때 MusicPlayer를 사요하는 개발자는 코드를 전혀 변경하지 않아도 된다.
 물론 외부에서 호출하는 MusicPlater의 메서드 이름을 변경한다면 MusicPlayer를 사용하는 곳의 코드도 변경해야 한다.

 즉, 캡슐화란 속상과 기능을 하나로 묶어서 필요한 기능을 클래스의 메서드를 통해 외부에 제공하는 것이다.

 까먹지 않게 넘어가는 메모
 클래스 : 객체를 생성하기 위한 설계도이다.
 메서드 : 클래스가 수행할 수 있는 동작(기능)을 정의하는 코드 블록입니다.
 * */
public class MusicPlayer {

        int volume = 0;
        boolean isOn = false;

        void on() {
            isOn = true;
            System.out.println("음악 플레이어를 시작합니다.");
        }

        void off() {
            isOn = false;
            System.out.println("음악 플레이어를 종료합니다.");
        }

        void volumeUp() {
            volume++;
            System.out.println("음악 플레이어 볼륨:" + volume);
        }

        void volumeDown() {
            volume--;
            System.out.println("음악 플레이어 볼륨:" + volume);
        }

        void showStatus() {
            System.out.println("음악 플레이어 상태 확인");
            if(isOn) {
                System.out.println("음악 플레이어 ON, 볼륨:" + volume);
            } else {
                System.out.println("음악 플레이어 OFF");
            }
        }

    
}
