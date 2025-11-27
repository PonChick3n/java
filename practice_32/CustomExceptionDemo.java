// Собственное исключение
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            testValue(-5);
        } catch (MyException e) {
            System.out.println("Перехвачено: " + e.getMessage());
        }
    }

    public static void testValue(int x) throws MyException {
        if (x < 0) {
            throw new MyException("Число не может быть отрицательным: " + x);
        }
        System.out.println("Число корректное: " + x);
    }
}
