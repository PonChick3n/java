public class SwitchTest {

    enum Day { MON, TUE, WED }

    public static void main(String[] args) {

        // 1. byte
        byte b = 1;
        switch (b) {
            case 1: System.out.println("byte: 1"); break;
        }

        // 2. short
        short s = 2;
        switch (s) {
            case 2: System.out.println("short: 2"); break;
        }

        // 3. char
        char c = 'A';
        switch (c) {
            case 'A': System.out.println("char: A"); break;
        }

        // 4. int
        int i = 3;
        switch (i) {
            case 3: System.out.println("int: 3"); break;
        }

        // 5. Integer (автораспаковка)
        Integer ii = 4;
        switch (ii) {
            case 4: System.out.println("Integer: 4"); break;
        }

        // 6. String
        String str = "hello";
        switch (str) {
            case "hello": System.out.println("String: hello"); break;
        }

        // 7. enum
        Day d = Day.TUE;
        switch (d) {
            case TUE: System.out.println("enum: TUE"); break;
        }

        // 8. var (если тип допустимый)
        var x = 5; // int - OK
        switch (x) {
            case 5: System.out.println("var(int): 5"); break;
        }
    }
}