class Animal {
    public void sound() {
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal {
    @Override
    public void soud() {   // ошибка компиляции из-за несовпадения имён
        System.out.println("Dog barks");
    }
}