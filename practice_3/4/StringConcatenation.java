class Person {
    String name;
    
    public Person(String name) {
        this.name = name;
    }
}

public class StringConcatenation {
    public static void main(String[] args) {
        String name = "Артём";
        int age = 20;
        String message1 = name + " возраст: " + age;
        System.out.println(message1);

        Person person = new Person("Артём");
        String nameString = "Человек ";
        System.out.println(nameString + person);
    }
}