package javamid2.generic.test.ex3;

public class UnitPrinter {

    /*public static <T extends Shuttle> void printV1(T shuttle) {
        BioUnit bioUnit = shuttle.out();
        System.out.println("이름: " + bioUnit.getName() + ", HP: " + bioUnit.getHp());
    }

    public static void printV2(Shuttle shuttle) {
        BioUnit bioUnit = shuttle.out();
        System.out.println("이름: " + bioUnit.getName() + ", HP: " + bioUnit.getHp());
    }*/

    public static <T extends BioUnit> void printV1(Shuttle<T> shuttle) {
        T bioUnit = shuttle.out();
        System.out.println("이름: " + bioUnit.getName() + ", HP: " + bioUnit.getHp());
    }

    public static void printV2(Shuttle<? extends BioUnit> shuttle) {
        BioUnit bioUnit = shuttle.out();
        System.out.println("이름: " + bioUnit.getName() + ", HP: " + bioUnit.getHp());
    }
}
