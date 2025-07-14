package javamid.enumeration;

public class ClassGrade {
    public static final ClassGrade BASIC = new ClassGrade();
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();

    // 이 방식은 외부에서 임의의 ClassGrade의 인스턴스를 생성할 수 있다는 문제가 있음
    // 따라서 private 생성자 추가
    private ClassGrade() {}
}
