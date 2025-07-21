package javamid.enumeration.refactoring;

public class ClassGradeRefMain6 {

    public static void main(String[] args) {
        int price = 10000;

        Grade[] grades = Grade.values();

        for (Grade grade : grades) {
            printDiscount(grade, price);
        }

    }

    private static void printDiscount(Grade grade, int pirce) {
        System.out.println(grade.name() + " 등급의 할인 금액: " + grade.discount(pirce));
    }
}
