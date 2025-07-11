package javabasic.extends1;

public class Album extends Item{
    private String author;

    public Album(String albumName, int price, String author) {
        super(albumName, price);
        this.author = author;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 아티스트: " + author);
    }
}
