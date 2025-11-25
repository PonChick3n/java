public class AnnotationsDemo {

    // ---------------------------
    //      @Deprecated
    // ---------------------------
    @Deprecated
    public void oldMethod() {
        System.out.println("Old method (deprecated)");
    }

    public void newMethod() {
        System.out.println("New method");
    }


    // ---------------------------
    //      @Override
    // ---------------------------
    static class Parent {
        public void show() {
            System.out.println("Parent show()");
        }
    }

    static class Child extends Parent {

        @Override
        public void show() {
            System.out.println("Child show()");
        }

        // Ошибка была бы здесь, если написать:
        // @Override
        // public void sh0w() { }  // нет такого метода
    }


    // ---------------------------
    //      @SuppressWarnings
    // ---------------------------
    @SuppressWarnings({"deprecation", "unchecked", "rawtypes"})
    public static void demoSuppress() {
        AnnotationsDemo d = new AnnotationsDemo();

        // использование deprecated метода -> предупреждение подавлено
        d.oldMethod();

        // пример unchecked / rawtypes
        java.util.List list = new java.util.ArrayList();
        list.add("Hello");
        list.add(123);
        System.out.println("Raw list = " + list);
    }


    // ---------------------------
    //             main
    // ---------------------------
    public static void main(String[] args) {
        System.out.println("--- @Override Demo ---");
        Parent p = new Child();
        p.show(); // вызов переопределённого метода

        System.out.println("\n--- @Deprecated Demo ---");
        AnnotationsDemo d = new AnnotationsDemo();
        d.oldMethod(); // даст предупреждение, если не подавлено

        System.out.println("\n--- @SuppressWarnings Demo ---");
        demoSuppress();
    }
}
