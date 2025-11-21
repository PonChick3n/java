class Calculator {

    // Метод для суммы двух чисел
    public int sum(int a, int b) {
        return a + b;
    }

    // Перегруженный метод: сумма трёх чисел
    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Перегруженный метод с varargs: сумма произвольного кол-ва чисел
    public int sum(int... numbers) {
        int s = 0;
        for (int n : numbers) {
            s += n;
        }
        return s;
    }
}

public class VarargsDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.sum(2, 3));          // вызывает sum(int, int)
        System.out.println(calc.sum(1, 2, 3));       // вызывает sum(int, int, int)
        System.out.println(calc.sum(5, 5, 5, 5, 5)); // вызывает sum(int... numbers)
    }
}