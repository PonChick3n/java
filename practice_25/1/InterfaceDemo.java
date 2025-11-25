interface MyInterface {

    // default - единственный способ сделать неабстрактный метод в интерфейсе
    default void defaultMethod() {
        System.out.println("Default method from MyInterface");
    }

    // static - статический метод интерфейса
    static void staticMethod() {
        System.out.println("Static method from MyInterface");
    }
}

// Класс, реализующий интерфейс
class MyClass implements MyInterface {
    // можно не переопределять default-метод - он уже реализован в интерфейсе
}

public class InterfaceDemo {
    public static void main(String[] args) {

        MyClass obj = new MyClass();

        System.out.println("--- Вызов default-метода ---");
        // 1) Вызов через объект класса, реализующего интерфейс
        obj.defaultMethod();

        // 2) Вызов через переменную типа интерфейса
        MyInterface ref = obj;
        ref.defaultMethod();

        System.out.println("\n--- Вызов static-метода ---");
        // 3) Единственный корректный способ - через имя интерфейса
        MyInterface.staticMethod();

        // НЕЛЬЗЯ так (ошибка):
        // obj.staticMethod();
        // ref.staticMethod();
    }
}
