package package1;

public class BaseClass {

    private int privateField = 1;             // только внутри BaseClass
    int defaultField = 2;                     // внутри package1
    protected int protectedField = 3;         // package1 + подклассы в других пакетах
    public    int publicField = 4;            // доступен везде

    public void printFields() {
        System.out.println("BaseClass:");
        System.out.println("privateField = " + privateField);
        System.out.println("defaultField = " + defaultField);
        System.out.println("protectedField = " + protectedField);
        System.out.println("publicField = " + publicField);
    }
}