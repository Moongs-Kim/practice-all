package javamid.lang.immutable.test;

public class ImmutableMyDate {

    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public ImmutableMyDate setYear(int year) {
        return new ImmutableMyDate(year, month, day);
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
