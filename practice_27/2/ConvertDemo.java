public class ConvertDemo {
    public static void main(String[] args) {

        String s = "Hello";

        // String -> StringBuilder / StringBuffer
        StringBuilder sb = new StringBuilder(s);
        StringBuffer buf = new StringBuffer(s);

        // StringBuilder -> String
        String s1 = sb.toString();

        // StringBuffer -> String
        String s2 = buf.toString();

        // StringBuilder -> StringBuffer
        StringBuffer buf2 = new StringBuffer(sb.toString());
        StringBuffer buf3 = new StringBuffer().append(sb);

        // StringBuffer -> StringBuilder
        StringBuilder sb2 = new StringBuilder(buf.toString());
        StringBuilder sb3 = new StringBuilder().append(buf);

        System.out.println("Conversions completed.");
    }
}
