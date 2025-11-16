public class OperatorsDemo {
    public static void main(String[] args) {

        System.out.println("=== Приоритет операторов: примеры ===");

        // ---------- Базовые типы ----------
        int a = 10, b = 3, c = 0;
        boolean x = true, y = false;
        String s1 = "Hello", s2 = "World";

        System.out.println("\n--- = (присваивание) ---");
        c = a;
        System.out.println("c = a: " + c);

        System.out.println("\n--- +=, -=, *=, /=, %= ---");
        c = 10;
        c += 5;
        System.out.println("c += 5 → " + c);
        c -= 2;
        System.out.println("c -= 2 → " + c);
        c *= 3;
        System.out.println("c *= 3 → " + c);
        c /= 4;
        System.out.println("c /= 4 → " + c);
        c %= 3;
        System.out.println("c %= 3 → " + c);

        // строки можно +=
        s1 += " Java";
        System.out.println("String += : " + s1);

        System.out.println("\n--- ?: (тернарный оператор) ---");
        int t = (a > b) ? a : b;
        System.out.println("(a > b) ? a : b → " + t);

        System.out.println("\n--- ||, && (логические) ---");
        System.out.println("x || y → " + (x || y));
        System.out.println("x && y → " + (x && y));

        System.out.println("\n--- |, ^, & (побитовые) ---");
        System.out.println("a | b → " + (a | b));
        System.out.println("a ^ b → " + (a ^ b));
        System.out.println("a & b → " + (a & b));

        System.out.println("\n--- ==, >, >=, <, <= (сравнение) ---");
        System.out.println("a == b → " + (a == b));
        System.out.println("a > b → " + (a > b));
        System.out.println("a >= b → " + (a >= b));
        System.out.println("a < b → " + (a < b));
        System.out.println("a <= b → " + (a <= b));
        System.out.println("s1 == s2 → " + (s1 == s2)); // сравнение ссылок
        System.out.println("s1.equals(s2) → " + s1.equals(s2)); // корректное сравнение строк

        System.out.println("\n--- >>, >>>, << (сдвиги) ---");
        System.out.println("a >> 1 → " + (a >> 1));
        System.out.println("a >>> 1 → " + (a >>> 1));
        System.out.println("a << 1 → " + (a << 1));

        System.out.println("\n--- +, -, *, /, % (арифметика) ---");
        System.out.println("a + b → " + (a + b));
        System.out.println("a - b → " + (a - b));
        System.out.println("a * b → " + (a * b));
        System.out.println("a / b → " + (a / b));
        System.out.println("a % b → " + (a % b));

        // строка + строка
        System.out.println("s1 + s2 → " + (s1 + s2));

        System.out.println("\n--- ++, -- (инкремент / декремент) ---");
        int k = 5;
        System.out.println("k   = " + k);
        System.out.println("k++ = " + (k++)); // постфикс
        System.out.println("после k++ → " + k);
        System.out.println("++k = " + (++k)); // префикс
        System.out.println("k-- = " + (k--));
        System.out.println("после k-- → " + k);
        System.out.println("--k = " + (--k));

        System.out.println("\n--- ~ и ! ---");
        System.out.println("~a → " + (~a));
        System.out.println("!x → " + (!x));

        System.out.println("\n--- ( ) и [ ] ---");
        int expr1 = 2 + 3 * 4;
        int expr2 = (2 + 3) * 4;
        System.out.println("2 + 3 * 4 = " + expr1);
        System.out.println("(2 + 3) * 4 = " + expr2);

        int[] arr = {10, 20, 30};
        System.out.println("arr[1] → " + arr[1]);
    }
}