// TIL - Java_Basic.equals() - 2. 구현

package Java_Basic.equals;

public class UserV2 {

    private String id;

    public UserV2(String id) {
        this.id = id;
    }

    /*
    @Override
    public boolean Java_Basic.equals(Object obj) {
        UserV2 user = (UserV2) obj;
        // Null 안전성: id.Java_Basic.equals(user.id)를 사용할 때, id가 null이 아닌 경우에만 Java_Basic.equals() 메서드가 호출됩니다.
        // 만약 id가 null이라면 NullPointerException이 발생할 수 있습니다.
        // 이를 방지하기 위해 id가 null일 경우를 처리하는 로직을 추가하는 것이 좋습니다. 예를 들어:
        boolean result =  id.Java_Basic.equals(user.id);
        return result;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserV2 userV2 = (UserV2) o;
        return id.equals(userV2.id);
    }

}
