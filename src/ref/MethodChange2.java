package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        // Data 인스턴스를 생성하고, 참조값을 dataA 변수에 담고 value에 숫자 10을 할당한 상태
        Data dataA = new Data();
        dataA.value = 10;


        System.out.println("메서드 호출 전: dataA.value = " + dataA.value); // 10
        changeReference(dataA);
        System.out.println("메서드 호출 전: dataA.value = " + dataA.value); // 20
    }

    // 메서드를 호출할 때 매개변수 dataX에 변수 dataA의 값을 전달한다.
    // 변수 dataA는 참조값 x001을 가지고 있으므로 참조값 복사해서 전달했다. -> 즉, dataX도 참조값 x001을 가지고 있다.
    public static void changeReference(Data dataX) {
        // 참조값을 통해, x001 인스턴스에 접근하고 그 안에 있는 value의 값을 20으로 변경했다.
        dataX.value = 20;
    }
}
