package Java_Basic.construct.ex;

public class Book {
    private String title; //제목
    private String author; //저자
    private int page; //페이지 수

    public Book() {
        this("", "", 0);
    }

    public Book(String title, String author) {
        this(title, author, 0);
    }

    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    public void displayInfo() {
        System.out.println("제목:" + title + ", 저자:" + author + ", 페이지:" + page);
    }
}
