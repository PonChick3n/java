import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteDemo {
    public static void main(String[] args) {
        try (OutputStream out = new FileOutputStream("output.txt")) {

            // Метод write(int) записывает 1 байт (младшие 8 бит аргумента int)
            out.write(72);  // 'H'
            out.write(101); // 'e'
            out.write(108); // 'l'
            out.write(108); // 'l'
            out.write(111); // 'o'

            System.out.println("Запись завершена.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
