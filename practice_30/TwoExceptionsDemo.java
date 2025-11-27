public class TwoExceptionsDemo {
    public static void main(String[] args) {

        try {
            System.out.println("1) Генерируем и перехватываем ArithmeticException...");
            int a = 10 / 0; // первое исключение
        } catch (ArithmeticException e) {
            System.out.println("Перехвачено: ArithmeticException (деление на ноль)");
        }

        System.out.println("2) Генерируем исключение, которое НЕ будет перехвачено...");

        // второе исключение, здесь нет try/catch -> программа аварийно остановится
        String s = null;
        System.out.println(s.length()); // NullPointerException
    }
}
