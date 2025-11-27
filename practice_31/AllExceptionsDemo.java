class Ex1 extends Exception {}
class Ex2 extends Ex1 {}
class Ex3 extends Ex2 {}

public class AllExceptionsDemo {

    public static void main(String[] args) {

        System.out.println("=== Пример 1: одинаковая обработка разных исключений ===");
        sameHandlingDemo();

        System.out.println("\n=== Пример 2: обработка иерархии исключений ===");
        hierarchyHandlingDemo();
    }

    // -------------------------------------------------
    // Пример 1: Несколько исключений обрабатываются одинаково
    // -------------------------------------------------
    public static void sameHandlingDemo() {
        try {
            if (Math.random() > 0.5) {
                throw new ArithmeticException("Ошибка арифметики");
            } else {
                throw new NullPointerException("Пустая ссылка");
            }
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("Перехвачено одинаково: " +
                    e.getClass().getSimpleName());
        }
    }

    // -------------------------------------------------
    // Пример 2: иерархия исключений Ex1 <- Ex2 <- Ex3
    // -------------------------------------------------
    public static void hierarchyHandlingDemo() {

        for (int i = 1; i <= 3; i++) {
            try {
                if (i == 1) throw new Ex1();
                if (i == 2) throw new Ex2();
                if (i == 3) throw new Ex3();
            }
            catch (Ex3 e) {
                System.out.println("Перехвачено: Ex3");
            }
            catch (Ex2 e) {
                System.out.println("Перехвачено: Ex2");
            }
            catch (Ex1 e) {
                System.out.println("Перехвачено: Ex1");
            }
        }
    }
}
