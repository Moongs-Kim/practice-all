package javamid.enumeration.refactoring;

public class DiscountService2 {

    public int discount(ClassGrade classGrade, int price) {
        return price * classGrade.getDiscountPercent() / 100;
    }

    public int discount(Grade grade, int price) {
        return grade.discount(price);
    }
}
