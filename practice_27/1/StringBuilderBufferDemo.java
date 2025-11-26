public class StringBuilderBufferDemo {
    public static void main(String[] args) {

        // ---------------- STRINGBUILDER ----------------
        System.out.println("=== StringBuilder Demo ===");

        // 1) append() - добавляет строку в конец
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // "Hello World"
        System.out.println("append(): " + sb);

        // 2) insert() - вставляет строку по индексу
        sb.insert(5, ","); // "Hello, World"
        System.out.println("insert(): " + sb);

        // 3) delete() - удаляет часть строки
        sb.delete(5, 6); // delete символ ','
        System.out.println("delete(): " + sb);

        // 4) reverse() - разворачивает строку
        sb.reverse(); // "dlroW olleH"
        System.out.println("reverse(): " + sb);

        // 5) replace() - заменяет часть строки другой строкой
        sb.reverse(); // вернём обратно
        sb.replace(6, 11, "Java"); // "Hello Java"
        System.out.println("replace(): " + sb);


        // ---------------- STRINGBUFFER ----------------
        System.out.println("\n=== StringBuffer Demo ===");

        // 6) capacity() - текущий размер буфера (не длина строки!)
        StringBuffer buffer = new StringBuffer();
        System.out.println("capacity(): " + buffer.capacity());

        // 7) ensureCapacity() - увеличивает минимальную вместимость буфера
        buffer.ensureCapacity(50);
        System.out.println("ensureCapacity(50): " + buffer.capacity());

        buffer.append("ABCDEF");

        // 8) setCharAt() - заменяет символ по индексу
        buffer.setCharAt(2, 'Z'); // "ABZDEF"
        System.out.println("setCharAt(): " + buffer);

        // 9) substring() - получает подстроку
        String sub = buffer.substring(1, 4); // "BZ D"
        System.out.println("substring(1,4): " + sub);

        // 10) deleteCharAt() - удаляет один символ
        buffer.deleteCharAt(1); // удаляем 'B'
        System.out.println("deleteCharAt(1): " + buffer);
    }
}
