package javamid.lang.string;

public class MethodChainingMain2 {

    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        ValueAdder adder1 =  adder.add(1);
        ValueAdder adder2 =  adder.add(2);
        ValueAdder adder3 =  adder.add(3);
        ValueAdder adder4 =  adder.add(4);
        int result = adder4.getValue();
        System.out.println("result = " + result);
    }
}
