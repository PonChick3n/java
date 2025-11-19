public class OverloadingOverridingDemo {

    // Перегрузка
    static class MathUtils {

        int sum(int a, int b) {
            return a + b;
        }

        double sum(double a, double b) {
            return a + b;
        }

        int sum(int a, int b, int c) {
            return a + b + c;
        }
    }

    // Переопределение
    static class Animal {
        void speak() {
            System.out.println("Animal speaks");
        }
    }

    static class Dog extends Animal {
        @Override
        void speak() {
            System.out.println("Dog barks");
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Перегрузка методов ===");
        MathUtils m = new MathUtils();
        System.out.println(m.sum(2, 3));          // int+int
        System.out.println(m.sum(2.5, 3.1));      // double+double
        System.out.println(m.sum(1, 2, 3));       // 3 параметра

        System.out.println("\n=== Переопределение методов ===");
        Animal a = new Animal();
        Animal d = new Dog();

        a.speak(); // Animal speaks
        d.speak(); // Dog barks
    }
}