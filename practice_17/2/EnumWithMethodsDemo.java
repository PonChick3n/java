// Собственное перечисление
enum Day {
    MONDAY("Рабочий день"),
    TUESDAY("Рабочий день"),
    WEDNESDAY("Рабочий день"),
    THURSDAY("Рабочий день"),
    FRIDAY("Рабочий день"),
    SATURDAY("Выходной"),
    SUNDAY("Выходной");

    private final String description;

    // Конструктор
    Day(String description) {
        this.description = description;
    }

    // Дополнительный метод
    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }

    public String getDescription() {
        return description;
    }
}

public class EnumWithMethodsDemo {
    public static void main(String[] args) {
        for (Day day : Day.values()) {
            System.out.println(day + ": " + day.getDescription() 
                + ", выходной? " + day.isWeekend());
        }
    }
}