package demo;

public class SamePackageTest {
    public static void main(String[] args) {
        Outer outer = new Outer();

        // PUBLIC - доступен
        Outer.PublicInner pub = outer.new PublicInner();
        pub.hello();

        // PROTECTED - доступен, потому что мы в том же пакете
        Outer.ProtectedInner prot = outer.new ProtectedInner();
        prot.hello();

        // DEFAULT - доступен, т.к. мы в том же пакете
        Outer.DefaultInner def = outer.new DefaultInner();
        def.hello();

        // PRIVATE - недоступно!
        // Outer.PrivateInner p = outer.new PrivateInner();  // ошибка
        outer.createPrivate();  // но можно вызвать через метод класса Outer
    }
}
