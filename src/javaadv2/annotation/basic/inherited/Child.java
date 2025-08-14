package javaadv2.annotation.basic.inherited;

public class Child extends Parent{
    //@InheritedAnnotation 애노테이션을 상속 받는다.
    //@InheritedAnnotation <- @Inherited 메타 애노테이션이 붙어있다.

    //@NoInheritedAnnotation 상속 받지 못한다.
    //@NoInheritedAnnotation <- @Inherited 메타 애노테이션이 붙어있지 않다.

}
