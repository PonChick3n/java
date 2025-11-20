public class FinalInitDemo {

    // 1 - инициализация при объявлении
    static class InitAtDeclaration {
        public final int a = 10;

        void print() {
            System.out.println("InitAtDeclaration.a = " + a);
        }
    }

    // 2 - инициализация в конструкторе
    static class InitInConstructor {
        public final int a;

        public InitInConstructor(int value) {
            this.a = value;
        }

        void print() {
            System.out.println("InitInConstructor.a = " + a);
        }
    }

    // 3 - инициализация в блоке инициализации
    static class InitInBlock {
        public final int a;

        {   
            a = 5; // нестатический блок инициализации
        }

        void print() {
            System.out.println("InitInBlock.a = " + a);
        }
    }

    public static void main(String[] args) {
        InitAtDeclaration obj1 = new InitAtDeclaration();
        InitInConstructor obj2 = new InitInConstructor(42);
        InitInBlock obj3 = new InitInBlock();

        obj1.print();
        obj2.print();
        obj3.print();
    }
}
