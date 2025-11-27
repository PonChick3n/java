import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadDemo {
    public static void main(String[] args) {
        try (InputStream in = new FileInputStream("example.txt")) {

            int byteData; 
            // Метод read() читает 1 байт и возвращает его как int от 0 до 255.
            // Возвращает -1, если достигнут конец файла.

            while ((byteData = in.read()) != -1) {
                System.out.println("Прочитан байт: " + byteData + "  символ: '" + (char) byteData + "'");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
