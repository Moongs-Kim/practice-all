package javamid.enumeration.refactoring;

public class ClassGradeRefMain5 {

    public static void main(String[] args) {
        int price = 10000;

        printDiscount(Grade.BASIC, price);
        printDiscount(Grade.GOLD, price);
        printDiscount(Grade.DIAMOND, price);
    }

    private static void printDiscount(Grade grade, int pirce) {
        System.out.println(grade.name() + " 등급의 할인 금액: " + grade.discount(pirce));
    }
}
