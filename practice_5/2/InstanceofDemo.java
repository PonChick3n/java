public class InstanceofDemo {
    public static void main(String[] args) {

        Object a = "Hello";
        Object b = 123;
        Object c = null;

        System.out.println(a instanceof String);   // true
        System.out.println(a instanceof Object);   // true

        System.out.println(b instanceof Integer);  // true
        System.out.println(b instanceof Number);   // true

        System.out.println(c instanceof String);   // false
        System.out.println(c instanceof Object);   // false
    }
}