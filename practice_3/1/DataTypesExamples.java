public class DataTypesExamples {
    public static void main(String[] args) {

        byte byteExample = 100;
        byte byteZero = 0;
        
        short shortExample = 30000;
        short shortZero = 0;
        
        int intExample = 2000000000;
        int intZero = 0;
        
        long longExample = 9000000000000000000L;
        long longZero = 0L;
        
        float floatExample = 3.14f;
        float floatZero = 0.0f;
        
        double doubleExample = 3.14159265359;
        double doubleZero = 0.0;
        
        char charExample = 'A';
        char charZero = 0;
        
        boolean booleanExample = true;
        boolean booleanFalse = false;
        
        System.out.println("Целочисленные типы:");
        System.out.println("byte: " + byteExample + ", нуль: " + byteZero);
        System.out.println("short: " + shortExample + ", нуль: " + shortZero);
        System.out.println("int: " + intExample + ", нуль: " + intZero);
        System.out.println("long: " + longExample + ", нуль: " + longZero);
        
        System.out.println("\nТипы с плавающей точкой:");
        System.out.println("float: " + floatExample + ", нуль: " + floatZero);
        System.out.println("double: " + doubleExample + ", нуль: " + doubleZero);
        
        System.out.println("\nСимвольный тип:");
        System.out.println("char: '" + charExample + "', нуль: '" + charZero + "' (невидимый)");
        
        System.out.println("\nБулевский тип:");
        System.out.println("boolean: " + booleanExample + ", false: " + booleanFalse);
    }
}