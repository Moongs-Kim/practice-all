package javabasic.extends1;

public class Movie extends Item{
    private String director;
    private String actor;

    public Movie(String movieName, int price, String director, String actor) {
        super(movieName, price);
        this.director = director;
        this.actor = actor;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 감독: " + director + ", 배우: " + actor);
    }
}
