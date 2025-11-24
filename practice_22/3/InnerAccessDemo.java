class Outer {

    // ===== 1. private inner class =====
    private class PrivateInner {
        private int secret = 111;
        private void showSecret() {
            System.out.println("PrivateInner.secret = " + secret);
        }
    }

    // ===== 2. default (package-private) inner class =====
    class DefaultInner {
        String msg = "Hello from DefaultInner";
    }

    // ===== 3. protected inner class =====
    protected class ProtectedInner {
        protected int number = 222;
    }

    // ===== 4. public inner class =====
    public class PublicInner {
        public String info = "PublicInner data";
        private void privateInfo() {
            System.out.println("Private method inside PublicInner");
        }
    }

    // ===== Метод внешнего класса, проверяющий доступ =====
    void testAccess() {
        System.out.println("=== Testing access from Outer ===");

        // 1. Доступ к private inner class
        PrivateInner p = new PrivateInner();
        System.out.println(p.secret); // доступ к private полю
        p.showSecret();               // доступ к private методу

        // 2. Доступ к default inner class
        DefaultInner d = new DefaultInner();
        System.out.println(d.msg);

        // 3. Доступ к protected inner class
        ProtectedInner pr = new ProtectedInner();
        System.out.println(pr.number);

        // 4. Доступ к public inner class (включая private метод)
        PublicInner pub = new PublicInner();
        System.out.println(pub.info);
        pub.privateInfo(); // можно вызвать private метод
    }
}

public class InnerAccessDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.testAccess();
    }
}
