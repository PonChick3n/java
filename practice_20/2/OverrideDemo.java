class Animal {
    public void sound() {
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class OverrideDemo {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Dog();
        a.sound();  // вызовет Animal.sound()
        b.sound();  // вызовет Dog.sound()
    }
}
