package javamid.enumeration.test;

public class AuthGradeMain1 {

    public static void main(String[] args) {
        AuthGrade[] authGrades = AuthGrade.values();

        for (AuthGrade authGrade : authGrades) {
            printAuthState(authGrade);
        }

    }

    private static void printAuthState(AuthGrade authGrade) {
        System.out.println("grade=" + authGrade.name() + ", level=" + authGrade.getLevel() +
                ", 설명=" + authGrade.getDescription());
    }
}
