package javaadv2.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ConstructV2 {

    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("javaadv2.reflection.data.BasicData");

        Constructor<?> constructor = aClass.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);
        Object instance = constructor.newInstance("hello");
        System.out.println("instance = " + instance);

        Method method = aClass.getDeclaredMethod("call");
        method.invoke(instance);
    }
}
