package javamid.enumeration.refactoring;

public class DiscountService {

    public int discount(ClassGrade classGrade, int price) {
        return price * classGrade.getDiscountPercent() / 100;
    }

    public int discount(Grade grade, int price) {
        return price * grade.getDiscountPercent() / 100;
    }
}
