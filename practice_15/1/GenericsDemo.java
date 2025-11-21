import java.util.*;

public class GenericsDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // Проверки instanceof
        System.out.println(list instanceof List);       // true
        System.out.println(list instanceof ArrayList);  // true
        System.out.println(list instanceof LinkedList); // false
    }
}