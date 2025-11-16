public class DecodeWrappersDemo {
    public static void main(String[] args) {

        // Byte.decode
        Byte b1 = Byte.decode("10");
        Byte b2 = Byte.decode("0xA");
        Byte b3 = Byte.decode("012");
        System.out.println("Byte: " + b1 + ", " + b2 + ", " + b3);

        // Short.decode
        Short s1 = Short.decode("100");
        Short s2 = Short.decode("0x64");
        Short s3 = Short.decode("0144");
        System.out.println("Short: " + s1 + ", " + s2 + ", " + s3);

        // Integer.decode
        Integer i1 = Integer.decode("255");
        Integer i2 = Integer.decode("0xFF");
        Integer i3 = Integer.decode("#FF");
        Integer i4 = Integer.decode("0377");
        System.out.println("Integer: " + i1 + ", " + i2 + ", " + i3 + ", " + i4);

        // Long.decode
        Long l1 = Long.decode("1000");
        Long l2 = Long.decode("0x3E8");
        Long l3 = Long.decode("01750");
        System.out.println("Long: " + l1 + ", " + l2 + ", " + l3);
    }
}