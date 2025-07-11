package javabasic.poly;

import javabasic.extends1.Book;
import javabasic.extends1.Item;

public class CastingMain {

    public static void main(String[] args) {
        //다운캐스팅
        Item parent = new Book("JAVA", 10000, "han", "12345");
        //Book child = parent; 다운캐스팅 없이 컴파일 오류
        Book child = (Book) parent; //다운캐스팅
        ((Book) parent).getPrice(); //일시적 다운캐스팅 방법

        //잘못된 다운캐스팅
        Item badParent = new Item("name", 10000);
        // 부모 인스턴스를 자식 타입으로 다운캐스팅 불가 -> ClassCastException 컴파일 오류 발생
        //Book badChild = (Book) badParent; 
        //System.out.println(badChild);
        // 자식 인스턴스를 다운캐스팅 가능

    }
}
