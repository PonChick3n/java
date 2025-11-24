package demo;

public class Outer {

    // 1) Публичный внутренний класс - доступен всем
    public class PublicInner {
        public void hello() {
            System.out.println("PublicInner");
        }
    }

    // 2) Защищённый внутренний класс — доступен:
    //    - внутри пакета
    //    - в подклассах
    protected class ProtectedInner {
        public void hello() {
            System.out.println("ProtectedInner");
        }
    }

    // 3) Внутренний класс без модификатора - доступен только в этом пакете
    class DefaultInner {
        public void hello() {
            System.out.println("DefaultInner");
        }
    }

    // 4) Приватный внутренний класс - доступен только внутри Outer
    private class PrivateInner {
        public void hello() {
            System.out.println("PrivateInner");
        }
    }

    // Метод, который создаёт объект private-класса
    public void createPrivate() {
        PrivateInner p = new PrivateInner();
        p.hello();
    }
}
