package javabasic.poly;

public class DiamondMain {

    public static void main(String[] args) {
        InterfaceA a = new ChildTwoInterface();
        a.methodA();
        a.methodCommon();

        InterfaceB b = new ChildTwoInterface();
        b.methodB();
        b.methodCommon();
    }
}
