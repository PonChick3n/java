import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(", ");  // разделитель ", "

        joiner.add("Apple");
        joiner.add("Banana");
        joiner.add("Cherry");

        System.out.println(joiner); 
        // Apple, Banana, Cherry
    }
}
