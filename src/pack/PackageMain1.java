// TIL - 패키지 시작

/***
 사용자와 같은 위치
 1. PackageMain1과 같은 Data는 같은 pack이라는 패키지에 소속되어 있다.
 -> 이렇게 같은 패키지에 있는 경우에는 패키지 경로를 생략해도 된다.

 사용자와 다른 위치
 - PackageMain1과 User는 서로 다른 패키지다.
 -> 이렇게 패키지가 다르면 pack.a.User와 같이 패키지 전체 경로를 포함해서 클래스를 적어주어야 한다.
  */


package pack;

public class PackageMain1 {
    public static void main(String[] args) {
        Data data = new Data();
        pack.a.User uaer = new pack.a.User();
    }
}
