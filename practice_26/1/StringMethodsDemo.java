public class StringMethodsDemo {
    public static void main(String[] args) {

        String s = "Hello World";
        String s2 = "  Java  ";

        // 1. length() - возвращает длину строки
        System.out.println("1. length(): " + s.length());

        // 2. charAt(int index) - возвращает символ по индексу
        System.out.println("2. charAt(1): " + s.charAt(1));  // 'e'

        // 3. substring(int begin, int end) - выделяет подстроку
        System.out.println("3. substring(0, 5): " + s.substring(0, 5)); // "Hello"

        // 4. toLowerCase() - строка в нижнем регистре
        System.out.println("4. toLowerCase(): " + s.toLowerCase());

        // 5. toUpperCase() - строка в верхнем регистре
        System.out.println("5. toUpperCase(): " + s.toUpperCase());

        // 6. trim() - удаляет пробелы в начале и конце строки
        System.out.println("6. trim(): '" + s2.trim() + "'");

        // 7. contains(CharSequence cs) - проверяет, входит ли подстрока
        System.out.println("7. contains(\"World\"): " + s.contains("World"));

        // 8. indexOf(String str) - индекс первого вхождения подстроки
        System.out.println("8. indexOf(\"o\"): " + s.indexOf("o")); // 4

        // 9. replace(CharSequence old, CharSequence new) - замена подстроки
        System.out.println("9. replace(\"World\", \"Java\"): " + s.replace("World", "Java"));

        // 10. split(String regex) - разбивает строку по разделителю
        String[] arr = "a,b,c".split(",");
        System.out.print("10. split(): ");
        for (String item : arr) {
            System.out.print(item + " ");  // a b c
        }
        System.out.println();
    }
}
