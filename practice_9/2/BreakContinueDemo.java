public class BreakContinueDemo {
    public static void main(String[] args) {

        System.out.println("Пример работы continue:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // пропускаем число 3
            }
            System.out.println("i = " + i);
        }

        System.out.println("\nПример работы break:");
        int j = 1;
        while (true) {
            System.out.println("j = " + j);

            if (j == 4) {
                break; // выходим из цикла полностью
            }

            j++;
        }
    }
}