public class InfiniteLoopsDemo {
    public static void main(String[] args) {
        // Бесконечный цикл while
        while (true) {
            System.out.println("Бесконечный цикл while");
            break;
        }

        // Бесконечный цикл do-while
        do {
            System.out.println("Бесконечный цикл do-while");
        } while (true);
    }
}