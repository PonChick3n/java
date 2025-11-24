package other;
import demo.Outer;

public class OtherPackageTest {
    public static void main(String[] args) {
        Outer outer = new Outer();

        // PUBLIC - доступен везде
        Outer.PublicInner pub = outer.new PublicInner();
        pub.hello();

        // PROTECTED - доступен только в наследниках, не в обычных классах
        // Outer.ProtectedInner prot = outer.new ProtectedInner(); // ошибка

        // DEFAULT - недоступен, т.к. другой пакет
        // Outer.DefaultInner def = outer.new DefaultInner(); // ошибка

        // PRIVATE - недоступен нигде вне Outer
        // Outer.PrivateInner p = outer.new PrivateInner();   // ошибка
    }
}