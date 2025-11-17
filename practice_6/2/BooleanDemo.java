public class BooleanDemo {
    public static void main(String[] args) {

        // --- 1. Конструкторы ---
        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean("true");
        System.out.println("Constructors: " + b1 + ", " + b2);

        // --- 2. Boolean.valueOf() ---
        Boolean b3 = Boolean.valueOf(true);
        Boolean b4 = Boolean.valueOf(false);
        Boolean b5 = Boolean.valueOf("true");
        Boolean b6 = Boolean.valueOf("FALSE");
        System.out.println("valueOf: " + b3 + ", " + b4 + ", " + b5 + ", " + b6);

        // --- 3. Boolean.parseBoolean() + автоупаковка ---
        Boolean b7 = Boolean.parseBoolean("true");
        Boolean b8 = Boolean.parseBoolean("no");  // false
        System.out.println("parseBoolean: " + b7 + ", " + b8);

        // --- 4. Константы Boolean.TRUE / Boolean.FALSE ---
        Boolean b9 = Boolean.TRUE;
        Boolean b10 = Boolean.FALSE;
        System.out.println("Constants: " + b9 + ", " + b10);

        // --- 5. Автоупаковка (autoboxing) ---
        Boolean b11 = true;
        Boolean b12 = false;
        System.out.println("Autoboxing: " + b11 + ", " + b12);
    }
}