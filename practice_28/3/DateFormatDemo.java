import java.util.Formatter;
import java.util.Date;

public class DateFormatDemo {
    public static void main(String[] args) {
        Date now = new Date();  // текущая дата и время
        Formatter fmt = new Formatter();

        fmt.format("Текущая дата и время:\n");

        fmt.format("Часы (24-формат): %tH%n", now);      // %tH - часы 00-23
        fmt.format("Минуты: %tM%n", now);                 // %tM - минуты 00-59
        fmt.format("Секунды: %tS%n", now);                // %tS - секунды 00-59
        fmt.format("Год (4 цифры): %tY%n", now);          // %tY - год 0000-9999
        fmt.format("Год (2 цифры): %ty%n", now);          // %ty - 00-99

        System.out.println(fmt);
        fmt.close();
    }
}

