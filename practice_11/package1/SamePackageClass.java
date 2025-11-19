package package1;

public class SamePackageClass {
    public void test() {
        BaseClass obj = new BaseClass();

        // System.out.println(obj.privateField); // недоступно
        System.out.println(obj.defaultField);    // доступно - один пакет
        System.out.println(obj.protectedField);  // доступно - один пакет
        System.out.println(obj.publicField);     // доступно
    }
}