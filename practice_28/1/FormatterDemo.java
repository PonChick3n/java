import java.util.Formatter;
import java.util.Date;

public class FormatterDemo {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();

        boolean boolVal = true;
        int intVal = 123;
        char ch = 'A';
        Date now = new Date();

        fmt.format("Boolean: %b%n", boolVal);      // %b - логическое значение
        fmt.format("Character: %c%n", ch);         // %c - символ
        fmt.format("Integer: %d%n", intVal);       // %d - целое число
        fmt.format("Current time: %tT%n", now);    // %t - формат даты/времени
        fmt.format("Percent sign: %%");            // %% - вывод символа '%'

        System.out.println(fmt.toString());
        fmt.close();
    }
}
