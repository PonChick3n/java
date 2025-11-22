class Parent {
    protected int value = 10;

    public Parent(int value) {
        this.value = value;
        System.out.println("Parent constructor: value = " + this.value);
    }

    public void show() {
        System.out.println("Parent show(): value = " + value);
    }
}

class Child extends Parent {
    protected int value = 20;

    public Child(int value) {
        super(value); // 1 - вызов конструктора суперкласса
        System.out.println("Child constructor: value = " + this.value);
    }

    public void display() {
        System.out.println("Child value = " + this.value);
        System.out.println("Parent value = " + super.value); // 2 - доступ к полю суперкласса

        System.out.print("Calling Parent show(): ");
        super.show(); // 3 - вызов метода суперкласса
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        Child c = new Child(100);
        c.display();
    }
}
