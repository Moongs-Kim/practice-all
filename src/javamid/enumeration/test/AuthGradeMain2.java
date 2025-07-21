package javamid.enumeration.test;

import java.util.Scanner;

public class AuthGradeMain2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]:");
            String inputAuthGrade = scanner.nextLine();
            printGrade(inputAuthGrade);
        }

    }

    private static void printGrade(String inputAuthGrade) {
        AuthGrade authGrade = AuthGrade.valueOf(inputAuthGrade);
        System.out.println("당신의 등급은 " + authGrade.getDescription() + "입니다.");

        System.out.println("==메뉴 목록==");
        //menuList(authGrade);
        if (authGrade.getLevel() > 0) {
            System.out.println("- 메인 화면");
        }

        if (authGrade.getLevel() > 1) {
            System.out.println("- 이메일 관리 화면");
        }

        if (authGrade.getLevel() > 2) {
            System.out.println("- 관리자 화면");
        }
    }

    private static void menuList(AuthGrade authGrade) {
        if ("GUEST".equals(authGrade.name())) {
            System.out.println("- 메인 화면");
        } else if ("LOGIN".equals(authGrade.name())) {
            System.out.println("- 메인 화면");
            System.out.println("- 이메일 관리 화면");
        } else if ("ADMIN".equals(authGrade.name())) {
            System.out.println("- 메인 화면");
            System.out.println("- 이메일 관리 화면");
            System.out.println("- 관리자 화면");
        }
    }


}
