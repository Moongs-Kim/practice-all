package javaadv2.annotation.basic;

import javaadv2.util.MyLogger;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface AnnoElement {
    String value();
    int count() default 0;
    String[] tags() default {};
    
    //MyLogger data(); // 다른 타입은 적용X
    // 클래스 정보는 가능
    Class<? extends MyLogger> annoData() default MyLogger.class;
}
