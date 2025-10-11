class Bird {
    public void fly() {
        System.out.println("The bird is flying!");
    }
}

class Eagle extends Bird {
    @Override
    public void fly() {
        System.out.println("The eagle is flying!");
    }
}

class Parrot extends Bird {
    @Override
    public void fly() {
        System.out.println("The parrot is flying!");
    }
}

public class Main {
    public static void main(String[] args) {
        Bird bird1 = new Eagle();
        Bird bird2 = new Parrot();

        bird1.fly();
        bird2.fly();
    }
}