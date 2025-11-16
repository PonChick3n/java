/**
 * Простые математические операции.
 */
public class MathUtils {

    /**
     * Возвращает квадрат числа.
     *
     * @param x число для возведения в квадрат
     * @return квадрат числа x
     */
    public static int square(int x) {
        return x * x;
    }

    /**
     * Проверяет, является ли число четным.
     *
     * @param number число для проверки
     * @return true если число четное, false если нечетное
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}