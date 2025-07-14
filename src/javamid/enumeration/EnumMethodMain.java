package javamid.enumeration;

import java.util.Arrays;

public class EnumMethodMain {

    public static void main(String[] args) {

        // 모든 ENUM 반환
        Grade[] values = Grade.values();
        System.out.println("values = " + Arrays.toString(values));
        // 참고 Arrays.toString() -> 배열의 참조값이 아니라 배열 내부의 값을 출력할 때 사용

        for (Grade value : values) {
            System.out.println("name= " + value.name() + ", ordinal= " + value.ordinal());
        }

        //Integer.valueOf() -> Integer 객체 반환
        //래퍼 클래스의 valueOf() 같이 ENUM의 해당 객체(상수=객체) 반환 / 상수(객체)와 상수 이름은 다르다
        //String -> ENUM 변환, 잘못된 문자면 IllegalArgumentException 발생
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        // toString()으로 출력
        // toString() 오버라이딩 가능
        System.out.println("gold = " + gold); 
        
    }
}
