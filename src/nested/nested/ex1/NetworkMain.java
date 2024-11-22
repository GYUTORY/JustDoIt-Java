package nested.nested.ex1;

public class NetworkMain {

    public static void main(String[] args) {
        // Network를 생성하고 network.sendMessage()를 통해 메시지를 전달한닥.
        // NetworkMain은 오직 Network 클래스만 사용한다. NetworkMessage 클래스는 전혀 사용하지 않는다.
        // -> NetworkMessage는 오직 Network 내부에서만 사용된다.
        Network network = new Network();
        network.sendMessage("hello java");
    }
}
