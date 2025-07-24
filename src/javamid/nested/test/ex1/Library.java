package javamid.nested.test.ex1;

public class Library {

    private Book[] books;
    private int count;

    public Library(int size) {
        this.books = new Book[size];
    }

    public void addBook(String title, String author) {
        if (count >= books.length) {
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }
        books[count++] = new Book(title, author);
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (int i = 0; i < count; i++) {
            System.out.println("도서 제목: " + books[i].title + ", 저자: " + books[i].author);
        }
        /*for (int i = 0; i < count; i++) {
            System.out.println("도서 제목: " + books[i].getTitle() + ", 저자: " + books[i].getAuthor());
        }*/
    }

    static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        // private 접근자에 접근 가능
        // 불필요한 getter 제공 안해도됨
        /*public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }*/
    }
}
