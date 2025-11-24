class Outer {
    private int privateField = 10;
    int defaultField = 20;
    protected int protectedField = 30;
    public int publicField = 40;

    void outerMethod() {
        System.out.println("Outer method");
    }

    class Inner {
        void printFields() {
            // доступ ко всем полям внешнего класса
            System.out.println(privateField);
            System.out.println(defaultField);
            System.out.println(protectedField);
            System.out.println(publicField);

            // вызов метода внешнего класса
            outerMethod();
        }
    }
}

public class OuterInnerDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.printFields();
    }
}