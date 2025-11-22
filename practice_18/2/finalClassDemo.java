// Финальный класс - запрещает наследование
final class A {
    public void hello() {
        System.out.println("Hello from A");
    }
}

// Попытка наследования
class B extends A {   // Ошибка компиляции
}

public class finalClassDemo {
    public static void main(String[] args) {
        A a = new A();
        a.hello();
    }
}