public class TestCalls {

    public static class A {
        public static int a = 1;
        public static int b = 2;

        public static void printVars() {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }

        // Вызов внутри статического метода
        public static void testInsideStatic() {
            System.out.println("Вызовы внутри статического метода A.testInsideStatic():");
            printVars();      // 1 - просто по имени
            A.printVars();    // 2 - через имя класса
        }

        // Вызов внутри нестатического метода
        public void testInsideNonStatic() {
            System.out.println("Вызовы внутри нестатического метода A.testInsideNonStatic():");
            printVars();      // 3 - просто по имени
            A.printVars();    // 4 - через имя класса
        }
    }

    public static void main(String[] args) {

        System.out.println("1. Вызов по имени класса:");
        A.printVars();   // 5 - стандартный способ

        System.out.println("\n2. Вызов через объект:");
        A obj = new A();
        obj.printVars();  // 6 - допустимо, но не рекомендуется

        System.out.println("\n3. Вызовы внутри самого класса A:");

        A.testInsideStatic();   // вызовы 1 и 2 внутри статического метода класса A
        obj.testInsideNonStatic(); // вызовы 3 и 4 внутри нестатического метода класса A
    }
}