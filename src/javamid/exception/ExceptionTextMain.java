package javamid.exception;

public class ExceptionTextMain {

    private static boolean test;
    private static boolean test2;
    private static boolean test3;
    
    public static void main(String[] args) {
        try {
            //문법 되는지 확인 용
            if (test) {
                throw new Exception1("test");
            } else if(test2) {
                throw new Exception2("test");
            } else if(test3){
                throw new Exception3("test");
            } else {
                throw new Exception4("test");
            }
            //Exception3만 부모가 다름 -> 그래도 작성은 가능하네
        } catch (Exception1 | Exception2 | Exception3 | Exception4 e) {

        }
    }
}
