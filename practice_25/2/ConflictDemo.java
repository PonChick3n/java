interface A {
    default void hello() {
        System.out.println("Hello from A");
    }
}

interface B {
    default void hello() {
        System.out.println("Hello from B");
    }
}

class MyClass implements A, B {

    @Override
    public void hello() {
        System.out.println("Resolving conflict...");
        A.super.hello();   // вызов реализации интерфейса A
        B.super.hello();   // вызов реализации интерфейса B
    }
}

public class ConflictDemo {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.hello();
    }
}
