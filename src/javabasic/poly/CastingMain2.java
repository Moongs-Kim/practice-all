package javabasic.poly;

public class CastingMain2 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        Parent parent2 = new Child();
        //call(parent1);
        //call(parent2);
        call2(parent1);
        call2(parent2);

    }

    static void call(Parent parent) {
        parent.parentMethod();
        if (parent instanceof Child) {
            Child child = (Child) parent;
            child.childMethod();
        }
    }
    
    //자바 16 - Pattern Matching for instanceof
    static void call2(Parent parent) {
        parent.parentMethod();
        // 자동으로 child 변수에 Child 타입으로 다운캐스팅 해줌
        if (parent instanceof Child child) {
            //Child child = (Child) parent; // 인스턴스가 맞는 경우 직접 다운캐스팅 할 필요 없음
            child.childMethod();
        }
    }
}
