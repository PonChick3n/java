package package2;

import package1.BaseClass;

public class TestInOtherPackage {

    public static void main(String[] args) {

        BaseClass obj = new BaseClass();

        // System.out.println(obj.privateField);   // недоступно
        // System.out.println(obj.defaultField);   // другой пакет
        // System.out.println(obj.protectedField); // НЕ через наследование
        System.out.println(obj.publicField);       // доступно

        ChildClass child = new ChildClass();
        child.test();
    }
}
