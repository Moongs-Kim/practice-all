package javabasic.extends1;

public class Book extends Item {
    private String author;
    private String bookCode;

    public Book(String bookName, int price, String author, String bookCode) {
        super(bookName, price);
        this.author = author;
        this.bookCode = bookCode;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 저자: " + author + ", 가격: " + bookCode);
    }
}
