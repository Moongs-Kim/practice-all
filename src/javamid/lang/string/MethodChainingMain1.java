package javamid.lang.string;

public class MethodChainingMain1 {

    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        adder.add(1);
        adder.add(2);
        adder.add(3);
        adder.add(4);
        int result = adder.getValue();
        System.out.println("result = " + result);
    }
}
