class A {
    public final void finalMethod() {
        System.out.println("Final method in A");
    }
}

class B extends A {

    // Попытка переопределения final-метода
    @Override
    public void finalMethod() {   // Ошибка компиляции
        System.out.println("Trying to override final method in B");
    }
}

public class finalMethod {
    public static void main(String[] args) {
        A a = new A();
        a.finalMethod();
    }
}