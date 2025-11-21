class Car {

    enum Type {
        SEDAN("Легковой"),
        SUV("Внедорожник"),
        TRUCK("Грузовик");

        private final String description;

        Type(String description) {
            this.description = description;
        }
    }

    private Type type;

    public Car(Type type) {
        this.type = type;
    }

    public void printType() {
        System.out.println("Тип машины: " + type);
    }

}

public class EnumDemo {
    public static void main(String[] args) {
        Car car = new Car(Car.Type.SEDAN);
        car.printType();
    }
}
