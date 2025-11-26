public class ExceptionsDemo {

    public static void main(String[] args) {

        // -----------------------------
        // 1. ArithmeticException
        // -----------------------------
        try {
            int a = 10 / 0; // Деление на ноль
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: деление на ноль!");
        }

        // -----------------------------
        // 2. ArrayIndexOutOfBoundsException
        // -----------------------------
        int[] arr = {1, 2, 3};
        try {
            int x = arr[10]; // индекс за пределами массива
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: выход за пределы массива!");
        }

        // -----------------------------
        // 3. IllegalArgumentException
        // -----------------------------
        try {
            setAge(-1); // Некорректный аргумент
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }

        // -----------------------------
        // 4. ClassCastException
        // -----------------------------
        try {
            Object obj = "Hello";
            Integer num = (Integer) obj; // Неправильное приведение типов
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: неправильное приведение типов!");
        }

        // -----------------------------
        // 5. NullPointerException
        // -----------------------------
        try {
            String s = null;
            s.length(); // Вызов метода у null
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: объект равен null!");
        }
    }


    // Метод для демонстрации IllegalArgumentException
    static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным!");
        }
        System.out.println("Возраст установлен: " + age);
    }
}
