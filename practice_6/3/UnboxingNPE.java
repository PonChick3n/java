public class UnboxingNPE {
    public static void main(String[] args) {
        Integer i = null;  // объект-оболочка Integer равен null

        // Попытка автораспаковки в примитив int
        try {
            int x = i;
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }
    }
}