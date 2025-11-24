public class InterfaceNestedClassDemo {

    // ===== интерфейс с вложенным классом =====
    interface MyInterface {

        void doSomething();

        // Вложенный класс - автоматически public и static
        class Helper {
            public void help() {
                System.out.println("MyInterface.Helper.help() called");
            }
        }
    }

    // ===== Класс, реализующий интерфейс =====
    static class Impl implements MyInterface {
        @Override
        public void doSomething() {
            System.out.println("Impl.doSomething() executed");
        }
    }

    // ===== main =====
    public static void main(String[] args) {

        // используем реализацию интерфейса
        MyInterface obj = new Impl();
        obj.doSomething();

        // Создание экземпляра вложенного класса
        MyInterface.Helper helper = new MyInterface.Helper();
        helper.help();
    }
}
