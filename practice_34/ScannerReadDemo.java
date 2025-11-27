import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerReadDemo {
    public static void main(String[] args) {
        File file = new File("input.txt");

        try (Scanner scanner = new Scanner(file)) {  // try-with-resources - Scanner закрывается автоматически
            while (scanner.hasNextLine()) {         // читаем построчно
                String line = scanner.nextLine();
                System.out.println("Line: " + line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }
    }
}
