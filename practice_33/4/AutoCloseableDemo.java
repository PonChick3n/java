class MyResource implements AutoCloseable {
    public MyResource() {
        System.out.println("Resource opened");
    }

    public void doWork() {
        System.out.println("Working...");
    }

    @Override
    public void close() {
        System.out.println("Resource closed");
    }
}

public class AutoCloseableDemo {
    public static void main(String[] args) {
        try (MyResource r = new MyResource()) {
            r.doWork();
        }
    }
}
