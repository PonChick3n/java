package package2;

import package1.BaseClass;

public class ChildClass extends BaseClass {
    public void test() {

        // System.out.println(privateField);   // недоступен
        // System.out.println(defaultField);   // другой пакет
        System.out.println(protectedField);     // доступно - наследование
        System.out.println(publicField);        // доступно
    }
}
