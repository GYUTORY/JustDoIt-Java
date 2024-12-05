// TIL - final 정리

package Java_Basic._final.ex;

public class Member {

    private final String id; // final 키워드 사용
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void changeData(String name) {
        // this.id = id; final 변수 변경 불가능 --> 컴파일 오류 발생
        this.name = name;
    }


    public void print() {
        System.out.println("id:" + id + ", name:" + name);
    }


}
