package extends1.ex;

public abstract class Item {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public void print() {
        System.out.println("이름: " + this.name + ", 가격: " + this.price);
    }

}

